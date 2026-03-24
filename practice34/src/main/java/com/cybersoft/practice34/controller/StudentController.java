package com.cybersoft.practice34.controller;


import com.cybersoft.practice34.dto.StudentDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    private List<StudentDto>  listStudentDto = new ArrayList<StudentDto>();


    @PostMapping("/request-param")
    public ResponseEntity<?> insertStudent(@RequestParam String name, @RequestParam int age){
        StudentDto studentDto = new StudentDto();
        studentDto.setName(name);
        studentDto.setAge(age);
        listStudentDto.add(studentDto);

        return ResponseEntity.ok(listStudentDto);
    }


    @PostMapping("/path-variable/{name}/{age}")
    public ResponseEntity<?> inserStudent(@PathVariable String name, @PathVariable int age){
        StudentDto studentDto = new StudentDto();
        studentDto.setName(name);
        studentDto.setAge(age);
        listStudentDto.add(studentDto);

        return ResponseEntity.ok(listStudentDto);
    }

    @PostMapping("/request-body")
    public ResponseEntity<?> inserStudent(@RequestBody StudentDto studentDto){
        listStudentDto.add(studentDto);

        return ResponseEntity.ok(listStudentDto);
    }



}
