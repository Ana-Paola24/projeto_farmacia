package com.generation.farmacia.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="tb_produtos")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;
	
	@NotBlank(message = "O atributo NOME é Obrigatório!")
	private String nome;
	
	@NotBlank(message = "O atributo DESCRIÇÃO é Obrigatório!")
	@Size (min = 10, max = 2500, message= "O atributo texto deve conter no minimo 10 e no máximo 2500 caracteres")
	private String descricao;
	
	@NotNull(message = "O atributo PREÇO é Obrigatório!")
	private float preco;
	
	@NotNull(message = "O atributo QUANTIDADE é Obrigatório!")
	private int quantidade;
	
	@NotBlank(message = "O atributo VALIDADE é Obrigatório!")
	private String validade;
	
	@NotNull(message = "O atributo FOTO é Obrigatório!")
	@Size (max = 5000, message= "O atributo FOTO deve conter no máximo 5000 caracteres")
	private String foto;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;

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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getValidade() {
		return validade;
	}

	public void setValidade(String validade) {
		this.validade = validade;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	
}
