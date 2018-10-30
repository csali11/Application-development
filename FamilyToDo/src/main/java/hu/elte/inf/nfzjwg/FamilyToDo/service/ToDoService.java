package hu.elte.inf.nfzjwg.FamilyToDo.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import hu.elte.inf.nfzjwg.FamilyToDo.repository.ToDoRepository;
import hu.elte.inf.nfzjwg.FamilyToDo.model.ToDo;;

@Service
public class ToDoService {

    @Autowired
    private ToDoRepository toDoRepository;

    public List<ToDo> findAll() {
        return toDoRepository.findAll();
    }

    public ToDo findById(int id) {
        return toDoRepository.findById(id).get();
    }
}