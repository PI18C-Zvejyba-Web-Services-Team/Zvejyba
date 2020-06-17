/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.pi18c.fishfinal.resources;

import com.google.gson.Gson;
import com.sun.xml.rpc.processor.modeler.j2ee.xml.string;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.json.JsonArray;
import javax.json.JsonObject;
import org.json.*;

/**
 * User List helper
 * @author d
 */
public class userList {

    Connection con = null;
    Statement st = null;

    ResultSet rs = null;

    public List<User> userList() throws SQLException {
        List<User> userList = new ArrayList<>();
        int id = 0;
        String slapyvardis = null;
        String vardas = null;
        String pavarde = null;
        String elpastas = null;
        String slaptazodis = null;
        String Telefonas = null;
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rybokas?allowPublicKeyRetrieval=true&useSSL=false", "root", "alus");
        Statement st = con.createStatement();
        String sql = ("SELECT ID,Slapyvardis,Slaptazodis,Vardas,Pavardė,KontaktinisTelefonas,El_Pastas FROM Naudotojas;");
        ResultSet rs = st.executeQuery(sql);

        while (rs.next()) {

            User user = new User(id, slapyvardis, slaptazodis, vardas, pavarde, Telefonas, elpastas);
            user.setId(rs.getInt("ID"));
            user.setSlapyvardis(rs.getString("Slapyvardis"));
            user.setSlaptažodis(rs.getString("Slaptazodis"));
            user.setVardas(rs.getString("Vardas"));
            user.setPavarde(rs.getString("Pavardė"));
            user.setTelefonas(rs.getString("KontaktinisTelefonas"));
            user.setElPastas(rs.getString("El_Pastas"));
            userList.add(user);
        }
        return userList;
    }

    public void insertUser(User user) throws SQLException {
       
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rybokas?allowPublicKeyRetrieval=true&useSSL=false", "root", "alus");
        Statement st = con.createStatement();
        String sql = ("INSERT INTO Naudotojas(Slapyvardis,Slaptazodis,Vardas,Pavardė,El_Pastas,KontaktinisTelefonas) VALUES ('"+ user.getSlapyvardis() + "','" + user.getSlaptažodis() + "','" + user.getVardas() + "','" + user.getPavarde() + "','" + user.getElPastas() + "','" + user.getTelefonas() +"');");
        st.execute(sql);
        
    }
}
