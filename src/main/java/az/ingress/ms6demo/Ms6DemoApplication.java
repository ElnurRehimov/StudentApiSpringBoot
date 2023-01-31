package az.ingress.ms6demo;

import az.ingress.ms6demo.patterns.SingletonService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@SpringBootApplication
public class Ms6DemoApplication implements CommandLineRunner {
	@Value("${application.version}")
	private String version;
	@Value("#{'${application.developers}'.split(',')}")
	private List<String> developers;
	private final SingletonService singleton;
	private final SingletonService singleton2;

	public static void main(String[] args) {
		SpringApplication.run(Ms6DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		log.trace("Application started {}",singleton);
//		log.trace("Application started {}",singleton2);
		log.trace("The version is {} {}",version,developers);
	}
}
