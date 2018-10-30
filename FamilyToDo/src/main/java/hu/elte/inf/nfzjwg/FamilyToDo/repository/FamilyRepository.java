package hu.elte.inf.nfzjwg.FamilyToDo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import hu.elte.inf.nfzjwg.FamilyToDo.model.Family;

@Repository
public interface FamilyRepository extends CrudRepository<Family, Integer> {

    @Override
    public List<Family> findAll();
}