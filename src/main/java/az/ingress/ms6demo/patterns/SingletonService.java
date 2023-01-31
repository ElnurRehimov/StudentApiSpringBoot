package az.ingress.ms6demo.patterns;

import lombok.Data;
import org.springframework.context.annotation.Scope;

import java.util.UUID;

//@Component //burda yazdiqda configde bean yaratmaqa ehtiyac yoxdu DI hell edir default singletondur
//@Scope("prototype")
@Data
public class SingletonService implements ISingletonService{
    private UUID id;
}
