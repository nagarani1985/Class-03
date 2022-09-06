package chandan.java.class2;

public class Foreach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
		int numbers[]= {10,20,30,40,50};
		System.out.println("Numbers in the array:");
		for(int num:numbers) {
		total=total+num;
		System.out.println(num);
		}
		System.out.println("sum of numbers :"+total);
		}
	}


