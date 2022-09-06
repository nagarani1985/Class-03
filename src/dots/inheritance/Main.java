package dots.inheritance;

public class Main {

	public static void main(String[] args) {
		Dog d =new Dog();
		d.name="Tinku";
		d.bark();
		d.sleep();
		Animal a=new Animal();
		a.sleep();
		Animal a1=new Dog();
		a1.sleep();
		
	}

}
