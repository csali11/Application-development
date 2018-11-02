package hu.elte.inf.nfzjwg.FamilyToDo.model;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;

@Data
@AllArgsConstructor
//@NoArgsConstructor
@Entity
@Table(name = "family")
public class Family {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column
    private String name;

    @Column
    private int age;

    @Column
    private String permission;

    @OneToMany(mappedBy="family")
    private List<ToDo> todo;  
    /**Constructor made because @AllArgsConstructor and @NoArgsConstructor are making some troubles when inserting.(at least on my PC) */
    public Family(String name, int age, String premission,List<ToDo> todo){
        this.age=age;
        this.name=name;
        this.permission=premission;
        this.todo=todo;
    }
    
}