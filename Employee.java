package employee;

public class Employee {
	
		String name;
	    int id;
	    double salary;
	    Employee(String empname, int empid, double empsalary) {
	        name = empname;
	        id = empid;
	        salary = empsalary;
	    
	    }

	    //  display employee details
	    void displayDetails() {
	        System.out.println("Employee ID " + id);
	        System.out.println("Name " + name);
	        System.out.println("Salary " + salary);
	    }
	    
	 void increaseSalary(double percentage) {
	    double increment = (salary * percentage) / 100;
	    salary += increment;
	    System.out.println(name + "'s salary increased by " + percentage + "%" );
	}
	}
public class Main {

	public static void main(String[] args) {
	
			Employee e1=new Employee("alice",101,50000);
			Employee e2=new Employee("john",102,60000d);
			System.out.println("initial employee details");
			e1.displayDetails();
			e2.displayDetails();
			e1.increaseSalary(10);
			e2.increaseSalary(20);
			System.out.println("updated Employee Details");
			e1.displayDetails();
			e2.displayDetails();
	}

}




