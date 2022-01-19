package Array_List;
import java.util.ArrayList;
import java.util.Iterator;

public class Employee {
	
	public static void main(String[] args) {
		/*
		Employees[] list_employees = new Employees[3];
		list_employees[0] = new Employees("Ana",45,2500);
		list_employees[1] = new Employees("Antonio",55,2000);
		list_employees[2] = new Employees("Maria",25,2600);*/
		
		Employees maria = new Employees("Maria",25,2600);
		Employees jose = new Employees("Jose", 55, 5000);
		
		ArrayList <Employees> list_employees = new ArrayList <Employees> ();
		list_employees.add(new Employees("Ana",45,2500));
		list_employees.add(new Employees("Antonio",55,2000));
		list_employees.add(maria);
		list_employees.add(1, jose);
		
		System.out.println("The ArrayList has "+list_employees.size()+" elements:");
		
		System.out.println("Print second element: \n"+list_employees.get(2).get_data());
		
		for(Employees e: list_employees) {
			System.out.println(e.get_data());
		}
		
		// normal FOR
		System.out.println("\nNORMAL FOR:");
		for(int i = 0; i<list_employees.size(); i++) {
			Employees e = list_employees.get(i);
			System.out.println(e.get_data());
		}
		
		Employees[] array_employees = new Employees[list_employees.size()];
		list_employees.toArray(array_employees);
		
		System.out.println("\nFOR with normal array");
		for(int i = 0; i<array_employees.length; i++) {
			System.out.println(array_employees[i].get_data());
		}
		
		////////////ITERATOR////////////
		Iterator<Employees> my_iterator = list_employees.iterator();
		
		System.out.println("\nITERATOR");
		while(my_iterator.hasNext()) {
			System.out.println(my_iterator.next().get_data());
		}
	}

}

class Employees{
	public Employees(String name, int age, double salary) {
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	public String get_data() {
		return "The employee´s name is "+name+", he is "+age+" years old and his salary is: "+salary;
	}
	private String name;
	private int age;
	private double salary;
}