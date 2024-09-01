package com.sih.thera.api;


import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api")
public class TheraResource {

    private TheraDao theraDao = new TheraDaoImpl();

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/login")
    public User login(User user) {
        return theraDao.auth(user.getUserName(), user.getPassword());
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/register")
    public User registerUser(User user) {
        return theraDao.addUser(user);
    }

    @GET
    @Path("/therapycentres/{type}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<TherapyCentre> getTherapyCentres(@PathParam("type") String therapyType) {
        return theraDao.getTherapyCentres(therapyType);
    }

}

