package edu.miu.cs.cs425.webapp.eregistrar.service.serviceImpl;

import edu.miu.cs.cs425.webapp.eregistrar.model.Student;
import edu.miu.cs.cs425.webapp.eregistrar.repository.StudentRepository;
import edu.miu.cs.cs425.webapp.eregistrar.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Iterable<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
