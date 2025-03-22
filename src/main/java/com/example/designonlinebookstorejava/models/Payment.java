package com.example.designonlinebookstorejava.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import java.util.*;
@Getter
@Setter
@Entity
public class Payment extends BaseModel{
    private int orderId;
    private PaymentStatus status;
    private Date paymentDate;
    private PaymentMode paymentMode;

}
