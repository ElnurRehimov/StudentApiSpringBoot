package az.ingress.ms6demo.repository;

import az.ingress.ms6demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
