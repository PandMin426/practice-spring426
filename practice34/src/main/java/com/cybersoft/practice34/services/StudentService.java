package com.cybersoft.practice34.services;

import com.cybersoft.practice34.dto.StudentDto;

public interface StudentService {
    StudentDto createStudent(StudentDto studentDto);
    StudentDto getStudentById(int id);
}
