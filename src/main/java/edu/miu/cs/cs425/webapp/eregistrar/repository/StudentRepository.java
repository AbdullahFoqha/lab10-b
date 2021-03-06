package edu.miu.cs.cs425.webapp.eregistrar.repository;

import edu.miu.cs.cs425.webapp.eregistrar.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
}
