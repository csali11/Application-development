package hu.elte.inf.nfzjwg.FamilyToDo.controller;

import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import hu.elte.inf.nfzjwg.FamilyToDo.model.ToDo;
import hu.elte.inf.nfzjwg.FamilyToDo.service.ToDoService;
@RestController
@RequestMapping("/api/todo")
public class ToDoController {

    @Autowired
    private ToDoService toDoService;

    @GetMapping("/all")
    public List<ToDo> all() {
        return toDoService.findAll();
    }
  
}