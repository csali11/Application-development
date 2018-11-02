package hu.elte.inf.nfzjwg.FamilyToDo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import hu.elte.inf.nfzjwg.FamilyToDo.model.Family;
import hu.elte.inf.nfzjwg.FamilyToDo.repository.FamilyRepository;
import hu.elte.inf.nfzjwg.FamilyToDo.service.FamilyService;
@RestController
@RequestMapping("/api/family")
public class FamilyController {

    @Autowired
    private FamilyService familyService;
    @Autowired
    private FamilyRepository familyRepository;

     /**
     * This function returns all the entities.
     * @return a lsit of all the entities.
     */
    @GetMapping("/all")
    public List<Family> all() {
        return familyService.findAll();
    }
    /**
     * This function adds a new member to the family.
     * @param item- the new family member
     * @return
     */
    @PostMapping("/post")
    public ResponseEntity<Family> postItem(@RequestBody Family item){

        Family saveditem =familyRepository.save(item);
    return ResponseEntity.ok(saveditem);
    }
    /**
     * This function deletes a family member
     * @param family_id- the id of the member which will be deleted
     * @return
     */
    @DeleteMapping("/{family_id}")
    public ResponseEntity<Family> delete(@PathVariable Integer family_id) {
        Optional<Family> oLecturer = familyRepository.findById(family_id);
        if (oLecturer.isPresent()) {
            familyRepository.deleteById(family_id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}