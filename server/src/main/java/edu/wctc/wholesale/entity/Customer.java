package edu.wctc.wholesale.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

// Schema includes Customer, Product, and WholesaleOrder
@Entity
@Data
@NoArgsConstructor
public class Customer {
    @Id
    @Column(name="customer_id")
    private int id;

    private String name;
}