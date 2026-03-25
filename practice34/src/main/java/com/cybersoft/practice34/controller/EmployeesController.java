package com.cybersoft.practice34.controller;


import com.cybersoft.practice34.dto.EmployeesDto;
import com.cybersoft.practice34.exception.EmployeeNotFoundException;
import com.cybersoft.practice34.payload.response.ErrorResponse;
import com.cybersoft.practice34.services.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class EmployeesController {

    @Autowired
    private EmployeesService employeesService;

    @GetMapping("{id}")
    public ResponseEntity<?> getEmployeesById(@PathVariable int id){
        EmployeesDto employeesDto = employeesService.getEmployeesById(id);

        if(employeesDto == null){
            throw new EmployeeNotFoundException("Employee not found");
        }

        return ResponseEntity.ok(employeesDto);
    }
}
