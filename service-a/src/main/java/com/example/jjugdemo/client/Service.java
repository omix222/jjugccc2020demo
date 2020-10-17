package com.example.jjugdemo.client;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.*;
@RegisterRestClient(configKey = "confkey")
@ApplicationScoped
public interface Service {
    @GET
    @Path("/{parameter}")
    String doSomething(
            @PathParam("parameter") String parameter);
}

