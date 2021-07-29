/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ensias.modules;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author rachid dev
 */

@Service
public class ModuleService {
    
    @Autowired
    private ModuleRepository moduleRepository;
    public List<Module> getAllModules() {
        List<Module> modules =new ArrayList<>();
        moduleRepository.findAll().forEach(modules::add);
        //moduleRepository.findAll().forEach(m->modules.add(m));
        return modules;
    }
    


    public Optional <Module> getModule(Integer id) {
        return moduleRepository.findById(id);
    }

    public void ajouterModule(Module module) {
        moduleRepository.save(module);
    
    }
    
    public void modifierModule(Integer id, Module module){
        moduleRepository.save(module);
    }
    
    
    public void supprimerModule(Integer id) {
        moduleRepository.deleteById(id);
    }
}