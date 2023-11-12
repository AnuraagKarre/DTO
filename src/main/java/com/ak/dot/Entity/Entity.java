package com.ak.dot.Entity;

import jdk.jfr.Enabled;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@javax.persistence.Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Product")
@Data
public class Entity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int userID;

    public String userName;

    public String productName;

    public double amount;

    public String deliveryLoc;



}
