package edu.unbosque.JPATutorial.resources;

import edu.unbosque.JPATutorial.resources.pojos.Author;
import edu.unbosque.JPATutorial.services.AuthorService;

import javax.ws.rs.*;
import javax.ws.rs.core.*;
import java.util.ArrayList;
import java.util.List;

@Path("/authors")
public class AuthorsResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list() {

        List<Author> authors = new ArrayList<Author>();
        authors.add(new Author(1, "Gabriel Garcia Marquez"));
        authors.add(new Author(2, "Jorge Isaacs"));
        authors.add(new Author(3, "Paco Jones"));
        authors.add(new Author(4, "torre jones"));

        return Response.ok()
                .entity(authors)
                .build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(Author author) {

        AuthorService authorService = new AuthorService();
        authorService.saveAuthor(author.getName());

        return Response.status(Response.Status.CREATED)
                .entity(author)
                .build();
    }

}
