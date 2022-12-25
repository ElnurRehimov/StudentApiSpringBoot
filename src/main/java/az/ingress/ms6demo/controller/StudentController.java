package az.ingress.ms6demo.controller;

import az.ingress.ms6demo.dto.CreateStudentDto;
import az.ingress.ms6demo.dto.StudentDto;
import az.ingress.ms6demo.exceptions.StudentNotFound;
import az.ingress.ms6demo.services.StudentService;
import az.ingress.ms6demo.services.StudentServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/students")
public class StudentController {
    //@Autowired
    private final StudentService studentService;
    @GetMapping("/{id}")
    public ResponseEntity<StudentDto> get(@PathVariable Long id){
        log.trace("Get student by id {}",id);
        try{
            return ResponseEntity.ok(studentService.getStudent(id));
        }catch(StudentNotFound studentNotFound){
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<StudentDto> create(@RequestBody @Valid CreateStudentDto dto){
        log.trace("Create student by body {}",dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(studentService.creteStudent(dto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<StudentDto>  update(@PathVariable Long id, @RequestBody  @Valid CreateStudentDto dto){
        log.trace("Update student by id {} body {}",id,dto);
        try{
            return ResponseEntity.ok(studentService.updateStudent(id,dto));
        }catch(StudentNotFound studentNotFound){
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping ("/{id}")
    public ResponseEntity Delete(@PathVariable Long id){
        log.trace("Delete student by id {}",id);
        try{
            studentService.deleteStudent(id);
            return ResponseEntity.noContent().build();
        }catch(StudentNotFound studentNotFound){
            return ResponseEntity.notFound().build();
        }
    }

}