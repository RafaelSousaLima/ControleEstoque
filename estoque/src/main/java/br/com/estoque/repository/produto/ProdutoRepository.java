package br.com.estoque.repository.produto;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class ProdutoRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Produto> buscarProdutos() {
        return entityManager.createNativeQuery("select * from produto", Produto.class).getResultList();
    }

    public Produto buscarPeloIdProduto(Integer id) {
        return (Produto) entityManager.createNativeQuery("select * from produto where id = :id ", Produto.class)
                .setParameter("id", id).getSingleResult();
    }

    public Produto cadastrarProduto(Produto produto) {
        entityManager.persist(produto);
        return produto;
    }

}
