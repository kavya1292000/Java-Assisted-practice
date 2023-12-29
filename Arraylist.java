package Collection;
import java.util.ArrayList;
import java.util.Collections;
public class Arraylist {
	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<>();
		
		cities.add("London");
		cities.add("NewDelhi");
		cities.add("Mysore");
		cities.add("Paris");
		cities.add("NewYork");
		System.out.println("Size of the list: "+cities.size());
		for (String city: cities) {
			System.out.println(city);
			
		}
		System.out.println("Value at index number 3 is : " + cities.get(3));
		System.out.println("List contains the value Bangalore : " + cities.contains("Bangalore"));
Collections.sort(cities);
		
		System.out.println(cities);
Collections.sort(cities,Collections.reverseOrder());
		
		System.out.println(cities);
cities.remove(3);
		
		System.out.println(cities);
		
		
		
		

	}

}
