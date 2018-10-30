package hu.elte.inf.nfzjwg.FamilyToDo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import hu.elte.inf.nfzjwg.FamilyToDo.model.ToDo;;

@Repository
public interface ToDoRepository extends CrudRepository<ToDo, Integer> {

    @Override
    public List<ToDo> findAll();
}