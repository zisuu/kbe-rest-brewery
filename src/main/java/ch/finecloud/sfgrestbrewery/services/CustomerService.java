package ch.finecloud.sfgrestbrewery.services;

import ch.finecloud.sfgrestbrewery.web.model.CustomerDto;

import java.util.UUID;


public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);

    CustomerDto saveNewCustomer(CustomerDto customerDto);

    void updateCustomer(UUID customerId, CustomerDto customerDto);

    void deleteById(UUID customerId);
}
