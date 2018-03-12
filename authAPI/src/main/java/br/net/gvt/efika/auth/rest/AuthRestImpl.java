package br.net.gvt.efika.auth.rest;

import br.net.gvt.efika.auth.model.entity.Usuario;
import br.net.gvt.efika.auth.model.service.impl.AuthInterface;
import br.net.gvt.efika.auth.model.service.factory.FactoryService;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import br.net.gvt.efika.auth.model.service.impl.UsuarioAdapter;
import javax.ws.rs.core.Response;

/**
 *
 * @author G0034481
 */
@Path("/autentica")
public class AuthRestImpl extends RestJaxAbstract {

    private AuthInterface as;

    @GET
    @Path("/consultar/{login}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response consultar(@PathParam("login") String login) {
        try {
            return ok(UsuarioAdapter.adapter(FactoryService.createAutenticacaoServico().consultar(login)));
        } catch (Exception ex) {
            return serverError(ex);
        }
    }

    @POST
    @Path("/verificarCredencial")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response verificarCredencial(Usuario u) {
        try {
            return ok(FactoryService.createAutenticacaoServico().verificarCredencial(u.getLogin(), u.getSenha()));
        } catch (Exception ex) {
            return serverError(ex);
        }
    }

}
