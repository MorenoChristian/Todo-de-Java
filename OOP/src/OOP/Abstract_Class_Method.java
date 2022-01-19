package OOP;
import java.util.Date;
import java.util.GregorianCalendar;

public class Abstract_Class_Method {
	public static void main(String[] args) {
		
		//create a few instances from our different classes
		Person[] my_persons = new Person[2];
		
		my_persons[0] = new Employee3("Christian Moreno", 55000, 1997, 3, 18);
		my_persons[1] = new Student("Martin Ramela", "Biotechnology");
		
		for(Person p: my_persons) {
			System.out.println(p.get_name()+", "+p.get_description());
		}
		
	}
}

abstract class Person{
	
	public Person(String name) {
		this.name = name;
	}
	
	//GETTER METHOD
	public String get_name() {
		return name;
	}
	
	//we created an abstract method in an abstract class
	public abstract String get_description();
	
	private String name;
	
	
}

class Employee3 extends Person{
	
	// first constructor with 5 parameters
	
	public Employee3(String name, double salary, int year, int month, int day) {
		
		super(name);
		
		this.salary = salary;
		
		GregorianCalendar calendar = new GregorianCalendar(year, month-1, day);
		
		this.register = calendar.getTime();
		
		this.id = next_id;
		
		next_id++;
		
	}
		
	// GETTER METHODS
	
	public double get_salary() {
		return salary;
	}
	
	public Date get_register() {
		return register;
	}
	
	// overwrite the get_description() method
	public String get_description() {
		return "This Employee has an Id= "+id+" with a salary= "+salary;
	}
	
	// SETTER METHODS
	
	public void set_upper_salary(double porcent) {
		
		double increase = salary*porcent/100;
		
		salary += increase;
	}
	
	private double salary;
	
	private Date register;
	
	private int id;
	
	private static int next_id = 1;
}

class Student extends Person{
	
	public Student(String name, String career) {
		super(name);
		this.career = career;
	}
	
	public String get_description() {
		return "This Student is studing the: "+career+" career";
	}
	
	private String career;
}
