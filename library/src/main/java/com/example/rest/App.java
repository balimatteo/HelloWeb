package com.example.rest;

import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/api") // Base URL del servizio REST
public class App extends ResourceConfig {
    public App() {
        packages("com.example.rest"); 
    }
}
