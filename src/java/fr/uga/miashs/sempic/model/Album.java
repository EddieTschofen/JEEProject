package fr.uga.miashs.sempic.model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.*;
/**
 *
 * @author eddie
 */
@Entity
public class Album implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    
    @NotNull
    private String title;
    
    @NotNull
    private String description;    
    
    @NotNull
    private Date creationDate;  
     
    @NotNull
    private SempicUser owner;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public SempicUser getOwner() {
        return owner;
    }

    public void setOwner(SempicUser owner) {
        this.owner = owner;
    }    
}
