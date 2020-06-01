/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.avisockas.FishWebService.service;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author Andrius
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(lt.viko.eif.avisockas.FishWebService.service.AdministratoriusFacadeREST.class);
        resources.add(lt.viko.eif.avisockas.FishWebService.service.AdresasFacadeREST.class);
        resources.add(lt.viko.eif.avisockas.FishWebService.service.MasalasFacadeREST.class);
        resources.add(lt.viko.eif.avisockas.FishWebService.service.NaudotimasalaiFacadeREST.class);
        resources.add(lt.viko.eif.avisockas.FishWebService.service.NaudotipašaraiFacadeREST.class);
        resources.add(lt.viko.eif.avisockas.FishWebService.service.NaudotojasFacadeREST.class);
        resources.add(lt.viko.eif.avisockas.FishWebService.service.NaudotojasįrankiaiFacadeREST.class);
        resources.add(lt.viko.eif.avisockas.FishWebService.service.NaudotojoadresasFacadeREST.class);
        resources.add(lt.viko.eif.avisockas.FishWebService.service.OrosalygosFacadeREST.class);
        resources.add(lt.viko.eif.avisockas.FishWebService.service.PagautažuvisFacadeREST.class);
        resources.add(lt.viko.eif.avisockas.FishWebService.service.PašarasFacadeREST.class);
        resources.add(lt.viko.eif.avisockas.FishWebService.service.SkelbimasFacadeREST.class);
        resources.add(lt.viko.eif.avisockas.FishWebService.service.TelkiniotipasFacadeREST.class);
        resources.add(lt.viko.eif.avisockas.FishWebService.service.TelkinysFacadeREST.class);
        resources.add(lt.viko.eif.avisockas.FishWebService.service.ĮrankisFacadeREST.class);
        resources.add(lt.viko.eif.avisockas.FishWebService.service.ĮrankisfirmaFacadeREST.class);
        resources.add(lt.viko.eif.avisockas.FishWebService.service.ĮrankistipasFacadeREST.class);
        resources.add(lt.viko.eif.avisockas.FishWebService.service.ŽuvisFacadeREST.class);
        resources.add(lt.viko.eif.avisockas.FishWebService.service.ŽūklėFacadeREST.class);
        resources.add(lt.viko.eif.avisockas.FishWebService.service.ŽūklėsdalyviaiFacadeREST.class);
        resources.add(lt.viko.eif.avisockas.FishWebService.service.ŽūklėįrankisFacadeREST.class);
    }
    
}
