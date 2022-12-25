package az.ingress.ms6demo.config;

import az.ingress.ms6demo.services.StudentService;
import az.ingress.ms6demo.services.StudentServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.modelmapper.spi.MatchingStrategy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Slf4j
@Configuration
public class Config {
    //@Bean
//    public StudentService studentService(){
//        log.trace("Create new Student service");
//        return new StudentServiceImpl();
//    }
    @Bean
    public ModelMapper modelMapper(){
        ModelMapper modelMapper=new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        return modelMapper;
    }
}