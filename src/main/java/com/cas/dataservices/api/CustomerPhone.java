package com.cas.dataservices.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="customer_phone")
@Data
public class CustomerPhone {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer phone_id;
    private String phone_number;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "customer_id")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Customer customer;
    

}
