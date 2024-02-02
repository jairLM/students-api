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


    @Override
    public ResponseEntity<RestResponse> getStudents() {
        RestResponse finalResponse = new RestResponse();
        List<Student> dataList;
        try{
            dataList = IStudentDao.findAll();
            if(dataList.isEmpty()){
                HttpStatus status = HttpStatus.NO_CONTENT;
                finalResponse.setStatus(status);
                finalResponse.setData(dataList);
                return new ResponseEntity<RestResponse>(finalResponse, finalResponse.getStatus());
            }else{
                HttpStatus status = HttpStatus.OK;
                finalResponse.setStatus(status);
                finalResponse.setData(dataList);
            }

        }catch (Exception e){
            System.out.println("******Error******* "+ e.getMessage());
            return new ResponseEntity<RestResponse>(finalResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }


        return new ResponseEntity<RestResponse>(finalResponse, HttpStatus.OK);
    }

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

    @Override
    public ResponseEntity<RestResponse> updateStudent() {
        return null;
    }

    @Override
    public ResponseEntity<RestResponse> deleteStudent() {
        return null;
    }
}
