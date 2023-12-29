package Collection;
import java.util.LinkedList;
public class Linkedlist{
	public static void main(String[] args) {
LinkedList<String> cities = new LinkedList<>();
		
		cities.add("London");
		cities.add("Mysore");
		cities.add("Parris");
		cities.add("Pune");
		cities.add("Bangalore");
		System.out.println("size of the list : "+ cities.size());
		for (String city: cities)
		{
			System.out.println(city);
		}
		LinkedList<String> cities2 = new LinkedList<String>(cities)	;		
		
		System.out.println(cities2.get(2));
		System.out.println(cities.indexOf("Mysore"));
		
		
		
		System.out.println(cities.contains("Hyderabad"));
		System.out.println(cities.removeAll(cities));
		
		
		System.out.println("print the value on the list :" + cities.get(2));
		
	
}

		

		
	}
	
	


