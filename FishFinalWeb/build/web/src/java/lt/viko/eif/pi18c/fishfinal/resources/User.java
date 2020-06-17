/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.pi18c.fishfinal.resources;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author d
 */
@XmlRootElement(name = "user")
public class User {   
    private int Id;
    private String Slapyvardis;
   private String Slaptažodis;
    private String Vardas;
    private String Pavarde;
    private String ElPastas;
    private String Telefonas;
   
    /**
     * Gets slaptazodis
     * @return 
     */
    @XmlElement
    public String getSlaptažodis() {
        return Slaptažodis;
    }

    /**
     * Sets Slaptazodis
     * @param Slaptažodis 
     */
    public void setSlaptažodis(String Slaptažodis) {
        this.Slaptažodis = Slaptažodis;
    }

    /**
     * User Constructor
     * @param Id
     * @param Slapyvardis
     * @param Slaptažodis
     * @param Vardas
     * @param Pavarde
     * @param ElPastas
     * @param Telefonas 
     */
    public User(int Id, String Slapyvardis, String Slaptažodis, String Vardas, String Pavarde, String ElPastas, String Telefonas) {
        this.Id = Id;
        this.Slapyvardis = Slapyvardis;
        this.Slaptažodis = Slaptažodis;
        this.Vardas = Vardas;
        this.Pavarde = Pavarde;
        this.ElPastas = ElPastas;
        this.Telefonas = Telefonas;
    }

    /**
     * toString method
     * @return 
     */
    @Override
    public String toString() {
        return  "User{" + "Id=" + Id + ", Slapyvardis=" + Slapyvardis + ", Vardas=" + Vardas + ", Pavarde=" + Pavarde + ", ElPastas=" + ElPastas + ", Telefonas=" + Telefonas +'}';
    }

    public User() {
    }

    /**
     * Gets slapyvardis
     * @return 
     */
    @XmlElement
    public String getSlapyvardis() {
        return Slapyvardis;
    }

    /**
     * Sets Slapyvardis
     * @param Slapyvardis 
     */
    public void setSlapyvardis(String Slapyvardis) {
        this.Slapyvardis = Slapyvardis;
    }

    /**
     * Gets ID
     * @return 
     */
    public int getId() {
        return Id;
    }

    /**
     * Gets Telefonas number
     * @return 
     */
    @XmlElement
    public String getTelefonas() {
        return Telefonas;
    }

    /**
     * Sets Telefonas Number
     * @param Telefonas 
     */
    public void setTelefonas(String Telefonas) {
        this.Telefonas = Telefonas;
    }

    /**
     * Sets Id
     * @param Id 
     */
    public void setId(int Id) {
        this.Id = Id;
    }

    /**
     * Gets Vardas
     * @return 
     */
   @XmlElement
    public String getVardas() {
        return Vardas;
    }

    /**
     * Sets Vardas
     * @param Vardas 
     */
    public void setVardas(String Vardas) {
        this.Vardas = Vardas;
    }
    
    /**
     * gets pavarde
     * @return 
     */
@XmlElement
    public String getPavarde() {
        return Pavarde;
    }

    /**
     * Sets pavarde
     * @param Pavarde 
     */
    public void setPavarde(String Pavarde) {
        this.Pavarde = Pavarde;
    }
    /**
     * Gets elpastas
     * @return 
     */
@XmlElement
    public String getElPastas() {
        return ElPastas;
    }

    /**
     * Sets el pastas
     * @param ElPastas 
     */
    public void setElPastas(String ElPastas) {
        this.ElPastas = ElPastas;
    }
    
}
