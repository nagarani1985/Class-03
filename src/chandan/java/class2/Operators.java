package chandan.java.class2;

public class Operators {

	public static void main(String[] args) {
		//Arithmetic operators
		int a=20, b=10;
		System.out.println("Arithmetic operators");
		System.out.println("a+b="+(a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("a*b="+(a*b));
		System.out.println("a/b="+(a/b));
		System.out.println("a%b="+(a%b));//Modulo operator
		
		//Assignment operators
		int c=(a+=b);
		System.out.println("Assignment operators");
		System.out.println("a+=b="+c);
		System.out.println("a="+a);
		System.out.println("a-=b="+(a-=b));
		System.out.println("a="+a);
		System.out.println("a*=b="+(a*=b));
		System.out.println("a="+a);
		System.out.println("a/=b="+(a/=b));
		System.out.println("a="+a);
		System.out.println("a%=b="+(a%=b));
		System.out.println("a="+a);
		
		//Relational operators
		System.out.println("Relational operators");
		System.out.println("a==b:"+(a==b));
		System.out.println("a!=b:"+(a!=b));
		System.out.println("a>b:"+(a>b));
		System.out.println("a<b:"+(a<b));
		System.out.println("a>=b:"+(a>=b));
		System.out.println("a<=b:"+(a<=b));
		
		//Logical operators
		System.out.println("Logical operators");
		System.out.println("3>2&&5>4:"+(3>2&&5>4));
		System.out.println("3<2&&5>4:"+(3<2&&5>4));
		System.out.println("3>2||5>4:"+(3>2||5>4));
		System.out.println("3>2||5<4:"+(3>2||5<4));
		System.out.println("3<2||5<4:"+(3<2||5<4));
		
		//Unary operators
		System.out.println("Unary operators");
		int d=10;
		System.out.println("d="+d);//10
		System.out.println("++d="+ ++d);//11
		System.out.println("d++="+ d++);//11
		System.out.println("d="+d);//12
		
		
		//Ternary Operator
		int marks=36;
		String result;
		result=(marks>35)?"pass":"fail";
		System.out.println("Result:"+result);
		
		
	}

}
