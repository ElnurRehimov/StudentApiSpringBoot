package az.ingress.ms6demo.services;

import az.ingress.ms6demo.dto.CreateStudentDto;
import az.ingress.ms6demo.dto.StudentDto;
import az.ingress.ms6demo.entity.Student;
import az.ingress.ms6demo.exceptions.StudentNotFound;
import az.ingress.ms6demo.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService{
    private final StudentRepository studentRepository;
    private final ModelMapper modelMapper;

    @Override
    public StudentDto getStudent(Long id) {
        log.trace("Get student id {}",id);
        return modelMapper.map(studentRepository.findById(id)
                .orElseThrow(StudentNotFound::new), StudentDto.class);
    }

    @Override
    public StudentDto creteStudent(CreateStudentDto dto) {
        log.trace("Create student body {}",dto);
        Student save = studentRepository.save(modelMapper.map(dto, Student.class));
        return modelMapper.map(save, StudentDto.class);
    }

    @Override
    public StudentDto updateStudent(Long id, CreateStudentDto dto) {
        log.trace("Update student id {} {}",id,dto);
        studentRepository.findById(id)
                .orElseThrow(StudentNotFound::new);
        Student student=modelMapper.map(dto, Student.class);
        student.setId(id);
        return modelMapper.map( studentRepository.save(student), StudentDto.class);
    }

    @Override
    public void deleteStudent(Long id) {
        log.trace("Delete student id {}",id);
        studentRepository.findById(id)
                .orElseThrow(StudentNotFound::new);
        studentRepository.deleteById(id);
    }
}