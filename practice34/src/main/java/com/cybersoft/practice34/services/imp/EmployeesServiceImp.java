package com.cybersoft.practice34.services.imp;

import com.cybersoft.practice34.dto.EmployeesDto;
import com.cybersoft.practice34.services.EmployeesService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeesServiceImp implements EmployeesService {

    private List<EmployeesDto> list = new ArrayList<>();

    @Override
    public EmployeesDto getEmployeesById(int id) {
        for(EmployeesDto e : list){
            if(e.getId() == id){
                return e;
            }
        }

        return null;
    }
}
