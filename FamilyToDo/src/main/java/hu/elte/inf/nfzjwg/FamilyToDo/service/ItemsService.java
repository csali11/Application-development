package hu.elte.inf.nfzjwg.FamilyToDo.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import hu.elte.inf.nfzjwg.FamilyToDo.repository.ItemsRepository;
import hu.elte.inf.nfzjwg.FamilyToDo.model.Items;

@Service
public class ItemsService {

    @Autowired
    private ItemsRepository itemsRepository;

    public List<Items> findAll() {
        return itemsRepository.findAll();
    }

    public Items findById(int id) {
        return itemsRepository.findById(id).get();
    }
}