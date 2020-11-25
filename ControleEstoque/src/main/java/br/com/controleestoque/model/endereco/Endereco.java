package br.com.controleestoque.model.endereco;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.backend.model.entity.Entity;

@javax.persistence.Entity
public class Endereco extends Entity {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column
	private Integer cep;
	
	@Column
	private String logradouro;
	
	@Column
	private String complemento;
	
	@Column
	private String bairro;
	
	@Column
	private String cidade;
	
	@Column
	private String estado;

	@Column
	private int fornecedor;

	protected Endereco() {
		// TODO Auto-generated constructor stub
	}
	
	protected Endereco(int id, Integer cep, String logradouro, String complemento, String bairro, String cidade,
			String estado, int fornecedor) {
		super();
		this.id = id;
		this.cep = cep;
		this.logradouro = logradouro;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.fornecedor = fornecedor;
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	public Integer getCep() {
		return cep;
	}

	protected void setCep(Integer cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	protected void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	protected void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	protected void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	protected void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	protected void setEstado(String estado) {
		this.estado = estado;
	}

	public int getFornecedor() {
		return fornecedor;
	}

	protected void setFornecedor(int fornecedor) {
		this.fornecedor = fornecedor;
	}

	protected void setId(int id) {
		this.id = id;
	}
	
}
