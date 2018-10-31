package hu.elte.inf.nfzjwg.FamilyToDo.controller;

import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import hu.elte.inf.nfzjwg.FamilyToDo.model.Destination;
import hu.elte.inf.nfzjwg.FamilyToDo.repository.DestinationRepository;
import hu.elte.inf.nfzjwg.FamilyToDo.service.DestinationService;
@RestController
@RequestMapping("/api/destination")
public class DestinationController {

    @Autowired
    private DestinationService destinationService;
    @Autowired
    private DestinationRepository destinationRepository;

    @GetMapping("/all")
    public List<Destination> all() {
        return destinationService.findAll();
    }

    @PostMapping("/post")
    public ResponseEntity<Destination> postItem(@RequestBody Destination item){

        Destination saveditem =destinationRepository.save(item);
    return ResponseEntity.ok(saveditem);
    }

}