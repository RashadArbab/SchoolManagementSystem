/**
 * 
 * @author rasha
 *
 */
public class Teacher {
	private int id ; 
	private String name; 
	private int salary; 
	private int paidSoFar ; 
	public Teacher(int id, String name, int salary, int paidSoFar) { 
		this.id = id; 
		this.name = name; 
		this.salary = salary; 
		this.paidSoFar = paidSoFar;
	}
	
	@Override
	public String toString() { 
		return "Name: " + name + "   " + "ID: " + id + "   " + "Salary: " + salary + "   " +  "Paid so far: " + paidSoFar; 
 	}
	/**
	 * return Id of the teacher 
	 * @return
	 */
	public int getId() { 
		return this.id; 
	}
	/**
	 * return name of the teacher
	 * @return
	 */
	public String getName() {
		return this.name; 
		
	}
	/**
	 * returns teachers salary 
	 * @return
	 */
	public int getSalary () { 
		return this.salary; 
		
	}
	/**
	 * sets the salary 
	 * @param salary
	 */
	public void setSalary(int salary) { 
		this.salary = salary; 
		
	}
	/**
	 * adds the raise to the salary 
	 * @param boost
	 */
	public void updateSalary(int raise) {
		this.salary= (this.salary+raise); 
	}
	
	public void pay(int pay) {
		this.paidSoFar += pay; 
	}
	
	public int getPaidSoFar() {
		return this.paidSoFar; 
	}

}
