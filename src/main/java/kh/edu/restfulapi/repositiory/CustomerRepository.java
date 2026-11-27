package kh.edu.restfulapi.repositiory;

import kh.edu.restfulapi.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer , Integer > {

}
