package br.com.estoque.repository.produto;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@Stateless
public class ProdutoRepository {

    @Inject
    @Default
    private EntityManager entityManager;

    public List<Produto> buscarProdutos() {
        Produto novoProduto = Produto.criarProduto("Teste", "Teste", "Teste", 1, 10.0, LocalDate.now(), null);
        entityManager.persist(novoProduto);
        return Arrays.asList(novoProduto);
    }

    public Produto buscarPeloIdProduto() {
        return new Produto(01, "Produto Funcionando!!!", null, null, null, null, null, null);
    }

}
