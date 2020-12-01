package br.com.estoque.service.produto;

import java.util.List;

import javax.inject.Inject;

import br.com.estoque.repository.produto.Produto;
import br.com.estoque.repository.produto.ProdutoRepository;

public class ProdutoService {

    @Inject
    private ProdutoRepository produtoRepository;

    public List<Produto> buscarProdutos() {
        return produtoRepository.buscarProdutos();
    }

    public Produto buscarPeloIdProduto() {
        return produtoRepository.buscarPeloIdProduto();
    }

}
