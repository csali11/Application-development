package hu.elte.inf.nfzjwg.FamilyToDo.controller;

import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping("/all")
    public List<Items> all() {
        return itemsService.findAll();
    }
    @PostMapping("/post")
    public ResponseEntity<Items> postItem(@RequestBody Items item){
        Items saveditem =itemsRepository.save(item);
    return ResponseEntity.ok(saveditem);
    }
}


