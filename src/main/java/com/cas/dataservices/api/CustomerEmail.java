package com.cas.dataservices.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="customer_email")
@Data
public class CustomerEmail {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer email_id;
    private String email;


    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "customer_id")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Customer customer;
    

}
