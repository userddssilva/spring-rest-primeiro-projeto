package com.algaworks.osworks.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.osworks.domain.model.Cliente;

@RestController
public class ClienteController {

	@GetMapping("/clientes")
	public List<Cliente> listar() {
		var cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("Joao das neves");
		cliente1.setTelefone("23 1234-1234");
		cliente1.setEmail("joaooliveria@gmail.com");
		
		var cliente2 = new Cliente();
		cliente2.setId(1L);
		cliente2.setNome("Maria");
		cliente2.setTelefone("23 4425-6549");
		cliente2.setEmail("mariadasilva@gmail.com");
		
		return Arrays.asList(cliente1, cliente2);
	}
}
