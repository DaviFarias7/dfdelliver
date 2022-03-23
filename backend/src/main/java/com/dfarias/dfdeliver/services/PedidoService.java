package com.dfarias.dfdeliver.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dfarias.dfdeliver.dto.PedidoDTO;
import com.dfarias.dfdeliver.entities.Pedido;
import com.dfarias.dfdeliver.repositories.PedidoRepository;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repository;
	
	@Transactional(readOnly = true)
	public List<PedidoDTO> findAll(){
		List<Pedido> list = repository.encontrarPedidosComProdutos();
		return list.stream().map(x -> new PedidoDTO(x)).collect(Collectors.toList());
	}
	
}
