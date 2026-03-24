package com.cybersoft.practice34.services.imp;

import com.cybersoft.practice34.dto.StudentDto;
import com.cybersoft.practice34.services.StudentService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class StudentServiceImp implements StudentService {
    private List<StudentDto> list = new ArrayList<>();

    @Override
    public StudentDto createStudent(StudentDto studentDto) {
        list.add(studentDto);
        return studentDto;
    }

    @Override
    public StudentDto getStudentById(int id) {
        for(StudentDto s : list){
            if(s.getId() == id){
                return s;
            }
        }
        return null;

    }
}
