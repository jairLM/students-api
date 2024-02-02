package org.backendStudents.controller;


import org.backendStudents.model.Student;
import org.backendStudents.response.RestResponse;
import org.backendStudents.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public ResponseEntity<RestResponse> postStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }






}
