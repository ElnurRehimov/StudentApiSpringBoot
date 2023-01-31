package az.ingress.ms6demo.patterns;

public class AbstractFactory {
    public static ISingletonService getInstanceOfSingletonService(){
        return new SingletonService();
    }
}
