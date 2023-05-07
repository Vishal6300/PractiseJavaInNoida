package shadowIn;

import java.util.Scanner;

public class Starter {
		public void addChild() {
//			Scanner sc= new Scanner(System.in);
//			System.out.println("Enter serialNo of child");
//			int sNo=sc.nextInt();
//			
//			System.out.println("Enter Name");
//			int Name=sc.nextInt();
//			
//			System.out.println("Enter Age of child");
//			int age=sc.nextInt();
//			
//			System.out.println("Enter Hospital name");
//			String hospital=sc.next();
			Child childA= new Child(11,"Deva",23,"Manas");
			Child childB= new Child(12,"Satyam",25,"Max");
			Child childC= new Child(13,"Maggie",24,"Holy");
			
			System.out.println(childA);
			System.out.println(childB);
			System.out.println(childC);
			
		}
}
