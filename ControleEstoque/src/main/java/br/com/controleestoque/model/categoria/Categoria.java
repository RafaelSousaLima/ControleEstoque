package br.com.controleestoque.model.categoria;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.backend.model.entity.Entity;

@javax.persistence.Entity
public class Categoria extends Entity {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int id;

	@Column
	private String categoria;

	@Column
	private int idProduto;

	protected Categoria() {
		// TODO Auto-generated constructor stub
	}

	protected Categoria(int id, String categoria, int idProduto) {
		super();
		this.id = id;
		this.categoria = categoria;
		this.idProduto = idProduto;
	}

	public int getId() {
		return id;
	}

	protected void setId(int id) {
		this.id = id;
	}

	public String getCategoria() {
		return categoria;
	}

	protected void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getIdProduto() {
		return idProduto;
	}

	protected void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}

}
