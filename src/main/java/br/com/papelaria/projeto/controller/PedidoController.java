package br.com.papelaria.projeto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.papelaria.projeto.domain.Pedido;
import br.com.papelaria.projeto.repository.PedidoRepository;

@RestController
public class PedidoController {

		@Autowired
		private PedidoRepository pr;
		
		@GetMapping("/pedido/listar")
		public List<Pedido> listar(){
			return pr.findAll();
		}
		@PostMapping("/pedido/cadastrar")
		public String cadstrar(@RequestBody Pedido ps) {
			String msg = "";
			pr.save(ps);
			msg = "Pedido Cadastrado";
			return msg;
		}
}
