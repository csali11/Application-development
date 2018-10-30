package hu.elte.inf.nfzjwg.FamilyToDo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import hu.elte.inf.nfzjwg.FamilyToDo.model.Items;

@Repository
public interface ItemsRepository extends CrudRepository<Items, Integer> {

    @Override
    public List<Items> findAll();
}