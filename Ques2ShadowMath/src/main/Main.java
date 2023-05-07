package main;

import java.util.Scanner;

import shadowMath.Menu;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter choice \n 1.Add Numbers \n 2. Subtract Number \n 3.Multiply Numbers \n 4.Divide \n 5.Find power of a number \n 6.Check factorial \n 7.find Fibonacci \n 8.Check Palindrome \n 9. Check Armstrong \n 10.Check prime/not \n 11.Check even/odd");
		int input=sc.nextInt();
		
		switch(input){
			
			case 1:
				System.out.println("Enter first number");
				int a=sc.nextInt();
				System.out.println("Enter second number");
				int b=sc.nextInt();
				System.out.print("The answer is ");
				System.out.println(Menu.add(a,b));
				break;
			case 2:
				System.out.println("Enter first number");
				int c=sc.nextInt();
				System.out.println("Enter second number");
				int d=sc.nextInt();
				System.out.print("The answer is ");
				System.out.println(Menu.sub(c,d));
				break;
			case 3:
				System.out.println("Enter first number");
				int e=sc.nextInt();
				System.out.println("Enter second number");
				int f=sc.nextInt();
				System.out.print("The answer is ");
				System.out.println(Menu.mul(e,f));
				break;
			case 4:
				System.out.println("Enter first number");
				int g=sc.nextInt();
				System.out.println("Enter second number");
				int h=sc.nextInt();
				System.out.print("The answer is ");
				System.out.println(Menu.div(g,h));
				break;
			case 5:
				System.out.println("Enter number");
				int i=sc.nextInt();
				System.out.println("Enter power of");
				int j=sc.nextInt();
				System.out.print("The answer is ");
				System.out.println(Menu.pow(i,j));
				break;
			case 6:
				System.out.println("Enter number to get factorial");
				int k=sc.nextInt();
				System.out.print("The answer is ");
				System.out.println(Menu.fact(k));
				break;
			case 7:
				System.out.println("Enter first number");
				int l=sc.nextInt();
				System.out.println("Enter second number");
				int m=sc.nextInt();
				System.out.println("Enter terms");
				int n=sc.nextInt();
				System.out.print("The answer is ");
				Menu.Fib(l,m,n);
				break;
			case 8:
				System.out.println("Enter number");
				int o=sc.nextInt();
				System.out.print("The answer is ");
				System.out.println(Menu.palindrome(o));
				break;
			case 9:
				System.out.println("Enter number");
				int p=sc.nextInt();
				System.out.print("The answer is ");
				System.out.println(Menu.armstrong(p));
				break;
			case 10:
				System.out.println("Enter number to check prime");
				int q=sc.nextInt();
				System.out.print("The answer is ");
				System.out.println(Menu.prime(q));
				break;
			case 11:
				System.out.println("Enter number to check it is even or not");
				int r=sc.nextInt();
				System.out.print("The answer is ");
				System.out.println(Menu.even(r));
				break;
			default:
				System.out.println("Enter valid number");
		}
		sc.close();
		
	}

	

}
