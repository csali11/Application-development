package hu.elte.inf.nfzjwg.FamilyToDo.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import hu.elte.inf.nfzjwg.FamilyToDo.repository.DestinationRepository;
import hu.elte.inf.nfzjwg.FamilyToDo.model.Destination;

@Service
public class DestinationService {

    @Autowired
    private DestinationRepository destinationRepository;

    public List<Destination> findAll() {
        return destinationRepository.findAll();
    }

    public Destination findById(int id) {
        return destinationRepository.findById(id).get();
    }
}