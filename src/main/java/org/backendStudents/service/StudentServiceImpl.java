package org.backendStudents.service;

import org.backendStudents.dao.IStudentDao;
import org.backendStudents.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private IStudentDao IStudentDao;


    @Override
    public Student createStudent(Student student) {
        Student studentCreated = null;
        try {
            studentCreated = IStudentDao.save(student);

        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }


        return studentCreated;

    }
}
