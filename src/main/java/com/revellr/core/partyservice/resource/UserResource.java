package com.revellr.core.partyservice.resource;

import com.revellr.core.partyservice.dto.response.*;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.*;
import java.net.URI;
import javax.ws.rs.core.Response;


@Path("/api/v1")
@Produces(MediaType.APPLICATION_JSON)
public class UserResource {

    /**
     * API to get user details
     *
     * @param name user name
     * @return Response api response with salutation
     */
    @GET
    @Path("/user/{name}")
    public Response getUserDatails(@PathParam("name") final String name) {
        final HelloWorldResponse response = HelloWorldResponse.builder().salutation("Hello World, " + name).build();

        return Response.ok(response).build();
    }



    /**
     * API to check user Availability
     *
     * @param name user name
     * @return JSON with Available true or false
     */
    @GET
    @Path("/user/available/{name}")
    public Response checkIfAvailable(@PathParam("name") final String name) {

        //available = CheckIfAvailbale();

        final HelloWorldResponse response = HelloWorldResponse.builder().salutation("Hello World, " ).build();

        return Response.ok(response).build();
    }

    /**
     * Test API to create a new user
     *
     * @param name caller name
     * @return Response api response with salutation
     */
    @POST
    @Path("/user")
    @Consumes("application/json")
    public Response createUser(Map<String, String> body) {

        System.out.println(body);

        final UserResponse response = UserResponse.builder().build();

        return Response.created(URI.create("/users/" + body.get("username"))).build();
    }


    /**
     * Test API to create a new user
     *
     * @param name caller name
     * @return Response api response with salutation
     */
    @PUT
    @Path("/user/{name}")
    @Consumes
    public Response createUser(@PathParam("name") final String name, Map<String, String> body) {

        System.out.println(body);


        return Response.ok().build();
    }




}
