package collections;
import java.util.*;

public class Collections {
	public static void main(String[] args) {
		System.out.println("array list");
		ArrayList<String>city= new ArrayList<String>();
		city.add("Proddatur");
		city.add("Addanki");
		System.out.println(city);
		System.out.println("\n");
		System.out.println("vector list");
		Vector<Integer> vec=new Vector<Integer>();
		vec.add(5);
		vec.add(7);
		vec.add(13);
		System.out.println(vec);
		System.out.println("\n");
		System.out.println("linked List");
		LinkedList<String> names=new LinkedList<String>();
		names.add("Vamsi");
		names.add("Vyshna");
		Iterator<String> itr=names.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("\n");
		System.out.println("hash set");
		HashSet<Integer>hs=new HashSet<Integer>();
		hs.add(10);
		hs.add(34);
		hs.add(45);
		System.out.println(hs);
		System.out.println("\n");
		System.out.println("linked hash Set");
		LinkedHashSet<Integer>hs2=new LinkedHashSet<Integer>();
		hs2.add(76);
		hs2.add(35);
		hs2.add(42);
		System.out.println(hs2);	
	}

}

