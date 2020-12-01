package br.com.estoque.resource.produto;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.estoque.repository.produto.Produto;
import br.com.estoque.service.produto.ProdutoService;

@Path("/produto")
public class ProdutoResource {

    @Inject
    private ProdutoService produtoService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Produto> buscarProdutos() {
        return produtoService.buscarProdutos();
    }

    @GET
    @Path("{idProduto}")
    @Produces(MediaType.APPLICATION_JSON)
    public Produto buscarPorId(@PathParam("idProduto") Integer idProduto) {
        return produtoService.buscarPeloIdProduto();
    }

}
