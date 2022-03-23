package com.dfarias.dfdeliver.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dfarias.dfdeliver.dto.ProdutoDTO;
import com.dfarias.dfdeliver.entities.Produto;
import com.dfarias.dfdeliver.repositories.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository repository;
	
	@Transactional(readOnly = true)
	public List<ProdutoDTO> findAll(){
		List<Produto> list = repository.findAllByOrderByNomeAsc();
		return list.stream().map(x -> new ProdutoDTO(x)).collect(Collectors.toList());
	}
	
}
