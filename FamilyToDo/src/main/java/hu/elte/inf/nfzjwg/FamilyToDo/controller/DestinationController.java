package hu.elte.inf.nfzjwg.FamilyToDo.controller;

import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import hu.elte.inf.nfzjwg.FamilyToDo.model.Destination;
import hu.elte.inf.nfzjwg.FamilyToDo.service.DestinationService;
@RestController
@RequestMapping("/api/destination")
public class DestinationController {

    @Autowired
    private DestinationService DestinationService;

    @GetMapping("/all")
    public List<Destination> all() {
        return DestinationService.findAll();
    }
  
}