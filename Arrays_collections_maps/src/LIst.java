import java.util.ArrayList;
import java.util.List;

public class LIst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* ArrayList: One of the most used. Proving a fast iteration
		 * and random access. Is an order collection (by index), this means
		 * that respect the insertion order but is not order by any criteria
		 * (alphabetic asc/desc, numeric asc/desc)
		 * 
		 * With ArrayLIst we can add an element in any position using .add()
		 */
		
		// Initialize ArrayList (Example of Constructor)
		List<Integer> dnis = new ArrayList<Integer>(); //Traditional version
		List<String> names = new ArrayList<>(); // shortened version
		
		// Insert Operation 
		dnis.add(123456789);
		dnis.add(987654321);
		
		names.add("Sr. Calamardo");
		names.add("Bob Esponja");
		names.add("Patricio");
		
		System.out.println("Elements in dnis List: "+dnis.size());
		System.out.println("Elements in names List: "+names.size());
		System.out.println(dnis.size() == names.size()); //ask if both list
		//contain the same number of elements
		
		// Access operation
		System.out.println("Element "+ 1 +" from dnis List: "+ dnis.get(1));
		System.out.println("Element "+ (names.size() -1) + " from names List: "
				+ names.get(names.size() -1)); //accessing to the last element
		
		// Eliminate Operations
		names.remove("Patricio");
		System.out.println("Elements in names List: "+ names.size()); //compare
		// size after the remove
		
	}

}
