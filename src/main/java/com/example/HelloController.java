package com.example;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

@Controller("/")
public class HelloController {

    public static final String HELLO_WORLD_BODY_HTML = "<html><body><h1>Hello World!</body></html>";

    @Get
    @Produces(MediaType.TEXT_HTML)
    public String hello() {
        return HELLO_WORLD_BODY_HTML;
    }
}
