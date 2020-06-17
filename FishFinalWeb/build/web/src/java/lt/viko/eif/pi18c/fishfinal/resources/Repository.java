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
public class Repository {
    static List<FishingTrip> fishingTripList=new ArrayList();
    /**
     * Adds Catch to fishingTrip
     * @param FishingTripID
     * @param catch1 
     */
    public static void AddCatchToFishingTrip(int FishingTripID,Catch catch1){
        fishingTripList.get(FishingTripID).getCatchesList().add(catch1);
    }
}
