package Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
public class Hashmap {
	public static void main(String[] args) {
		HashMap<Integer,String> td = new HashMap<>();
		
		td.put(345, "Riya");
		td.put(1234, "Diya");
		td.put(0124, "John");
		td.put(587, "Mathew");
		td.put(274, "Mark");
		
		
		for(Entry<?, ?> m : td.entrySet()) {
			
			System.out.println(m.getValue());
		}
		Set<?> set = td.entrySet();
		
		System.out.println(set);
		
		
		Iterator<?> itr = set.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next()); 
		}
		
		
		td.remove(274);
		
		
		System.out.println(set);

}
}
