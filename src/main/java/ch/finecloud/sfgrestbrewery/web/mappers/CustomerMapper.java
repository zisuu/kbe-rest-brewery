package ch.finecloud.sfgrestbrewery.web.mappers;

import ch.finecloud.sfgrestbrewery.domain.Customer;
import ch.finecloud.sfgrestbrewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    Customer customerDtoToCustomer(CustomerDto dto);

    CustomerDto customerToCustomerDto(Customer customer);
}
