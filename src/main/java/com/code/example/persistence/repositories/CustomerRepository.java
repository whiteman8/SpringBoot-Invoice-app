package com.code.example.persistence.repositories;

import com.code.example.persistence.entities.Customer;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by veljko on 4.8.18.
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
