package org.generation.italy.netflixJaita.controller;


import java.time.LocalDate;
import java.util.ArrayList;

import org.generation.italy.netflixJaita.model.Proiezioni;
import org.generation.italy.netflixJaita.repository.ProiezioniRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/Proiezioni")
public class ProiezioniController {
	
	@Autowired		
	ProiezioniRepository proiezioniRepository;
	
	@GetMapping			
	@ResponseBody
	public String index() {
		return "Benvenuto nella cineteca!";
	
	}
		
		@GetMapping("/elencofilm")			
		@ResponseBody
		public String elencoProiezioni(
				@RequestParam(required = false) String titolo,
				@RequestParam(required = false) String tipologia, 
				@RequestParam(required = false) String genere,
			    @RequestParam(required = false) int durata,
			    @RequestParam(required = false) LocalDate annoProduzione) throws Exception {
		
			ArrayList<Proiezioni> elencoProiezioni=null;
			if (titolo==null && tipologia==null)
				elencoProiezioni=(ArrayList<Proiezioni>) proiezioniRepository.findAll();	
			else if (titolo!=null && tipologia==null)
				elencoProiezioni=(ArrayList<Proiezioni>) proiezioniRepository.findByTitoloIgnoreCaseLike("%"+titolo+"%");
			else if (tipologia!=null && titolo==null)
				elencoProiezioni=(ArrayList<Proiezioni>) proiezioniRepository.findByTipologiaIgnoreCase(tipologia);
			else if (genere!=null && titolo==null)
				elencoProiezioni=(ArrayList<Proiezioni>) proiezioniRepository.findByTipologiaIgnoreCase(tipologia);
			else if(annoProduzione!=null)
				elencoProiezioni=(ArrayList<Proiezioni>) proiezioniRepository.findByAnnoProduzioneBetween(annoProduzione,annoProduzione);
		
			elencoProiezioni=
					(ArrayList<Proiezioni>) proiezioniRepository
						.findByTitoloIgnoreCaseAndTipologiaLike(titolo,"%"+tipologia+"%");
		
			
			
			StringBuilder elenco=new StringBuilder();
			elenco.append("Numero Film: "+elencoProiezioni.size());
			elenco.append("<br><br>");
			for (Proiezioni p:elencoProiezioni)
				elenco.append(p.toString()+ "<br>");
			return elenco.toString();
		}
		

}
