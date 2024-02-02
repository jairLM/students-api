package org.backendStudents.controller;


import org.backendStudents.model.Student;
import org.backendStudents.response.RestResponse;
import org.backendStudents.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    @Autowired
    private IStudentService studentService;

    @GetMapping("/student")
    public ResponseEntity<RestResponse> getAllStudents(){
        return studentService.getStudents();
    }

    @PostMapping("/student")
    public ResponseEntity<RestResponse> postStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }






}
