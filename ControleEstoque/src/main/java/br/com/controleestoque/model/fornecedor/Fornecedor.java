package br.com.controleestoque.model.fornecedor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.backend.model.entity.Entity;

@javax.persistence.Entity
public class Fornecedor extends Entity {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column
	private String cnpj;
	
	@Column
	private String nomeEmpresa;
	
	@Column
	private String nomeContato;
	
	@Column(unique = true)
	private String emailContato;

	@Column
	private int idEndereco;

	@Column
	private int cotacao;

	protected Fornecedor() {
		// TODO Auto-generated constructor stub
	}

	protected Fornecedor(Integer id, String cnpj, String nomeEmpresa, String nomeContato, String emailContato,
			int idEndereco, int cotacao) {
		super();
		this.id = id;
		this.cnpj = cnpj;
		this.nomeEmpresa = nomeEmpresa;
		this.nomeContato = nomeContato;
		this.emailContato = emailContato;
		this.idEndereco = idEndereco;
		this.cotacao = cotacao;
	}

	@Override
	public int getId() {
		return id;
	}

	protected void setId(Integer id) {
		this.id = id;
	}

	public String getCnpj() {
		return cnpj;
	}

	protected void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	protected void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public String getNomeContato() {
		return nomeContato;
	}

	protected void setNomeContato(String nomeContato) {
		this.nomeContato = nomeContato;
	}

	public String getEmailContato() {
		return emailContato;
	}

	protected void setEmailContato(String emailContato) {
		this.emailContato = emailContato;
	}

	public int getIdEndereco() {
		return idEndereco;
	}

	protected void setIdEndereco(int idEndereco) {
		this.idEndereco = idEndereco;
	}

	public int getCotacao() {
		return cotacao;
	}

	protected void setCotacao(int cotacao) {
		this.cotacao = cotacao;
	}
	
	
}
