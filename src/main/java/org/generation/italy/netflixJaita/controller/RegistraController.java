package org.generation.italy.netflixJaita.controller;

import java.util.List;

import org.generation.italy.netflixJaita.repository.RegistiRepository;
import org.generation.italy.testspring.model.Fornitore;
import org.generation.italy.testspring.repository.FornitoriRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class RegistraController {

	@Controller
	@RequestMapping("/Fornitori")	//gestisce le richieste GET /Fornitori/*
	public class RegistiController {
		
		@Autowired
		RegistiRepository registiRepository;
		
		@GetMapping("/elenco")			//gestisce una richiesta GET all'indirizzo /Fornitori/elenco
		@ResponseBody
		public String elencoRegisti() {
			List<Registi> elencoRegisti=registiRepository.findAll();
			StringBuilder elenco=new StringBuilder();
			elenco.append("Numero Fornitori: "+elencoRegisti.size());
			elenco.append("<br><br>");
			for (Registi f:elencoRegisti)
				elenco.append(f.toString()+ "<br>");
			return elenco.toString();
	
	
}
