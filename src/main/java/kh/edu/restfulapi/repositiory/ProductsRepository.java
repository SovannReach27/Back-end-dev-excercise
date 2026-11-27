package kh.edu.restfulapi.repositiory;

import kh.edu.restfulapi.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Products , Integer> {

}
