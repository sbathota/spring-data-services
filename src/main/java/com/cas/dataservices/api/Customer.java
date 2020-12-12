package com.cas.dataservices.api;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;
import java.util.*;


@Entity
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer customer_id;
    private String customer_name;


    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<CustomerAddress> addresses;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<CustomerEmail> emails;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<CustomerPhone> phoneNumbers;

}
