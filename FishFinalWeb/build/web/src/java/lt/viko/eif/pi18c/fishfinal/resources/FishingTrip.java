/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.pi18c.fishfinal.resources;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author d
 */
public class FishingTrip {
    private String TimeStart;
    private String TimeEnd;
   private String FishingSpot;
    private String Country;
    private String City;
    private String Street;
    private int Humidity;
    private int Temperature;
    private int Pressure;
    
    private List<Catch> catchesList=new ArrayList();
    public FishingTrip(String timestart,String timeend,String fishingspot,String country,String city,String street,int humidity,int temperature,int pressure){
        this.TimeStart=timestart;
        this.TimeEnd=timeend;
        this.FishingSpot=fishingspot;
        this.Country=country;
        this.City=city;
        this.Street=street;
        this.Humidity=humidity;
        this.Temperature=temperature;
        this.Pressure=pressure;
          
    }

    /**
     * constructor
     * @return 
     */
    public List<Catch> getCatchesList() {
        return catchesList;
    }

    /**
     * sets catchesList
     * @param catchesList 
     */
    public void setCatchesList(List<Catch> catchesList) {
        this.catchesList = catchesList;
    }

    /**
     * Gets TimeStart
     * @return 
     */
    public String getTimeStart() {
        return TimeStart;
    }

    /**
     * Sets TimeStart
     * @param TimeStart 
     */
    public void setTimeStart(String TimeStart) {
        this.TimeStart = TimeStart;
    }

    /**
     * Gets TimeEnd
     * @return 
     */
    public String getTimeEnd() {
        return TimeEnd;
    }

    /**
     * Sets TimeEnd
     * @param TimeEnd 
     */
    public void setTimeEnd(String TimeEnd) {
        this.TimeEnd = TimeEnd;
    }

    /**
     * Gets FishingSpot
     * @return 
     */
    public String getFishingSpot() {
        return FishingSpot;
    }

    /**
     * Sets FishingSpot
     * @param FishingSpot 
     */
    public void setFishingSpot(String FishingSpot) {
        this.FishingSpot = FishingSpot;
    }

    /**
     * Gets country
     * @return 
     */
    public String getCountry() {
        return Country;
    }

    /**
     * Sets Country
     * @param Country 
     */
    public void setCountry(String Country) {
        this.Country = Country;
    }

    /**
     * Gets City
     * @return 
     */
    public String getCity() {
        return City;
    }

    /**
     * Sets City
     * @param City 
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * Gets street
     * @return 
     */
    public String getStreet() {
        return Street;
    }

    /**
     * Sets Street
     * @param Street 
     */
    public void setStreet(String Street) {
        this.Street = Street;
    }

    /**
     * Gets Humidity
     * @return 
     */
    public int getHumidity() {
        return Humidity;
    }

    /**
     * Sets Humidity
     * @param Humidity 
     */
    public void setHumidity(int Humidity) {
        this.Humidity = Humidity;
    }

    /**
     * Gets Temperature
     * @return 
     */
    public int getTemperature() {
        return Temperature;
    }

    /**
     * Sets Temperature
     * @param Temperature 
     */
    public void setTemperature(int Temperature) {
        this.Temperature = Temperature;
    }

    /**
     * Gets Pressure
     * @return 
     */
    public int getPressure() {
        return Pressure;
    }

    /**
     * Sets Pressure
     * @param Pressure 
     */
    public void setPressure(int Pressure) {
        this.Pressure = Pressure;
    }

    /**
     * toString method
     * @return 
     */
    @Override
    public String toString() {
        return "FishingTrip{" + "TimeStart=" + TimeStart + ", TimeEnd=" + TimeEnd + ", FishingSpot=" + FishingSpot + ", Country=" + Country + ", City=" + City + ", Street=" + Street + ", Humidity=" + Humidity + ", Temperature=" + Temperature + ", Pressure=" + Pressure + "\n"+'}';
    }
}
