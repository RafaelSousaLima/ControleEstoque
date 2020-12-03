package br.com.estoque.service.produto;

import java.time.LocalDateTime;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.estoque.repository.produto.Produto;
import br.com.estoque.repository.produto.ProdutoRepository;

@Stateless
public class ProdutoService {

    @Inject
    private ProdutoRepository produtoRepository;

    public List<Produto> buscarProdutos() {
        return produtoRepository.buscarProdutos();
    }

    public Produto buscarPeloIdProduto(Integer id) {
        return produtoRepository.buscarPeloIdProduto(id);
    }

    public Produto cadastrarProduto(Produto produto) {
        produto.setDtEntrada(LocalDateTime.now());
        return produtoRepository.cadastrarProduto(produto);
    }

}
