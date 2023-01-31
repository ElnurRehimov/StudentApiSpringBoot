package az.ingress.ms6demo.config;

import az.ingress.ms6demo.patterns.SingletonService;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.UUID;

@Slf4j
@Configuration
public class Config {
//    @Bean
//    public StudentService studentService(){
//        log.trace("Create new Student service");
//        return new StudentServiceImpl();
//    }
    @Bean
//    @Scope("prototype")
    public SingletonService singletonService(){ //Singleton servisden @component qoymaqdansa field varsa Singletonservisde burda @Bean qoy
        log.trace("Create new Singleton service");
        SingletonService singletonService= new SingletonService();
        singletonService.setId(UUID.randomUUID());
        return singletonService;
    }
    @Bean
    public ModelMapper modelMapper(){
        ModelMapper modelMapper=new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        return modelMapper;
    }
}