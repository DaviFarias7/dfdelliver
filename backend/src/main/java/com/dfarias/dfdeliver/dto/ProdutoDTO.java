package com.dfarias.dfdeliver.dto;

import java.io.Serializable;

import com.dfarias.dfdeliver.entities.Produto;

public class ProdutoDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Long id;
	private String nome;
	private Double preco;
	private String descricao;
	private String imageUri;
	
	public ProdutoDTO() {
	}

	public ProdutoDTO(Long id, String nome, Double preco, String descricao, String imageUri) {
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.descricao = descricao;
		this.imageUri = imageUri;
	}

	public ProdutoDTO(Produto entity) {
		id = entity.getId();
		nome = entity.getNome();
		preco = entity.getPreco();
		descricao = entity.getDescricao();
		imageUri = entity.getImageUri();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getImageUri() {
		return imageUri;
	}

	public void setImageUri(String imageUri) {
		this.imageUri = imageUri;
	}
	
}
