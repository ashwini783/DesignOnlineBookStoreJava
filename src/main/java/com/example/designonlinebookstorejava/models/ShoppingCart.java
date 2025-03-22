package com.example.designonlinebookstorejava.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import java.util.*;
@Entity
@Getter
@Setter
public class ShoppingCart extends BaseModel{
    private List<CartItem>items;
    private int customerID;

}
