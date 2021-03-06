package hu.elte.inf.nfzjwg.FamilyToDo.model;


import hu.elte.inf.nfzjwg.FamilyToDo.model.ToDo;
import lombok.Data;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.*;

@Data
//@AllArgsConstructor
@Table(name = "destination")
@Entity

public class Destination {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column
    private String des;
    
  
    @OneToMany(mappedBy="destination")
    private List<ToDo> todo;

    public Destination(String des){this.des = des;}
    public Destination(){}
}