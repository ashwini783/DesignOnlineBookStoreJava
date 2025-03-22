package com.example.designonlinebookstorejava.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.*;
@Entity
@Setter
@Getter
public class Book extends BaseModel{
       private String title;
       private String author;
       private double price;
       private int quantity;
       private String category;
}
