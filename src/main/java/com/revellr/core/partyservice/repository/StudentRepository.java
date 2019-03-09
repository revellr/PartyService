package com.revellr.core.partyservice.repository;

import com.revellr.core.partyservice.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface StudentRepository extends JpaRepository<Student, Long> {
}
