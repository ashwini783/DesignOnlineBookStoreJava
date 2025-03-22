package com.example.designonlinebookstorejava.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class User extends  BaseModel{
    private String name;
    private String email;
    private String phone;
    private String address;
    private String password;
    @OneToOne
    private ShoppingCart cart;

}
