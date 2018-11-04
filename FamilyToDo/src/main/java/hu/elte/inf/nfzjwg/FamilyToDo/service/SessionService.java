package hu.elte.inf.nfzjwg.FamilyToDo.service;

import hu.elte.inf.nfzjwg.FamilyToDo.model.User;
import lombok.Data;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

@Service
@SessionScope //keeps properties between requests <-- used for data storage
@Data
public class SessionService {
    private User currentUser;
    
}