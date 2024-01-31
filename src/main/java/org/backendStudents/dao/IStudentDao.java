package org.backendStudents.dao;

import org.backendStudents.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface IStudentDao extends CrudRepository<Student, Long>{
}
