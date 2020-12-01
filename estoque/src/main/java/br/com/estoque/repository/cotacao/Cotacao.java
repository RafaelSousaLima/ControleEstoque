package br.com.estoque.repository.cotacao;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import br.com.estoque.repository.fornecedor.Fornecedor;

@Entity
public class Cotacao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idCotacao;
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
    private Date dataCotacao;// N�O
    @Column
    private Date dataEntrega;// SIM

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_fornecedor")
    private Fornecedor fornecedor;

    public Cotacao(Integer idCotacao, String produto, String marca, String modelo, Integer quantidade, String categoria,
            Double valorUnitario, Date dataCotacao, Date dataEntrega) {
        super();
        this.idCotacao = idCotacao;
        this.produto = produto;
        this.marca = marca;
        this.modelo = modelo;
        this.quantidade = quantidade;
        this.categoria = categoria;
        this.valorUnitario = valorUnitario;
        this.dataCotacao = dataCotacao;
        this.dataEntrega = dataEntrega;
    }

    public Cotacao() {
        // TODO Auto-generated constructor stub
    }

    public Integer getIdCotacao() {
        return idCotacao;
    }

    public void setIdCotacao(Integer idCotacao) {
        this.idCotacao = idCotacao;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Date getDataCotacao() {
        return dataCotacao;
    }

    public void setDataCotacao(Date dataCotacao) {
        this.dataCotacao = dataCotacao;
    }

    public Date getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    @Override
    public String toString() {
        return "Cotacao [idCotacao=" + idCotacao + ", produto=" + produto + ", marca=" + marca + ", modelo=" + modelo
                + ", quantidade=" + quantidade + ", categoria=" + categoria + ", valorUnitario=" + valorUnitario
                + ", valorTotal=" + valorTotal + ", dataCotacao=" + dataCotacao + ", dataEntrega=" + dataEntrega + "]";
    }

}
