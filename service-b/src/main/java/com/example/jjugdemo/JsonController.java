package com.example.jjugdemo;

import javax.inject.Singleton;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/json")
@Singleton
@Produces(MediaType.APPLICATION_JSON)
public class JsonController {
    @GET
    public Book getBook() {
        return new Book("アプリケーションアーキテクチャ設計パターン",
                3850);
    }
}

