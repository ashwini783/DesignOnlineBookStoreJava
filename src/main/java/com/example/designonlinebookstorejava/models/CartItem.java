package com.example.designonlinebookstorejava.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class CartItem extends BaseModel{
    private Book book;
    private int quantity;
}
