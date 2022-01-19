package OOP;

public class Variable_and_MethodsStatic {
	
	public static void main(String[] args) {
		
		Employee2[] my_employees = new Employee2[2];
		
		my_employees[0] = new Employee2("Christian");
		my_employees[1] = new Employee2("Maxi");
		
		my_employees[1].set_section("RRHH");
		
		
		for(Employee2 e: my_employees) {
			System.out.println(e.get_data());
		}
		
		System.out.println(Employee2.get_next_id());
		
		
	}
	
}

class Employee2{
	
	public Employee2(String name) {
			
		this.name = name;
					
		section = "Administration";
			
		id = next_Id;
			
		next_Id++;
			
	}
		
	//Getter methods
		
	public String get_data() {
			
		return "Name: "+name+", Section: "+section+ ", ID: "+id;
	}
	
	// The following getter method return the next_Id value
	
	public static String get_next_id() {
		return "The next ID is: "+next_Id;
	}
		
	//Setter method
		
	public void set_section(String section) {
		this.section = section;
	}
		
		
	private String name;
	private String section;
		
	private int id;
	
	public static int next_Id = 1;
		
		
	}
