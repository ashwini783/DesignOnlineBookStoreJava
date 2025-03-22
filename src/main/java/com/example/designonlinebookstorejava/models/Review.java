package com.example.designonlinebookstorejava.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Review extends BaseModel{
    private String comment;
    private int customerID;
    private int bookID;
    private int rating;
}
