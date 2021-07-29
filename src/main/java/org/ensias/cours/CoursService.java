/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ensias.cours;

/**
 *
 * @author rachid dev
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoursService {
    
    @Autowired //pour l’injection des dépendances et éviter l’appel des new()
    private CoursRepository coursRepository;
    
    public List<Cours> getAllCours(Integer moduleId) { 
        List<Cours> cours=new ArrayList<>();
        coursRepository.findByModuleId(moduleId).forEach(cours::add);
        return cours; 
    }
    
    public Optional<Cours> getCours(Integer id) {
        return coursRepository.findById(id);    
    }
    
    public void ajouterCours(Cours cours) {
        coursRepository.save(cours); //la méthode save est implémentée dans CourseRepository
    }
    
    public void modifierCours(Cours cours) {
        coursRepository.save(cours); //ici save dans le rôle de la mise à jour
    }
    
    public void supprimerCours(Integer id) {
        coursRepository.deleteById(id);     
    }
}

