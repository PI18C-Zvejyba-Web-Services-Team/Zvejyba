/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.pi18c.fishfinal.resources;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * constructor for fishingtripList
 * @author d
 */
public class FishingTripList {
     Connection con = null;
    Statement st = null;

    ResultSet rs = null;
    public List<FishingTrip> FishingList() throws SQLException {
       String TimeStart=null;
     String TimeEnd=null;
    String FishingSpot=null;
     String Country=null;
     String City=null;
     String Street=null;
     int Humidity=0;
     int Temperature=0;
     int Pressure=0;
    
        List<FishingTrip> fishingTripList = new ArrayList<>();
        
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rybokas?allowPublicKeyRetrieval=true&useSSL=false", "root", "alus");
        Statement st = con.createStatement();
        String sql =("SELECT zukle.LaikasNuo,zukle.LaikasIki,a1.Pavadinimas, a3.Salis,a3.Miestas,a3.Gatve,zukle.Dregme,zukle.Temperatura,zukle.Slegis,zukle.Vejas,a2.Apibudinimas FROM zukle\n" +
"Join telkinys a1 ON zukle.Telkinys_ID=a1.ID\n" +
"Join orosalygos a2 on zukle.OroSalygos_ID=a2.ID\n" +
"Join adresas a3 on a1.Adresas_ID=a3.ID");
        st.execute(sql);
       ResultSet rs=st.executeQuery(sql);
       
      while(rs.next()){
            FishingTrip fs = new FishingTrip(TimeStart,TimeEnd,FishingSpot,Country,City,Street,Humidity,Temperature,Pressure);
            fs.setTimeStart(rs.getString("LaikasNuo"));
            fs.setTimeEnd(rs.getString("LaikasIki"));
            fs.setFishingSpot(rs.getString("Pavadinimas"));
            fs.setCountry(rs.getString("Salis"));
            fs.setCity(rs.getString("Miestas"));
            fs.setStreet(rs.getString("Gatve"));
            fs.setHumidity(rs.getInt("Dregme"));
            fs.setTemperature(rs.getInt("Temperatura"));
            fs.setPressure(rs.getInt("Slegis"));
            fishingTripList.add(fs);
            
      }
      return fishingTripList;
    }

    
}
