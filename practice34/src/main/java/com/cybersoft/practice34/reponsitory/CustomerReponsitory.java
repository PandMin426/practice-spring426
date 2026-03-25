package com.cybersoft.practice34.reponsitory;

import com.cybersoft.practice34.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerReponsitory extends JpaRepository<CustomerEntity, Integer> {

}
