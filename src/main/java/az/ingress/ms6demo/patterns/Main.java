package az.ingress.ms6demo.patterns;

public class Main {
    private AbstractFactory abstractFactory;
    public static void main(String[] args) {
//        int eid=3;
//        String ename="Elnur";
//        double esalary=600;
//        Employee e=new Employee(eid,ename,esalary);
//        e.show();
//        Employee e1= (Employee) e.getClone();
//        e1.show();

//        ISingletonService iSingletonService=new SingletonService();
        ISingletonService iSingletonService=AbstractFactory.getInstanceOfSingletonService();
    }
}
