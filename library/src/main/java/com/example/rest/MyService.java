/*
package com.example.rest;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import com.example.utils.DataManager;
import java.util.List;

@Path("/service")
public class MyService {
    private static List<String> dati = DataManager.caricaDati();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<String> getData() {
        return dati;
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void addData(String item) {
        dati.add(item);
        DataManager.salvaDati(dati);
    }
}
*/