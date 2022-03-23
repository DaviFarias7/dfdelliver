package com.dfarias.dfdeliver.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dfarias.dfdeliver.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	List<Produto> findAllByOrderByNomeAsc();
}
