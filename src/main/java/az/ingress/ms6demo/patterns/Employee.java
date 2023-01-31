package az.ingress.ms6demo.patterns;

public class Employee implements IPrototype{
    private int id;
    private String name;
    private double salary;

    public Employee(){
        System.out.printf("-------------------------------------------------------------------------");
    }

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void show(){
        System.out.println(id+" "+name+" "+" "+salary);
    }

    @Override
    public IPrototype getClone() {
        return new Employee(id,name,salary);
    }
}
