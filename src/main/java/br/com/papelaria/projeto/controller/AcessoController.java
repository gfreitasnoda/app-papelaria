package br.com.papelaria.projeto.controller;

import java.util.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class AcessoController {

	@GetMapping("/acesso/msg")	
	public String msg() {
				return "Olá,, você está no nosso ambiente";
		}
		
		@GetMapping
		public List<String> lista(){
				List<String> lst = ArrayList<String>() ;
				lst.add("Mouse");	
				lst.add("João");
				lst.add("Nicolas");
				lst.add("Teclado");
				return lst;
		}
}
