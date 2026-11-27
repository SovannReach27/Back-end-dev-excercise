package kh.edu.restfulapi.repositiory;

import kh.edu.restfulapi.model.Categories;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Categories , Integer >{
    List<Categories> id(Integer id);
}
