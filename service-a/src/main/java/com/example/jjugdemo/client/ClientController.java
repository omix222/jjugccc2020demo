package com.example.jjugdemo.client;

import org.eclipse.microprofile.opentracing.Traced;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
@Path("/client")
@ApplicationScoped
@Traced(value = true, operationName = "ClientController.onClientSide")
public class ClientController {
    @Inject
    @RestClient
    private Service service;
    @GET
    @Path("/test/{parameter}")
    public String onClientSide(@PathParam("parameter") String parameter) {
        return service.doSomething(parameter);
    }
}

