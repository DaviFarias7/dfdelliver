package com.dfarias.dfdeliver.services;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dfarias.dfdeliver.dto.PedidoDTO;
import com.dfarias.dfdeliver.dto.ProdutoDTO;
import com.dfarias.dfdeliver.entities.Pedido;
import com.dfarias.dfdeliver.entities.Produto;
import com.dfarias.dfdeliver.entities.StatusDoPedido;
import com.dfarias.dfdeliver.repositories.PedidoRepository;
import com.dfarias.dfdeliver.repositories.ProdutoRepository;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repository;
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Transactional(readOnly = true)
	public List<PedidoDTO> findAll(){
		List<Pedido> list = repository.encontrarPedidosComProdutos();
		return list.stream().map(x -> new PedidoDTO(x)).collect(Collectors.toList());
	}
	
	@Transactional
	public PedidoDTO insert(PedidoDTO dto){
		Pedido pedido = new Pedido(null, dto.getEndereco(), dto.getLatitude(), dto.getLongitude(), 
				Instant.now(), StatusDoPedido.PENDENTE);
		for (ProdutoDTO p : dto.getProdutos()) {
			Produto produto = produtoRepository.getOne(p.getId());
			pedido.getProdutos().add(produto);
		}
		pedido = repository.save(pedido);
		return new PedidoDTO(pedido);
	}
	
}
