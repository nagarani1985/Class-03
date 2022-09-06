package chandan.java.class2;

public class Constructor {
String pname;

	Constructor(){
		System.out.println("I am constructor");
	}
	Constructor(String name){
		this.pname=name;
		
		System.out.println("My name is:"+pname);
	}
	public void Constructor() {//Method name same as constructor
		System.out.println("I am Method  ");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor c=new Constructor();
		Constructor c1=new Constructor("Rani");
		c1.Constructor();
		
		
	}

	
}
