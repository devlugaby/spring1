package com.senai.Luana.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.Luana.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

	Object findById = null;


}
