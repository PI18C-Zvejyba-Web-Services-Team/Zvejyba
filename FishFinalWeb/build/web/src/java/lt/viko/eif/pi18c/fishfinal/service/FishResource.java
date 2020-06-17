/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.pi18c.fishfinal.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import static javax.ws.rs.HttpMethod.DELETE;
import static javax.ws.rs.HttpMethod.POST;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import lt.viko.eif.pi18c.fishfinal.resources.Catch;
import lt.viko.eif.pi18c.fishfinal.resources.User;
import lt.viko.eif.pi18c.fishfinal.resources.userList;
import lt.viko.eif.pi18c.fishfinal.resources.FishingTrip;
import lt.viko.eif.pi18c.fishfinal.resources.FishingTripList;
import lt.viko.eif.pi18c.fishfinal.resources.Repository;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.core.CacheControl;
import javax.ws.rs.core.Link;

/**
 * REST Web Service
 *
 * @author Andrius
 */
@Path("FishingAPP")
public class FishResource {

      
    @Context
    private UriInfo context;
userList db = new userList(); 
FishingTripList TripList=new FishingTripList();


 /**
  * Gets users
  * @param uriInfo
  * @return
  * @throws ClassNotFoundException
  * @throws SQLException
  * @throws InstantiationException
  * @throws IllegalAccessException 
  */  
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUsers(@Context UriInfo uriInfo) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
         CacheControl cc = new CacheControl();
        Link self = Link.fromUriBuilder(uriInfo.getAbsolutePathBuilder()).rel("self").build();
         
          cc.setMaxAge(86400);
        cc.setPrivate(true);
        ResponseBuilder builder = Response.ok(db.userList().toString()).links(self);
        builder.cacheControl(cc);
  return builder.build();
    }

