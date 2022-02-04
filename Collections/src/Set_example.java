import java.util.HashSet;
import java.util.Set;


public class Set_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* A Set focuses in not allowing duplicates (only uniques)
		 * Thanks to the equals() method you can determine if 2 objects
		 * are identical
		 * 
		 * Feature:
		 * 		Their elements are uniques.
		 * 		To identify if an object is unique, use equals() method
		 * 		When we works with own objects we must override the hashcode()
		 * 		method which is an important method to the structure HashSet and LinkedHashSet
		 * 		Has no index
		 * 		
		 */
	
		//Initialize HashSet (Examples of Constructors)
		Set<Long> dnis = new HashSet<Long>(); //Traditional version
		Set<String> names = new HashSet<>(); //shortened version
		
		//Insertion Operations
		dnis.add(Long.valueOf(2130231312));
		
		
		
	}

}
