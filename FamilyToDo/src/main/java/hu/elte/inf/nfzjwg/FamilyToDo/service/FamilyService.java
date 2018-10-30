package hu.elte.inf.nfzjwg.FamilyToDo.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import hu.elte.inf.nfzjwg.FamilyToDo.repository.FamilyRepository;
import hu.elte.inf.nfzjwg.FamilyToDo.model.Family;

@Service
public class FamilyService {

    @Autowired
    private FamilyRepository familyRepository;

    public List<Family> findAll() {
        return familyRepository.findAll();
    }

    public Family findById(int id) {
        return familyRepository.findById(id).get();
    }
}