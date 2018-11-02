package hu.elte.inf.nfzjwg.FamilyToDo.controller;

import java.security.cert.PKIXRevocationChecker.Option;
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

     /**
     * This function returns all the entities.
     * @return a lsit of all the entities.
     */
    @GetMapping("/all")
    public List<Destination> all() {
        return destinationService.findAll();
    }
    /**
     * This function adds a new location to the Destination table.
     * @param item- the new location
     * @return
     */
    @PostMapping("/post")
    public ResponseEntity<Destination> postItem(@RequestBody Destination item){

        Destination saveditem =destinationRepository.save(item);
    return ResponseEntity.ok(saveditem);
    }
    /**
     * This function deletes a location by id.
     * @param id- the id of the location which will be deleted
     * @return
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Destination> delete(@PathVariable Integer id) {
        Optional<Destination> oLecturer = destinationRepository.findById(id);
        if (oLecturer.isPresent()) {
            destinationRepository.deleteById(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}