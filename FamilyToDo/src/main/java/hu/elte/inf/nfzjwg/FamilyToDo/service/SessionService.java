package hu.elte.inf.nfzjwg.FamilyToDo.service;

import hu.elte.inf.nfzjwg.FamilyToDo.model.User;
import lombok.Data;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

@Service
@SessionScope //megőrzi a benne lévő propertiket kérések között ~ adattároláésra használjuk
@Data
public class SessionService {
    private User currentUser;
    
}