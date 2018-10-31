package hu.elte.inf.nfzjwg.FamilyToDo.model;

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
import javax.persistence.ManyToOne;
import javax.persistence.ManyToMany;

import javax.persistence.JoinColumn;
import com.fasterxml.jackson.annotation.JsonIgnore;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "todo")
@Entity

public class ToDo {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column
    private String author;

    @Column
    private String text;
    
    @ManyToMany
    private List<Items> items;

    @ManyToOne
    @JoinColumn
    @JsonIgnore
    private Family family;

    @ManyToOne
    @JoinColumn
    @JsonIgnore
    private Destination destination;

    
   
 
   
}