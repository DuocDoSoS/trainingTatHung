package com.example.demoHungTat.controller;

import com.example.demoHungTat.entity.KhoaEntity;
import com.example.demoHungTat.entity.StudentEntity;
import com.example.demoHungTat.repository.KhoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1")
public class StudentController {

    @Autowired
    KhoaRepository khoaRepository;
    private static final String count = "hung";

    @GetMapping(path = "getTest")
    public List<StudentEntity> getTest(){
        List<StudentEntity> studentEntityList = new ArrayList<>();
        studentEntityList.add(new StudentEntity(1L,count,"SCS"));
        studentEntityList.add(new StudentEntity(2L,count,"SCS"));
        studentEntityList.add(new StudentEntity(3L,count,"SCS"));
        return studentEntityList;
    }

    @GetMapping("pathVariable/{id}")
    public StudentEntity getTest1(@PathVariable("id") Long id){
        StudentEntity studentEntity  = new StudentEntity(id,count,"SCS");
        return studentEntity;
    }

    @GetMapping("pathVariable")
    public StudentEntity getTest2(@RequestParam String name){
        StudentEntity studentEntity  = new StudentEntity(1L,name,"SCS");
        return studentEntity;
    }
}
