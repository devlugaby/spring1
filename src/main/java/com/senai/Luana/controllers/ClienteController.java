package com.senai.Luana.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.Luana.entities.Cliente;
import com.senai.Luana.services.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	private final ClienteService clienteService;

	
	public ClienteController(ClienteService clienteService) {
		this.clienteService = clienteService;
	}
	
	@PostMapping
	public Cliente createCliente(@RequestBody Cliente cliente) {
		return clienteService.saveCliente(cliente);
	}
	
	@GetMapping
	public List<Cliente> getAllClientes() {
		return clienteService.getAllClientes();
	}
	
	public Cliente getCliente(@PathVariable Long idcCliente) {
		return clienteService.getClienteById(idcCliente);
	}
	
	public void deleteCliente(@PathVariable Long idcCliente) {
		clienteService.deleteCliente(idcCliente);
	}
	
}
