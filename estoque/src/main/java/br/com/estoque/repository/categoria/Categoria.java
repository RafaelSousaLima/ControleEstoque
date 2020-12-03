package br.com.estoque.repository.categoria;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer idCategoria;

    @Column
    private String categoria;

//    @OneToMany(mappedBy = "categoria")
//    private List<Produto> produto;

    public Categoria(Integer idCategoria, String categoria) {
        super();
        this.idCategoria = idCategoria;
        this.categoria = categoria;
    }

    public Categoria() {
        super();
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

}
