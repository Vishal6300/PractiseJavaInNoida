package shadowMath;

public class Menu {
	
	public static int add(int a,int b) {
		int sum=a+b;
		return sum;
	}
	public static int sub(int a,int b) {
		int rest=a-b;
		return rest;
	}
	public static int mul(int a,int b) {
		int Product=a*b;
		return Product;
	}
	
	public static int pow(int a,int b) {
		int total=(int) Math.pow(a, b);
		return total;
	}
	
	public static int div(int a,int b) {
		int Div=(int) a/b;
		return Div;
	}
	public static int fact(int a) {
		if(a>=1) {
			return a*fact(a-1);
		}else {
			return 0;
		}
	}
	
	public static void Fib(int num1,int num2, int n) {
        int count = 0;
        while (count < n) {
        	
            System.out.print(num1 + " ");

            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            count = count + 1;
        }
	}
	public static boolean palindrome(int n) {
		String check=Integer.toString(n);
		String bag="";
		for(int i=check.length()-1;i>=0;i--) {
			bag+=check.charAt(i);
		}
		if(bag==check) {
			return true;
		}else {
			return false;
		}
	}
	public static boolean prime(int n) {
		int count=0;
		
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count>=2) {
			return false;
		}else {
			return true;
		}
	}
	public static boolean even(int n) {
		int count=0;

		if(n%2==0) {
			return true;
		}else {
			return false;
		}
		
	}
	public static boolean armstrong(int n) {
		int originalNumber=n;
		int result=0;
		int remainder=0;
		while(originalNumber!=0) {
			remainder=originalNumber %10;
			result+=Math.pow(remainder, 3);
			originalNumber= originalNumber/10;
			
		}
		if(n==result) {
			return true;
		}else {
			return false;
		}
	}
}
