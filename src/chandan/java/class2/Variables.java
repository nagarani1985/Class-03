package chandan.java.class2;

public class Variables {
	 public String name="rani";
	static String name1="rani";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Variables v=new Variables();
		System.out.println(v.name);
		//System.out.println(name);
		System.out.println(new Variables().name);
		v.name="Sahasra";//Public variables cannot be modified
		Variables.name1="Seshu";
		System.out.println(Variables.name1);
		System.out.println(new Variables().name);
	}

}
