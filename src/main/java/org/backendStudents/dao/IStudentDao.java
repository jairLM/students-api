package org.backendStudents.dao;

import org.backendStudents.model.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface IStudentDao extends CrudRepository<Student, Long>{
    public List<Student> findAll();

}
