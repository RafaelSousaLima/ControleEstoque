package br.com.estoque.repository.fornecedor;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import br.com.estoque.repository.cotacao.Cotacao;

@Entity
public class Fornecedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idFornecedor;

    @Column
    private String cnpj;

    @Column
    private String nomeEmpresa;

    @Column
    private String nomeContato;

    @Column(unique = true)
    private String emailContato;

//    @OneToOne(mappedBy = "fornecedor", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    private Endereco endereco;

    @OneToMany(mappedBy = "fornecedor")
    private List<Cotacao> cotacoes;

    public Fornecedor(Integer idFornecedor, String cnpj, String nomeEmpresa, String nomeContato, String emailContato) {
        super();
        this.idFornecedor = idFornecedor;
        this.cnpj = cnpj;
        this.nomeEmpresa = nomeEmpresa;
        this.nomeContato = nomeContato;
        this.emailContato = emailContato;
    }

    public Fornecedor() {
        // TODO Auto-generated constructor stub
    }

    public Integer getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(Integer idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getNomeContato() {
        return nomeContato;
    }

    public void setNomeContato(String nomeContato) {
        this.nomeContato = nomeContato;
    }

    public String getEmailContato() {
        return emailContato;
    }

    public void setEmailContato(String emailContato) {
        this.emailContato = emailContato;
    }

    public List<Cotacao> getCotacoes() {
        return cotacoes;
    }

    public void setCotacoes(List<Cotacao> cotacoes) {
        this.cotacoes = cotacoes;
    }

}
