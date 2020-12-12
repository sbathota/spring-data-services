package com.cas.dataservices.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.crypto.Data;

@RestController
@RequestMapping("api/customer/")
public class DataServicesController {

    @Autowired
    DataService dataService;



    @GetMapping("/{customerId}")
    public CustomerDetailsResponse getCustomerDetailsById(@PathVariable("customerId") Integer customerId) throws Exception{
        CustomerDetailsResponse response = new CustomerDetailsResponse();

        Customer customer = dataService.getCustomerDetails(customerId);
         System.out.println(customer.getCustomer_name());
        response.setCustomerId(customer.getCustomer_id());
        response.setCustomerName(customer.getCustomer_name());
        response.setAddresses(customer.getAddresses());
        response.setEmails(customer.getEmails());
        response.setPhones(customer.getPhoneNumbers());
        return  response;

    }
}
