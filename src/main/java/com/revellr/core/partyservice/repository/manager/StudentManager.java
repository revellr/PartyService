package com.revellr.core.partyservice.repository.manager;

import com.revellr.core.partyservice.model.Student;
import com.revellr.core.partyservice.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentManager {

  private StudentRepository studentRepository;

  /**
   * Constructor
   *
   * @param studentRepository student jpa repository
   */
  @Autowired
  public StudentManager(final StudentRepository studentRepository) {
    this.studentRepository = studentRepository;
  }

  /**
   * Method to find Student by id
   *
   * @param id student id
   * @return Optional<Student> optional containing student object if present else null.
   */
  public Optional<Student> getStudentById(final Long id) {
    return studentRepository.findById(id);
  }

  /**
   * Method to add student
   *
   * @param student student object
   * @return Student inserted student object
   * */
  public Student addStudent(final Student student) {
    return studentRepository.save(student);
  }
}
