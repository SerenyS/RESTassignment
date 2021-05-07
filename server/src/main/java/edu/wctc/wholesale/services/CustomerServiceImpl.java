package edu.wctc.wholesale.services;

import edu.wctc.wholesale.entity.Customer;

import edu.wctc.wholesale.repos.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;


    @Override
    public Customer getCustomer(int customerId) {
        List<Customer> customerList = new ArrayList<>();
        customerRepository.findAll().forEach(customerList::add);
        return (Customer) customerList;
    }
}
