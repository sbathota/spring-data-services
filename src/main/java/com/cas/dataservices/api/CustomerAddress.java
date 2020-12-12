package com.cas.dataservices.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.*;


import javax.persistence.*;

@Entity
@Table(name="customer_address")
@Data
public class CustomerAddress {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer address_id;
    private String address;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "customer_id")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Customer customer;

}
