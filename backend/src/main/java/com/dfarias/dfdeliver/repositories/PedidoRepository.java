package com.dfarias.dfdeliver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dfarias.dfdeliver.entities.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
	
}
