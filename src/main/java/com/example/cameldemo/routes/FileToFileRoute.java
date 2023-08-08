package com.example.cameldemo.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class FileToFileRoute extends RouteBuilder {

    @Override
    public void configure() {

        from("file:resources/f2f/from?delete=true").
        to("file:resources/f2f/to");
    }
}
