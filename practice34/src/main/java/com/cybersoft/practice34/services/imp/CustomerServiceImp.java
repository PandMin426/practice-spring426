package com.cybersoft.practice34.services.imp;

import com.cybersoft.practice34.reponsitory.CustomerReponsitory;
import com.cybersoft.practice34.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImp implements CustomerService {
    @Autowired
    private CustomerReponsitory customerReponsitory;
}
