package com.example.designonlinebookstorejava.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.*;
@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class BookStore extends BaseModel{
    private String name;
    @ManyToMany
    private List<Book>books;
    @ManyToMany
    private List<User>users;
    @OneToOne(cascade = CascadeType.ALL)
    private User admin;
}
