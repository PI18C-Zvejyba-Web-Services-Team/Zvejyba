/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.pi18c.fishfinal.resources;

/**
 *
 * @author d
 */
public class Catch {
    int ZuviesID;
    int Svoris;
    public Catch(int zuviesID,int svoris){
        this.ZuviesID=zuviesID;
        this.Svoris=svoris;
    }

    /**
     *string method
     * @return 
     */
    @Override
    public String toString() {
        return "Catches{" + "Pavadinimas=" + ZuviesID + ", Svoris=" + Svoris + '}';
    }

    /**
     * gets svoris
     * @return 
     */
    public int getSvoris() {
        return Svoris;
    }

    /**
     * sets svoris
     * @param Svoris 
     */
    public void setSvoris(int Svoris) {
        this.Svoris = Svoris;
    }

    /**
     * gets zuviesID
     * @return 
     */
    public int getPavadinimasID() {
        return ZuviesID;
    }

    /**
     * sets zuviesID
     * @param zuviesID 
     */
    public void setPavadinimas(int zuviesID) {
        this.ZuviesID = zuviesID;
    }
}
