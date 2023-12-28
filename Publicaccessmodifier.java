package javaprograms;

public class Publicaccessmodifier {
	public void msg() {
		System.out.println("Java");
	}
}
	class B{
		public static void main(String args[]) {
			Publicaccessmodifier obj=new Publicaccessmodifier();
			obj.msg();
		}
	}
