package edu.unbosque.JPATutorial.resources;

import edu.unbosque.JPATutorial.services.UserAppService;
import edu.unbosque.JPATutorial.resources.pojos.UserApp;

import javax.ws.rs.*;
import javax.ws.rs.core.*;
import java.util.ArrayList;
import java.util.List;

@Path("/userApp")
public class UserAppResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list() {

        List<UserApp> userApp = new ArrayList<UserApp>();

        userApp.add(new UserApp("paco123", "password123","paco@email.com","owner"));
        userApp.add(new UserApp("joen123", "jone123","jone@emial.com","official"));

        return Response.ok()
                .entity(userApp)
                .build();


    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(UserApp userApp) {

        UserAppService userAppService = new UserAppService();
        userAppService.saveUserApp(userApp.getUsername(),userApp.getPassword(),userApp.getEmail(),userApp.getRole());

        return Response.status(Response.Status.CREATED)
                .entity(userApp)
                .build();
    }

}
