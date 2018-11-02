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

import hu.elte.inf.nfzjwg.FamilyToDo.model.ToDo;
import hu.elte.inf.nfzjwg.FamilyToDo.repository.ToDoRepository;
import hu.elte.inf.nfzjwg.FamilyToDo.service.ToDoService;
@RestController
@RequestMapping("/api/todo")
public class ToDoController {

    @Autowired
    private ToDoService toDoService;
    @Autowired
    private ToDoRepository toDoRepository;

     /**
     * This function returns all the entities.
     * @return a lsit of all the entities.
     */
    @GetMapping("/all")
    public List<ToDo> all() {
        return toDoService.findAll();
    }
    /**
     * This function adds a new task to the todo table.
     * @param item - the task that will be added
     * @return
     */
    @PostMapping("/post")
    public ResponseEntity<ToDo> postItem(@RequestBody ToDo item){
        ToDo saveditem =toDoRepository.save(item);
    return ResponseEntity.ok(saveditem);
    }
    /**
     * This function deletes a task from the todo table.
     * @param id the id of the tack that will be deleted
     * @return
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<ToDo> delete(@PathVariable Integer id) {
        Optional<ToDo> oLecturer = toDoRepository.findById(id);
        if (oLecturer.isPresent()) {
            toDoRepository.deleteById(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

  
}