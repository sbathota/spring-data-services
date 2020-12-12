package com.cas.dataservices.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataService {

    @Autowired
    CustomerRepository customerRepository;

    public Customer getCustomerDetails(Integer customerId) throws  Exception{
        Customer customer = customerRepository.findCustomerByCustomer(customerId);
            return  customer;
    }
}
