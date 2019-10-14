package com.jpa.project.repo;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import com.jpa.project.model.*;

@Repository
public interface CustomerRepository extends  CrudRepository<Customer,Long>  {
	
}
