package ques6;

public class Main {
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1= new Employee();
		 double netSalary= e1.getSalary()+ (e1.getSalary()*0.10);
		Employee emp1= new Employee("Heralal", 101, 55000, 25);
		Employee emp2= new Employee("Heralal", 101, 55000, 25);

		System.out.println("with 10 % ");
		System.out.println(emp1.toString() + "& salary " + emp1.getNetSalary());

		System.out.println("with custom % ");
		int ta = 10, da = 10, hra = 20;
		System.out.println(emp1.toString() + "& salary " + emp1.getNetSalary(ta, da, hra));
		
	}

}
