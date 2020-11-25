package br.com.backend.resorce.produto;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/teste")
public class ProdutoResorce {

    @GET
    @Produces("text/plain")
    public String ola() {
        return "Olá mundo!";
    }

}
