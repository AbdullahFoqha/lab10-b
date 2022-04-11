package edu.miu.cs.cs425.webapp.eregistrar.service;


import edu.miu.cs.cs425.webapp.eregistrar.model.Student;

public interface StudentService {
    Iterable<Student> getAllStudents();
}
