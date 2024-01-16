package org.generation.italy.netflixJaita.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller // classe gestita dal framework (inversion of control). Gestisce le richieste
				// del tipo /*
	public class MainController {

		@GetMapping // gestisce una richiesta GET all'indirizzo /
		@ResponseBody
		public String index() {
			return "Ciao, mondo!";
		}

	}

