package hu.elte.inf.nfzjwg.FamilyToDo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import hu.elte.inf.nfzjwg.FamilyToDo.model.Destination;

@Repository
public interface DestinationRepository extends CrudRepository<Destination, Integer> {

    @Override
    public List<Destination> findAll();
}