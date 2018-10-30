package hu.elte.inf.nfzjwg.FamilyToDo.controller;

import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import hu.elte.inf.nfzjwg.FamilyToDo.model.Items;
import hu.elte.inf.nfzjwg.FamilyToDo.service.ItemsService;
@RestController
@RequestMapping("/api/items")
public class ItemsController {

    @Autowired
    private ItemsService itemsService;

    @GetMapping("/all")
    public List<Items> all() {
        return itemsService.findAll();
    }
  
}