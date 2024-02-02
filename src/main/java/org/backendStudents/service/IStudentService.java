package org.backendStudents.service;

import org.backendStudents.model.Student;
import org.backendStudents.response.RestResponse;
import org.springframework.http.ResponseEntity;

public interface IStudentService {

    public ResponseEntity<RestResponse> createStudent(Student student);


}
