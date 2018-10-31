package hu.elte.inf.nfzjwg.FamilyToDo.controller;

import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping("/all")
    public List<Family> all() {
        return familyService.findAll();
    }
  //here we have some problems
    @PostMapping("/post")
    public ResponseEntity<Family> postItem(@RequestBody Family item){

        Family saveditem =familyRepository.save(item);
    return ResponseEntity.ok(saveditem);
    }
}