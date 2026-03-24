package com.cybersoft.practice34.controller;

import com.cybersoft.practice34.dto.StudentDto;
import com.cybersoft.practice34.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentControllerAPI {
    @Autowired
    private StudentService studentService;

    @PostMapping
    public ResponseEntity<?> createStudent(@RequestBody StudentDto studentDto){

        return ResponseEntity.ok(studentService.createStudent(studentDto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getStudentById(@PathVariable int id){
        StudentDto studentDto = studentService.getStudentById(id);
        if(studentDto == null){
            return ResponseEntity.status(404).body("Studemt not found");
        }

        return ResponseEntity.ok(studentDto);
    }


}
