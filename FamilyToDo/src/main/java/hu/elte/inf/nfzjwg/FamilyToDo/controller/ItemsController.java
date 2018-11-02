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
import hu.elte.inf.nfzjwg.FamilyToDo.model.Items;
import hu.elte.inf.nfzjwg.FamilyToDo.service.ItemsService;
import hu.elte.inf.nfzjwg.FamilyToDo.repository.ItemsRepository;

@RestController
@RequestMapping("/api/items")
public class ItemsController {

    @Autowired
    private ItemsService itemsService;
    @Autowired
    private ItemsRepository itemsRepository;
    
    /**
     * This function returns all the entities.
     * @return a lsit of all the entities.
     */
    @GetMapping("/all")
    public List<Items> all() {
        return itemsService.findAll();
    }
    /**
     * This function adds a new item to the items table.
     * @param item - the new item
     * @return
     */
    @PostMapping("/post")
    public ResponseEntity<Items> postItem(@RequestBody Items item){
        Items saveditem =itemsRepository.save(item);
    return ResponseEntity.ok(saveditem);
    }

    /**
     * This function deletes an item from the items table found by the id paramether.
     * @param id - the id of the item that will be deleted
     * @return
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Items> delete(@PathVariable Integer id) {
        Optional<Items> oLecturer = itemsRepository.findById(id);
        if (oLecturer.isPresent()) {
            itemsRepository.deleteById(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}


