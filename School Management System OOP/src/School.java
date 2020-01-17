import java.util.List;
public class School {
	/**
	 * this has teachers, students, fees owed, fees paid  
	 * implements teachers and students using an arrayList
	 */
	
	/**
	 * this is an array list of teacher objects
	 */
	private List<Teacher> teachers; 
	/**
	 * this is an array of student objects
	 */
	private List<Student> students; 
	/**
	 * the money earned and spent
	 */
	private List<Integer> randomId; 
	
	private int totalMoneyEarned; 
	private int totalMoneySpent;
	private int totalMoney; 
	
	/**
	 * a new school object is created
	 * @param teachers list of the teachers 
	 * @param students list of the students
	 */
	public School(List<Teacher> teachers, List<Student> students, List <Integer> randomId) {
		
		this.teachers = teachers;
		this.students = students;
		totalMoneyEarned = 0 ; 
		totalMoneySpent = 0; 
		this.randomId = randomId; 
	}
	/**
	 * returns the list of teachers in the school 
	 * @return
	 */
	public List<Teacher> getTeachers() {
		return teachers;
	}
	/**
	 * goes through the list of teachers, and prints their name, ID, salary. 
	 * @param teacherList
	 */
	public void printTeacherList(List<Teacher> teacherList) {
		for (int i = 0; i < teacherList.size(); i++) {
			Teacher teacher = teacherList.get(i);
			System.out.println(teacher.toString()) ; 
		}
	}
	/**
	 * goes through the list of students, and prints name, id, grade, etc 
	 * @param studentList
	 */
	public void printStudentList(List<Student> studentList) {
		for (int i = 0; i < studentList.size(); i++) {
			Student student = studentList.get(i);
			System.out.println(student.toString()) ; 
		}
	}
	
	/**
	 * adds a teacher to the school
	 * @param teachers the new teacher 
	 */
	public void addTeachers(Teacher teacher) {
		teachers.add(teacher);
	}


	public List<Student> getStudents() {
		return students;
	}
	
	public List<Integer> getRandomId() { 
		return randomId; 
	}
	/** 
	 * adds a student to the list of students
	 * @param student
	 */
	public void addStudents(Student student) {
		students.add(student); 

	}

	/**
	 * get the total money earned from the school 
	 * @return
	 */
	
	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}

	/**
	 * adds the money earned to the total money earned 
	 * @param totalMoneyEarned
	 */
	public void updateTotalMoneyEarned(int moneyEarned) {
		totalMoneyEarned += moneyEarned; 
		
	}
	
	public void updateTotalMoney(int money) {
		totalMoney += money; 
	}

	/**
	 * returns the total money spent
	 * @return
	 */
	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}

	/**
	 * 
	 * @param totalMoneySpent
	 */
	public void setTotalMoneySpent(int totalMoneySpent) {
		this.totalMoneySpent += totalMoneySpent;
		
	} 
	
	public int getTotalMoney() { 
		return totalMoney ; 
	}
	
	public void setTotalMoney() { 
		this.totalMoney = totalMoneyEarned - totalMoneySpent ; 
	}
	
	public int generateNewIdNumber() { 
		int num = (int) (Math.random() * Math.pow(10,9)); 
		
		for (int i = 0; i < this.randomId.size(); i ++) { 
			if (num == this.randomId.get(i)) {
				num = (int)(Math.random()); 
			}
			else {
			}
			
			
		}
		randomId.add(num); 
		return num; 
	}
	
	
	
}
