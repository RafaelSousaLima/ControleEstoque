package br.com.estoque.resource.produto;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

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
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Produto buscarPorId(@PathParam("id") Integer idProduto) {
        return produtoService.buscarPeloIdProduto(idProduto);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response cadastrarProduto(Produto produto) {
        return Response.ok(produtoService.cadastrarProduto(produto)).build();
    }

}
