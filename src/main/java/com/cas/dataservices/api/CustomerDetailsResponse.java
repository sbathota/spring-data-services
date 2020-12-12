package com.cas.dataservices.api;

import lombok.Data;
import java.util.*;

@Data
public class CustomerDetailsResponse {
    int customerId;
    String customerName;
    List<CustomerAddress> addresses;
    List<CustomerEmail> emails;
    List<CustomerPhone> phones;
}
