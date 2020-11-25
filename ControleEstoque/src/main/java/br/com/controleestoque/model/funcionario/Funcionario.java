package br.com.controleestoque.model.funcionario;

import javax.persistence.Column;

import br.com.backend.model.entity.Entity;

@javax.persistence.Entity
public class Funcionario extends Entity {

	private static final long serialVersionUID = 1L;

	@Column
	private int id;
	
	@Column
	private String email;

	@Column
	private String senha;
	
	@Column
	private String nome;
	
	@Column
	private Integer tentativa;

	protected Funcionario() {
		// TODO Auto-generated constructor stub
	}

	protected Funcionario(int id, String email, String senha, String nome, Integer tentativa) {
		super();
		this.id = id;
		this.email = email;
		this.senha = senha;
		this.nome = nome;
		this.tentativa = tentativa;
	}

	public int getId() {
		return id;
	}

	protected void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	protected void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	protected void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	protected void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getTentativa() {
		return tentativa;
	}

	protected void setTentativa(Integer tentativa) {
		this.tentativa = tentativa;
	}
	
	
}
