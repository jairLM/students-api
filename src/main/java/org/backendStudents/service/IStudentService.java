package org.backendStudents.service;

import org.backendStudents.model.Student;
import org.backendStudents.response.RestResponse;
import org.springframework.http.ResponseEntity;

public interface IStudentService {

    public ResponseEntity<RestResponse> getStudents();
    public ResponseEntity<RestResponse> createStudent(Student student);
    public ResponseEntity<RestResponse> updateStudent(Student student, Long id);
    public ResponseEntity<RestResponse> deleteStudent(Long id);

}
