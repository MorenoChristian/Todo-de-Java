package OOP;
import java.util.*;

public class Using_Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Employee employee1 = new Employee("Christian", 2500, 2021, 13, 01);
		
		Employee employee2 = new Employee("Maxi", 15500, 2020, 10, 24);
		
		Employee employee3 = new Employee("Carmen", 18520, 2018, 06, 05);
		
		employee1.set_upper_salary(5);
		employee2.set_upper_salary(5);
		employee3.set_upper_salary(5);
		
		System.out.println("Name :"+employee1.get_name()+ " Salary: "+employee1.get_salary()+" "
				+ "Register: "+employee1.get_register());
		
		System.out.println("Name :"+employee2.get_name()+ " Salary: "+employee2.get_salary()+" "
				+ "Register: "+employee2.get_register());
		
		System.out.println("Name :"+employee3.get_name()+ " Salary: "+employee3.get_salary()+" "
				+ "Register: "+employee3.get_register());
		*/
		
		//INSTANCE OF BOSS CLASS
		Boss RRHH_boss = new Boss("Martin", 55000, 2006, 9, 25);
		RRHH_boss.set_incentive(2570);
		
		//INSTANCE OF EMPLOYEE CLASS
		Employee[] my_employees = new Employee[6];
		
		my_employees[0] = new Employee("Christian Moreno", 2500, 2021, 13, 01);
		
		my_employees[1] = new Employee("Maxi Moreno", 15500, 2020, 10, 24);
		
		my_employees[2] = new Employee("Carmen Medina", 18520, 2018, 06, 05);
		
		my_employees[3] = new Employee("Gonzalo Garcia");
		
		my_employees[4] = RRHH_boss; //POLYMORPHISM | SUBSTITUTION PRINCIPLE 
		
		my_employees[5] = new Boss("Maria", 95000, 1999, 5, 26);
		
		//OBJECT CASTING
		Boss finance_boss = (Boss) my_employees[5];
		finance_boss.set_incentive(55000);
		
		System.out.println(finance_boss.take_decision("Give more holiday days to employees"));
		
		System.out.println("The boss "+ finance_boss.get_name() +" has a bonus of "+finance_boss.set_bonus(500));
		
		
		System.out.println(my_employees[3].get_name()+ " has a bonus of "+my_employees[3].set_bonus(200));
		
		
		//WRONG CASTING
		//Boss sell_boss = (Boss) my_employees[1];
		
		// using a for loop to increment the employees salary
		/*
		for(int i = 0; i<3 ; i++) {
			
			my_employees[i].set_upper_salary(5);
			
		}
		
		
		for(int i = 0; i<3 ; i++) {
			System.out.println("Name: "+my_employees[i].get_name()+
					" Salary: "+my_employees[i].get_salary()+
					" Register: "+my_employees[i].get_register());
		}
		*/
		
		////////////////////// SUBSTITUTION PRINCIPLE//////////////////
		Employee comercial_director = new Boss("Sandra", 85000, 2012, 05, 05);
		
		Comparable example = new Employee("Elisabeth", 95000, 2011, 06, 07);
		
		if (comercial_director instanceof Employee) {
			System.out.println("is Boss type");
		}
		if (example instanceof Comparable) {
			System.out.println("Implement Comparable Interface");
		}
		
		
		
		// using for-each loop to increment employees salary
		
		for(Employee e: my_employees) {
			e.set_upper_salary(5);
		}
		
		
		//using Arrays.sort() to order by salary the objects from Employee
		Arrays.sort(my_employees);
		
		for(Employee e: my_employees) {
			System.out.println("Name: "+e.get_name()+
					" Salary: "+e.get_salary()+
					" Register: "+e.get_register());
		}
		
	
		
	}
	
}
	
class Employee implements Comparable, Workers{
	
	// first constructor with 5 parameters
	
	public Employee(String name, double salary, int year, int month, int day) {
		
		this.name = name;
		
		this.salary = salary;
		
		GregorianCalendar calendar = new GregorianCalendar(year, month-1, day);
		
		this.register = calendar.getTime();
		
		this.id = next_id;
		
		next_id++;
		
	}
	
	// second constructor with 1 parameters
	
	public Employee(String name) {
		
		//"this" calls the original constructor and pass the parameters to it
		this(name, 30000, 2000, 01, 01);
		
	}
	
	// GETTER METHODS
	
	public String get_name() {
		return name + " ID: "+ id;
	}
	
	public double get_salary() {
		return salary;
	}
	
	public Date get_register() {
		return register;
	}
	
	// SETTER METHODS
	
	public void set_upper_salary(double porcent) {
		
		double increase = salary*porcent/100;
		
		salary += increase;
	}
	
	public double set_bonus(double gratification) {
		return Workers.base_bonus+gratification;
	}
	
	//create our method compareTo
	public int compareTo(Object my_object) {
		
		//casting
		Employee other_employee = (Employee) my_object;
		
		if(this.salary < other_employee.salary) {
			return -1;
		}
		if(this.salary > other_employee.salary) {
			return 1;
		}
		
		return 0;
	}
	
	private String name;
	
	private double salary;
	
	private Date register;
	
	private int id;
	
	private static int next_id = 1;
}


class Boss extends Employee implements Leader{
	
	public Boss(String name, double salary, int year, int month, int day) {
		
		super(name, salary, year, month, day);
		
	}
	
	public String take_decision(String decision) {
		
		return "A member of direction has made the decision to: "+decision;
		
	}
	
	public double set_bonus(double gratification) {
		double prima = 2000;
		
		return Workers.base_bonus+gratification+prima;
	}
	
	//SETTER METHOD
	public void set_incentive(double incentive) {
		
		this.incentive = incentive;
		
	}
	
	//GETTER METHOD
	public double get_salary() {
		
		//with the code below we can call methods from father class
		
		double salary_Boss = super.get_salary(); 
		
		return salary_Boss+incentive;
		
	}
	
	private double incentive;
	
	
	
}


