/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ensias.modules;

import org.ensias.modules.Module;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author rachid dev
 */
public interface ModuleRepository extends CrudRepository <Module,Integer> {
    
}
