package org.backendStudents.controller;


import org.apache.tomcat.util.net.jsse.JSSEUtil;
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

    @GetMapping("/students")
    public ResponseEntity<RestResponse> getAllStudents(){
        return studentService.getStudents();
    }

    @PostMapping("/students")
    public ResponseEntity<RestResponse> postStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }

    @PutMapping("/students/{id}")
    public ResponseEntity<RestResponse> updateStudent(@RequestBody Student student, @PathVariable Long id){
        return studentService.updateStudent(student, id);
    }
    @DeleteMapping("/students/{id}")
    public ResponseEntity<RestResponse> deleteStudent(@PathVariable Long id){
        return studentService.deleteStudent(id);
    }






}
