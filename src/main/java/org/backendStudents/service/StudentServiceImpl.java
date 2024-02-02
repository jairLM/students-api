package org.backendStudents.service;

import org.backendStudents.dao.IStudentDao;
import org.backendStudents.model.Student;
import org.backendStudents.response.RestResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;


@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private IStudentDao IStudentDao;


//    @Override
//    public ResponseEntity<StudentResponse> createStudent(Student student) {
//        ResponseEntity<StudentResponse> responseRest;
//        StudentResponse response = new StudentResponse();
//        Map<String, Student> mapa = new HashMap<>();
//        Student studentCreated = null;
//        try {
//            studentCreated = IStudentDao.save(student);
//            mapa.put("hola", studentCreated);
//            response.setData(mapa);
//
//
//        } catch (Exception e) {
//            System.out.println("Error " + e.getMessage());
//        }
//
//
//        return new ResponseEntity<StudentResponse>(response, HttpStatus.OK);
//
//    }
@Override
public ResponseEntity<RestResponse> createStudent(Student student) {
    RestResponse finalResponse = new RestResponse();
    List<Student> dataList = new ArrayList<>();
    try {
        Student studentCreated = IStudentDao.save(student);
        HttpStatus status = HttpStatus.OK;
        dataList.add(studentCreated);
        finalResponse.setStatus(status);
        finalResponse.setData(dataList);
        System.out.println(studentCreated);
    } catch (Exception e) {
        System.out.println("Error " + e.getMessage());
    }


    return new ResponseEntity<>(finalResponse, HttpStatus.OK);

}
}
