package StudyGroup;

class Employee{
	protected String name;
    protected int age;
    protected int sal;

    public Employee(String name, int age, int sal) {
        this.name = name;
        this.age = age;
        this.sal = sal;
    }

    public void printInfo() {
        System.out.print("이름: " + name + ", 나이: " + age + "살" + ", 연봉: " + sal + " ");
    }
}

class Manager extends Employee {
    private String department;

    public Manager(String name, int age, int sal, String department) {
        super(name, age, sal);
        this.department = department;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("부서: " + department);
    }
}

class Developer extends Employee {
    private String pfLanguage;

    public Developer(String name, int age, int sal, String pfLanguage) {
        super(name, age, sal);
        this.pfLanguage = pfLanguage;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("선호하는 프로그래밍 언어: " + pfLanguage);
    }
}

public class Employee_Info {
    public static void main(String[] args) {
        Employee employee = new Employee("이태영", 30, 3500);
        employee.printInfo();
        System.out.println();

        Manager manager = new Manager("신유진", 26, 3000, "인사부");
        manager.printInfo();

        Developer developer = new Developer("최재원", 28, 4000, "C++");
        developer.printInfo();
    }
}