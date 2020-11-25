package br.com.controleestoque.model.produto;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.backend.model.entity.Entity;

@javax.persistence.Entity
public class Produto extends Entity {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int id;
	
	@Column
	private String nome;
	
	@Column
	private String marca;
	
	@Column
	private String modelo;
	
	@Column
	private int quantidade;
	
	@Column
	private Double valor;
	
	@Column
	private LocalDate dtEntrada;

	@Column
	private int idCategoria;

	protected Produto() {
		// TODO Auto-generated constructor stub
	}

	protected Produto(int id, String nome, String marca, String modelo, int quantidade, Double valor,
			LocalDate dtEntrada, int idCategoria) {
		super();
		this.id = id;
		this.nome = nome;
		this.marca = marca;
		this.modelo = modelo;
		this.quantidade = quantidade;
		this.valor = valor;
		this.dtEntrada = dtEntrada;
		this.idCategoria = idCategoria;
	}
	
	@Override
	public int getId() {
		return this.id;
	}

	protected void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	protected void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	protected void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	protected void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getQuantidade() {
		return quantidade;
	}

	protected void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Double getValor() {
		return valor;
	}

	protected void setValor(Double valor) {
		this.valor = valor;
	}

	public LocalDate getDtEntrada() {
		return dtEntrada;
	}

	protected void setDtEntrada(LocalDate dtEntrada) {
		this.dtEntrada = dtEntrada;
	}

	public int getIdCategoria() {
		return idCategoria;
	}

	protected void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

}
