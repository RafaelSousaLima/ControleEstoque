package br.com.estoque.repository.produto;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import br.com.estoque.repository.categoria.Categoria;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer idProduto;

    @Column
    private String nome;

    @Column
    private String marca;

    @Column
    private String modelo;

    @Column
    private Integer quantidade;

    @Column
    private Double valor;

    @Column
    private LocalDate dtEntrada;

    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;

    protected Produto() {
        // TODO Auto-generated constructor stub
    }

    protected Produto(Integer idProduto, String nome, String marca, String modelo, Integer quantidade, Double valor,
            LocalDate dtEntrada, Categoria categoria) {
        super();
        this.idProduto = idProduto;
        this.nome = nome;
        this.marca = marca;
        this.modelo = modelo;
        this.quantidade = quantidade;
        this.valor = valor;
        this.dtEntrada = dtEntrada;
        this.categoria = categoria;
    }

    public static Produto criarProduto(String nome, String marca, String modelo, Integer quantidade, Double valor,
            LocalDate dtEntrada, Categoria categoria) {
        return new Produto(null, nome, marca, modelo, quantidade, valor, dtEntrada, categoria);
    }

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public LocalDate getDtEntrada() {
        return dtEntrada;
    }

    public void setDtEntrada(LocalDate dtEntrada) {
        this.dtEntrada = dtEntrada;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

}
