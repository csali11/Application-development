package hu.elte.inf.nfzjwg.FamilyToDo.controller;

import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

import hu.elte.inf.nfzjwg.FamilyToDo.model.Family;
import hu.elte.inf.nfzjwg.FamilyToDo.service.FamilyService;
@RestController
@RequestMapping("/api/family")
public class FamilyController {

    @Autowired
    private FamilyService familyService;

    @GetMapping("/all")
    public List<Family> all() {
        return familyService.findAll();
    }
  
}