/**
 * Adds user to database
 * @param uriInfo
 * @param Slapyvardis
 * @param Slaptažodis
 * @param Vardas
 * @param Pavardė
 * @param Paštas
 * @param Telefonas
 * @return
 * @throws SQLException 
 */
    @POST
    @Path("/AddUser")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response AddUser(@Context UriInfo uriInfo,@QueryParam("Slapyvardis")String Slapyvardis,@QueryParam("Slaptažodis") String Slaptažodis,@QueryParam("Vardas") String Vardas,@QueryParam("Pavardė") String Pavardė,@QueryParam("Elpaštas") String Paštas,@QueryParam("Telefonas") String Telefonas) throws SQLException {
   User user = new User();
   user.setVardas(Vardas);
   user.setPavarde(Pavardė);
   user.setSlaptažodis(Slaptažodis);
   user.setSlapyvardis(Slapyvardis);
   user.setElPastas(Paštas);
   user.setTelefonas(Telefonas);
   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rybokas?allowPublicKeyRetrieval=true&useSSL=false", "root", "alus");
        Statement st = con.createStatement();
        String sql = ("INSERT INTO Naudotojas(Slapyvardis,Slaptazodis,Vardas,Pavardė,El_Pastas,KontaktinisTelefonas) VALUES ('"+ user.getSlapyvardis() + "','" + user.getSlaptažodis() + "','" + user.getVardas() + "','" + user.getPavarde() + "','" + user.getElPastas() + "','" + user.getTelefonas() +"');");
        st.execute(sql);
        CacheControl cc = new CacheControl();
        Link self = Link.fromUriBuilder(uriInfo.getAbsolutePathBuilder()).rel("self").build();
         
          cc.setMaxAge(86400);
        cc.setPrivate(true);
        ResponseBuilder builder = Response.ok(user).links(self);
        builder.cacheControl(cc);
  return builder.build();
  
   
    }
    
    /**
     * Deletes User By ID
     * @param uriInfo
     * @param ID
     * @return
     * @throws SQLException 
     */
    @PUT
    @Path("DeleteUserByID")
    @Consumes(MediaType.TEXT_PLAIN)
    public Response deleteUserByID(@Context UriInfo uriInfo,String ID) throws SQLException {
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rybokas?allowPublicKeyRetrieval=true&useSSL=false", "root", "alus");
        Statement st = con.createStatement();
        //String sql1=("SELECT from naudotojas where ID " + ID);
        String sql2=("SET FOREIGN_KEY_CHECKS=0;");
        String sql =("DELETE from naudotojas where naudotojas.ID= " + ID);
        //st.execute(sql1);
        st.execute(sql2);
        st.execute(sql);
         CacheControl cc = new CacheControl();
        Link self = Link.fromUriBuilder(uriInfo.getAbsolutePathBuilder()).rel("self").build();
         
          cc.setMaxAge(86400);
        cc.setPrivate(true);
        ResponseBuilder builder = Response.ok("Vartotojas ištrintas").links(self);
        builder.cacheControl(cc);
  return builder.build();
 
    }
    
    /**
     * Shows all FishingTrips
     * @param uriInfo
     * @return
     * @throws SQLException 
     */
    @GET
    @Path("AllFishingTrips")
    @Produces(MediaType.APPLICATION_JSON)
    public Response FindAllFishingTrips(@Context UriInfo uriInfo) throws SQLException { 
         CacheControl cc = new CacheControl();
        Link self = Link.fromUriBuilder(uriInfo.getAbsolutePathBuilder()).rel("self").build();
         
          cc.setMaxAge(86400);
        cc.setPrivate(true);
        ResponseBuilder builder = Response.ok(TripList.FishingList().toString()).links(self);
        builder.cacheControl(cc);
        return builder.build();
    
    }
    
    
    /**
     * Adds catches to fishing trip
     * @param uriInfo
     * @param zvejybosID
     * @param ZuviesID
     * @param Svoris
     * @return
     * @throws SQLException 
     */
    @POST
    @Path("/AddCatchesToAFishingTrip")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response AddCatchesToAFishingTrip(@Context UriInfo uriInfo,@QueryParam("Zukle_ID") int zvejybosID,@QueryParam("Zuvis_ID") int ZuviesID,@QueryParam("Svoris") int Svoris) throws SQLException {
  
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rybokas?allowPublicKeyRetrieval=true&useSSL=false", "root", "alus");
        Statement st = con.createStatement();
        String sql = ("INSERT INTO pagautazuvis(Zukle_ID,Zuvis_ID,Svoris) VALUES ('"+zvejybosID+ "','" +ZuviesID+ "','" +Svoris+"');");
        st.execute(sql);
        String sql1=("Select Pavadinimas from zuvis where ID = "+ZuviesID);
        ResultSet zuviesPav=st.executeQuery(sql1);
        zuviesPav.first();
        zuviesPav.getString("Pavadinimas");
         CacheControl cc = new CacheControl();
        Link self = Link.fromUriBuilder(uriInfo.getAbsolutePathBuilder()).rel("self").build();
         
          cc.setMaxAge(86400);
        cc.setPrivate(true);
        ResponseBuilder builder = Response.ok(zuviesPav.getString("Pavadinimas") +" prideta į žūklę, kurios ID = "+zvejybosID).links(self);
        builder.cacheControl(cc);
        return builder.build();
  
    }
    
    /**
     * Adds new fish to database
     * @param uriInfo
     * @param ZuviesPav
     * @return
     * @throws SQLException 
     */
    @POST
    @Path("/AddNewFishesToDatabase")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response AddNewFish(@Context UriInfo uriInfo,@QueryParam("Pavadinimas") String ZuviesPav) throws SQLException {
  
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rybokas?allowPublicKeyRetrieval=true&useSSL=false", "root", "alus");
        Statement st = con.createStatement();
        String sql = ("INSERT INTO zuvis(Pavadinimas) VALUES ('"+ZuviesPav+"');");
        st.execute(sql);
        CacheControl cc = new CacheControl();
        Link self = Link.fromUriBuilder(uriInfo.getAbsolutePathBuilder()).rel("self").build();
         
          cc.setMaxAge(86400);
        cc.setPrivate(true);
        ResponseBuilder builder = Response.ok(ZuviesPav +" prideta į duomenų bazę ").links(self);
        builder.cacheControl(cc);
        return builder.build();
   
}
}

