package com.cas.dataservices.api;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.persistence.*;


public interface CustomerRepository extends JpaRepository<Customer, Integer>{

    @Query(nativeQuery = true, value ="SELECT * FROM Customer c WHERE c.customer_id=:customerId")
    Customer findCustomerByCustomer(@Param("customerId") Integer customerId);

}
