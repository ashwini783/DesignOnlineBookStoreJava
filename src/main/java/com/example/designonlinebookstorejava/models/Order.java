package com.example.designonlinebookstorejava.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.*;
@Getter
@Setter
@Entity
public class Order extends BaseModel{
    private int customerId;
    private Date orderDate;
    private double amount;
    private OrderStatus status;
}
