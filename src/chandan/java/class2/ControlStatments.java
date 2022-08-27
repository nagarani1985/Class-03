package chandan.java.class2;

public class ControlStatments {

	public static void main(String[] args) {
		
		//Java if else statement
		System.out.println("//Java if else statement example");
		int n=3;//10;
		if(n>5)
			System.out.println("N is greater than five");
		else
			System.out.println("N is less than five");
		
		//Java if...else...if Statement
		System.out.println("//Java if...else...if Statement example");
		int num=15;
		if(num>0)
			System.out.println("Number is positive");
		else if(num<0)
			System.out.println("Number is negative");
		else 
			System.out.println("Number is zero");
			
		//Nested if...else Statement
		System.out.println("//Nested if...else Statement");
		int a=-6,b=2,c=6;
		if(a>b) {
			if(a>c)
				System.out.println("a is the largest number");
			else
				System.out.println("c is the largest number");
		}
		else
			if(b>c)
				System.out.println("b is largest number");
			else
				System.out.println("c is the largest number");
	}

}
