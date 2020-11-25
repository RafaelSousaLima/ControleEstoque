package br.com.controleestoque.model.cotacao;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import br.com.backend.model.entity.Entity;
import br.com.controleestoque.model.fornecedor.Fornecedor;

@javax.persistence.Entity
public class Cotacao extends Entity {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column
	private String produto;// SIM
	
	@Column
	private String marca;// SIM
	
	@Column
	private String modelo;// SIM
	
	@Column
	private Integer quantidade;// SIM
	
	@Column
	private String categoria;// SIM
	
	@Column
	private Double valorUnitario;// SIM
	
	@Column
	private Double valorTotal;// CALCULAR
	
	@Column
	private Date dataCotacao;// NAO
	
	@Column
	private Date dataEntrega;// SIM

	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "id_fornecedor")
	private Fornecedor fornecedor;

	protected Cotacao() {
		// TODO Auto-generated constructor stub
	}

	protected Cotacao(int id, String produto, String marca, String modelo, Integer quantidade, String categoria,
			Double valorUnitario, Double valorTotal, Date dataCotacao, Date dataEntrega, Fornecedor fornecedor) {
		super();
		this.id = id;
		this.produto = produto;
		this.marca = marca;
		this.modelo = modelo;
		this.quantidade = quantidade;
		this.categoria = categoria;
		this.valorUnitario = valorUnitario;
		this.valorTotal = valorTotal;
		this.dataCotacao = dataCotacao;
		this.dataEntrega = dataEntrega;
		this.fornecedor = fornecedor;
	}

	@Override
	public int getId() {
		return this.id;
	}

	protected void setId(int id) {
		this.id = id;
	}
	
	public String getProduto() {
		return produto;
	}

	protected void setProduto(String produto) {
		this.produto = produto;
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

	public Integer getQuantidade() {
		return quantidade;
	}

	protected void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public String getCategoria() {
		return categoria;
	}

	protected void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Double getValorUnitario() {
		return valorUnitario;
	}

	protected void setValorUnitario(Double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	protected void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Date getDataCotacao() {
		return dataCotacao;
	}

	protected void setDataCotacao(Date dataCotacao) {
		this.dataCotacao = dataCotacao;
	}

	public Date getDataEntrega() {
		return dataEntrega;
	}

	protected void setDataEntrega(Date dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	protected void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	
}
