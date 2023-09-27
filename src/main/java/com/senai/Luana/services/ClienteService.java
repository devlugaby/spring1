package com.senai.Luana.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.Luana.entities.Cliente;
import com.senai.Luana.repositories.ClienteRepository;

@Service
public class ClienteService {

	private final ClienteRepository clienteRepository;
	
	@Autowired
	public ClienteService (ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}
	
	public Cliente saveCliente(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	public Cliente getCliente(Long idcCliente) {
		return clienteRepository.findById(idcCliente).orElse(null);
	}
	
	public List<Cliente> getAllProdutos() {
		return clienteRepository.findAll();
	}
	
	public void deleteCliente(Long idcCliente) {
		clienteRepository.deleteById(idcCliente);
	}

	public List<Cliente> getAllClientes() {
		// TODO Auto-generated method stub
		return null;
	}

	public Cliente getClienteById(Long idcCliente) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
