package org.backendStudents.service;

import org.backendStudents.model.Student;
import org.backendStudents.response.RestResponse;
import org.springframework.http.ResponseEntity;

public interface IStudentService {

    ResponseEntity<RestResponse> getStudents();
     ResponseEntity<RestResponse> createStudent(Student student);
    ResponseEntity<RestResponse> updateStudent(Student student, Long id);
     ResponseEntity<RestResponse> deleteStudent(Long id);

}
