package ques6;

public class Employee {
	private String Name;
	private int Id, salary,age;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [Name=" + Name + ", Id=" + Id + ", salary=" + salary + ", age=" + age + "]";
	}
	public Employee(String name, int id, int salary, int age) {
		super();
		Name = name;
		Id = id;
		this.salary = salary;
		this.age = age;
	}
	public Employee(String name, int id, int salary, int age, double netSalary) {
		super();
		Name = name;
		Id = id;
		this.salary = salary;
		this.age = age;
		netSalary=netSalary;
	}

	public double getNetSalary() {
		return salary + salary * 0.10 + salary* 0.10 + salary * 0.10;
	}

	public double getNetSalary(int ta, int da, int hra) {
		return salary + salary * ta / 100 + salary* hra / 100 + salary * da / 100;
	}
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
