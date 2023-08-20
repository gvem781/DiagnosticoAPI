package com.apirest.app.api.Model;

import jakarta.persistence.*;

@Entity
@Table(schema = "TaskCrud")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    @Column
    private String description;
    @Column
    private String state;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getState(){
        return state;
    }

    public void  setState(String state){
        this.state = state;
    }

}
