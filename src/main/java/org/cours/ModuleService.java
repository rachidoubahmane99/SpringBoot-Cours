/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cours;

import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author rachid dev
 */

@Service
public class ModuleService {
    private List<Module> modules = Arrays.asList( new Module(10,"La plateforme Java Standard Edition","Description de la plateforme JavaSE"),
            new Module(12,"La plateforme Java Entreprise Edition","Description de la plateforme JavaEE "));
    
    
    public List<Module> getModules(){ 
        return modules;
    }

    public Module getModule(Integer id) {
        for(Module module : modules) {
            if(id.equals(module.getId())) {
                
                return module;
            }
        }
        return null;
          

    }

    public void ajouterModule(Module module) {
        modules.add(module);
    
    }
    
    public void modifierModule(Integer id, Module module){
        for(int i=0;i<modules.size();i++) {
        Module m=modules.get(i);
        if(id.equals(m.getId())) {
            modules.set(i,module);
            return;
        }
    }     
    }
    
    
    public void supprimerModule(Integer id) {
        modules.removeIf(m->id.equals(m.getId()));
    }
}
