import java.util.List;

public class Student {
	/**
	 *this class is responsible of keeping track of students 
	 *student  name, id grade, fees paid and fees paid 
	 *
	 */
	
	private int id ; 
	private String name; 
	private int grade; 
	private int feesPaid ; 
	private int feesTotal;
	
	
	/**
	 * To create a new Student by initializing the id, name and grade 
	 * @param id 
	 * @param name
	 * @param grade
	 */
	public Student(int id, String name, int grade, School school) { 
		/**
		 * this is how you create a new student object, the id name and grade in the method is then used to create the attributes for the class and the student object. The basic fee per year is $20,000 this is an expensive school, still cheaper than Waterloo though
		 */
		
		this.id = school.generateNewIdNumber();  
		this.name = name; 
		this.grade = grade; 
		this.feesPaid = 0; 
		this.feesTotal = 30000;
		
	
	}
	
	public static String toString(Student student) {
		return "Name: " + student.getName() + "   " + "ID: " + student.getId() + "   " + "Grade: " + student.getGrade() + "   " + "Fees Total: " + student.getFeesTotal() + "   " + "Fees Paid: " + student.getFeesPaid() ;
	}
	@Override 
	public String toString() {
		return "Name: " + name + "   " + "ID: " + id + "   " + "Grade: " + grade + "   " + "Fees Total: " + feesTotal + "   " + "Fees Paid: " + feesPaid ;  
	}
	/**
	 * overloaded Student method if you want to initialize the fees paid and fees total from the get go. 
	 * @param id
	 * @param name
	 * @param grade
	 * @param feesTotal
	 * @param feesPaid
	 */
	public Student(int id, String name, int grade, int feesTotal, int feesPaid, School school) { 
		this.id = id; 
		this.name = name; 
		this.grade= grade; 
		this.feesTotal = feesTotal; 
		this.feesPaid = feesPaid; 
								
	}
	/**
	 * we are updating the grade of the student, by changing the grade to the grade in the argument 
	 * @param grade is the new grade of the student
	 */
	public void setGrade(int grade) { 
		this.grade = grade; 
		
		
	}
	/**
	 * updates how much has been paid
	 * adds fees to feesPaid to create a new feesPaid 
	 * @param fees how much was paid in this installment 
	 */
	public void updateFeesPaid(int fees) { 
		this.feesPaid = (feesPaid + fees)  ; 
	}
	
	public int getId() {
		return this.id; 
	}
	
	public String getName() {
		return this.name;
		
	}
	
	public int getGrade() {
		return this.grade ; 
	}
	
	public int getFeesPaid() {
		return this.feesPaid;	
	}
	
	public int getFeesTotal() { 
		return this.feesTotal ; 
	}
	
	public Student returnStudentWithId(int id, School school) { 
		List<Student> students = school.getStudents(); 
		for (int i = 0; i < school.getStudents().size() ; i ++) {
			if (id == students.get(i).getId()) { 
				return students.get(i) ; 
			}
			
			
		}
		return null; 
	}
	
	
	
	
	

}
