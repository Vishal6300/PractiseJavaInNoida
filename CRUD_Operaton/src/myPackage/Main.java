package myPackage;

public class Main {

	public static void main(String[] args) {
		Student st= new Student();
//		st.createDatabase();
//		st.createTable();
//		st.createData();
//		st.updateData();
//		st.deleteData();
//		st.getAllDetails();
		
		Employee e1= new Employee();
		e1.setEmpId(13206);
		e1.seteName("sandy");
		e1.setSalary(90000);
		
		System.out.println(e1.getEmpId()+" "+e1.geteName()+" "+e1.getSalary());
	}

}
