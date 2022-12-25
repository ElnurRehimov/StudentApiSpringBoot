package az.ingress.ms6demo.services;

import az.ingress.ms6demo.dto.CreateStudentDto;
import az.ingress.ms6demo.dto.StudentDto;

public interface StudentService {
    StudentDto getStudent(Long id);
    StudentDto creteStudent(CreateStudentDto dto);
    StudentDto updateStudent(Long id,CreateStudentDto dto);
    void deleteStudent(Long id);
}
