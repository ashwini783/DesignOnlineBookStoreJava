package com.example.designonlinebookstorejava.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.*;
@Entity
@Getter
@Setter
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class BookStorePlatForm extends BaseModel{
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "platform_id")
    private List<BookStore>bookStores;

}
