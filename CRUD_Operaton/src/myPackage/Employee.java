package myPackage;

public class Employee {
		private  int empId=1234;
		private String eName;
		private int salary;
		
		
		public int getEmpId() {
			return empId;
		}
		public void setEmpId(int empId) {
			this.empId = empId;
		}
		public String geteName() {
			return eName;
		}
		public void seteName(String eName) {
			this.eName = eName;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		
		public Employee(int empId, String eName, int salary) {
			super();
			this.empId = empId;
			this.eName = eName;
			this.salary = salary;
		}
		public Employee() {
			
		}
		
		@Override
		public String toString() {
			return "Employee [empId=" + empId + ", eName=" + eName + ", salary=" + salary + "]";
		}
		

		
}
