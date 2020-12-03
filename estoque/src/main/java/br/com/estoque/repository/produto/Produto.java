package br.com.estoque.repository.produto;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

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
    private LocalDateTime dtEntrada;
//
//    @ManyToOne
//    @JoinColumn(name = "id_categoria")
//    private Categoria categoria;

    protected Produto() {
        // TODO Auto-generated constructor stub
    }

    protected Produto(Integer idProduto, String nome, String marca, String modelo, Integer quantidade, Double valor,
            LocalDateTime dtEntrada) {
        super();
        this.id = idProduto;
        this.nome = nome;
        this.marca = marca;
        this.modelo = modelo;
        this.quantidade = quantidade;
        this.valor = valor;
        this.dtEntrada = dtEntrada;
    }

    public static Produto criarProduto(String nome, String marca, String modelo, Integer quantidade, Double valor,
            LocalDateTime dtEntrada) {
        return new Produto(null, nome, marca, modelo, quantidade, valor, dtEntrada);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer idProduto) {
        this.id = idProduto;
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

    public LocalDateTime getDtEntrada() {
        return dtEntrada;
    }

    public void setDtEntrada(LocalDateTime dtEntrada) {
        this.dtEntrada = dtEntrada;
    }

}
