package hu.elte.inf.nfzjwg.FamilyToDo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    
    @Column(unique = true, nullable = false)
    private String userName;
    
    @Column(nullable = false)
    private String password;
    
    @Column(nullable = false)
    @Enumerated(EnumType.STRING) //Stringként tárolja, az adatbázis erről csak azt fogja tudni, hogy ez egy string
    private Role role;
    
    public enum Role { //azért public, hogy automatizációnál tudjunk rá hivatkozni
        GUEST, USER, ADMIN
    }
    
}