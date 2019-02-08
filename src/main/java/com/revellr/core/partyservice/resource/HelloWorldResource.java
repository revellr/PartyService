package com.revellr.core.partyservice.resource;

import com.revellr.core.partyservice.dto.response.HelloWorldResponse;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/api/v1")
@Produces(MediaType.APPLICATION_JSON)
public class HelloWorldResource {

  /**
   * Test API for hello world call
   *
   * @param name caller name
   * @return Response api response with salutation
   */
  @GET
  @Path("/helloworld/{name}")
  public Response helloWorld(@PathParam("name") final String name) {
    final HelloWorldResponse response = HelloWorldResponse.builder().salutation("Hello World, " + name).build();

    return Response.ok(response).build();
  }
}
