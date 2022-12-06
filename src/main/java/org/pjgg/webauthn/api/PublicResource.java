package org.pjgg.webauthn.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.SecurityContext;
import java.security.Principal;

@Path("/api/public")
public class PublicResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String publicResource() {
        return "public";
    }

    @GET
    @Path("/me")
    @Produces(MediaType.TEXT_PLAIN)
    public String me(@Context SecurityContext securityContext) {
        Principal user = securityContext.getUserPrincipal();
        return user != null ? user.getName() : "<not logged in>";
    }
}
