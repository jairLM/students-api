package org.backendStudents.dao;

import org.backendStudents.model.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IStudentDao extends CrudRepository<Student, Long>{
    public List<Student> findAll();
}
