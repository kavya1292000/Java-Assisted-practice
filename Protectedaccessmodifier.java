package javaprograms;

public class Protectedaccessmodifier {
	protected void display() {
		System.out.println("Java Program");
	}
}
class x extends Protectedaccessmodifier{
	public static void main(String[] args) {
		x obj=new x();
		obj.display();
	}
	
}
