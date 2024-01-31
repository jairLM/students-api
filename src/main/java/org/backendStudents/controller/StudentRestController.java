package org.backendStudents.controller;


import org.backendStudents.model.Student;
import org.backendStudents.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    @Autowired
    private IStudentService studentService;

    @PostMapping("/student")
    public ResponseEntity<Student> postStudent(@RequestBody Student student){
        Student studentCreated = studentService.createStudent(student);
        return new ResponseEntity<>(studentCreated, HttpStatus.OK);
    }






}