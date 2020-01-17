

import java.util.*; 

public class SchoolManagementSystem { 
	

	public static void main (String args []) { 
		
		Scanner scan = new Scanner(System.in); 
		List<Teacher> teacherList = new ArrayList<>() ;
		List<Student> studentList = new ArrayList<>() ; 
		List<Integer> randomIdList = new ArrayList<>() ; 
		School School = new School(teacherList, studentList, randomIdList) ; 
		String str = "student";
		
		Teacher tom  = new Teacher(1 ,"Tom", 50000, 0); 
		Teacher Thomas = new Teacher(4, "Tom", 12000, 0); 
		Teacher cartman  = new Teacher(2, "Cartman", 35000, 0); 
		Teacher cart = new Teacher(3, "Cartman", 45000, 0); 
		
		teacherList.add(tom); 
		teacherList.add(cartman); 
		teacherList.add(cart); 
		teacherList.add(Thomas); 
		
		Student jerry = new Student(1, "Jerry", 12, 20000, 0, School);
		Student jery = new Student(3, "Jerry", 12, 20000,0, School);
		Student kyle = new Student(2, "Kyle", 4, 20000, 19999, School);  
		
		studentList.add(jerry); 
		studentList.add(kyle); 
		studentList.add(jery); 
		
		

		printInfo(School); 

		System.out.println(getGrade(jerry)); 
		int t = 0 ;
		while (t != -1) {
			System.out.println("1. add or remove a student");
			System.out.println("2. add or remove a teacher"); 
			System.out.println("3. modify or view student");
			System.out.println("4. modify or view teacher"); 
			System.out.println("5. view everything"); 
			System.out.println("");
			System.out.println("");
			System.out.println("");
			int a = scan.nextInt();   
			
			
			if(a == 1) {
				System.out.println("1. add a student");
				System.out.println("2. remove a student");
				int d = scan.nextInt(); 
				if (d == 1) {
					System.out.println("Please enter the students name");
					String name = inputWord();
					int id = School.generateNewIdNumber();
					System.out.println("What grade is the student in?");
					int grade = scan.nextInt(); 
					
					
					Student student = new Student(id, name, grade, 20000, 0, School); 
					studentList.add(student);
				}
				else if (d == 2) {
					System.out.println("Who would you like to remove? please enter the id"); 
					int id = scan.nextInt(); 
					studentList.remove(getStudentBasedOnId(id, School, studentList));
				}
			}
			else if (a ==2) {
				System.out.println("1. add a teacher");
				System.out.println("2. remove a teacher");
				int e = scan.nextInt(); 
				if (e == 1) {
					System.out.println("Please enter the teachers name");
					String name = inputWord() ; 
					System.out.println("Please enter a unique ID for the teacher"); 
					int id = scan.nextInt(); 
					System.out.println("Please enter their starting Salary"); 
					int salary = scan.nextInt() ; 
					Teacher teacher = new Teacher(id, name, salary, 0); 
					teacherList.add(teacher); 
				}
				else if (e == 2) {
					System.out.println("Who would you like to remove? please enter the id"); 
					int id = scan.nextInt(); 
					teacherList.remove(getTeacherBasedOnId(id, School, teacherList));
				}
				
			}
			
			else if (a == 3) {
				
			System.out.println("0. Look up a student with just the name") ; 
			System.out.println("1. Look up a student with just the id");
			System.out.println("2. Pay a students fee") ; 
			System.out.println("3. See a students current balance") ;
			System.out.println("4. See the fees paid for a student"); 
			System.out.println("5. See the grade of a student"); 
			
			 
			int b = scan.nextInt() ; 
			
				if (b== 0) { 
					System.out.println("Which student you would like to look up by name?");
					String name = inputWord() ;
					System.out.println(getStudentBasedOnName(name, School)) ;		
				}	
				else if (b == 1) {
					System.out.println("Please enter the Id of the student you would like to look up");
					int id = scan.nextInt();
					System.out.println(getStudentBasedOnId(id, School, studentList).toString());
				}
				else if (b == 2) {  
			 		
					System.out.println("Who's fees would you like to pay? (Please enter the ID) "); 
					int id = scan.nextInt(); 
					System.out.println("How much would you like to pay today? (Please enter an integer)") ; 
					int fee = scan.nextInt() ; 
					payFee(getStudentBasedOnId(id, School, studentList), fee, School) ; 
			 	}
			 	else if (b ==3 ) { 
			 		System.out.println("Who's fees for the year would you like to view?"); 
			 		int id = scan.nextInt(); 
			 		System.out.println(getFeesTotal(getStudentBasedOnId(id, School, studentList))) ; 
			 	}
			 	else if (b == 4){
					System.out.println("whos fees paid would you like to see? (please enter the ID");
					int id = scan.nextInt() ; 
					System.out.println(getStudentBasedOnId(id, School, studentList).getFeesPaid()) ;	
			 	}
			 	else if (b ==5) { 
			 		System.out.println("Who's grade would you like to view? (please enter the ID"); 
			 	}
			}
			if (a == 4) {
				
			
			System.out.println("0. Look up teachers with name.");
			System.out.println("1. Look up teachers with ID");
			System.out.println("2. Pay a teacher");
			System.out.println("3. update a teachers salary"); 
			
			int c = scan.nextInt(); 
			 	if (c == 0) { 
			 		System.out.println("Which teacher would you like to look up based on name?");
			 		String name = inputWord(); 
			 		System.out.println(getTeacherBasedOnName(name, School)); 
			 	}
			 	else if (c == 1) {
			 		System.out.println("Please enter the Id of the teacher you would like to look up"); 
			 		int id = scan.nextInt();
			 		System.out.println(getTeacherBasedOnId(id, School, teacherList).toString()); 
			 	}
			 	else if (c == 2) { 
			 		System.out.println("Who would you like to pay? please enter the teachers ID" ); 
			 		int id = scan.nextInt(); 
			 		System.out.println("How much would you like to pay them? please enter an integer"); 
			 		int pay = scan.nextInt();
			 		payTeacher(getTeacherBasedOnId(id, School, teacherList), pay, School);
			 			
			 	}
			 	else if (c == 3) {
			 		System.out.println("Who's Salary would you like to update? please enter the teachers ID");
			 		int id = scan.nextInt();
			 		System.out.println("How much of a raise would you like to give them?");
			 		int raise = scan.nextInt(); 
			 		getTeacherBasedOnId(id, School, teacherList).updateSalary(raise);
			 	}
			 	
			 	else { 
			 		t= -1 ; 
			 	}
			}
			if (a ==5) {
				printInfo(School) ;
			}
		
		}	
		
					
	}
	
	
	public static String studentObjectName(String str) {
		str.equals(str + Math.random());
		return str;
	}
	/**
	 * looks up all the teachers with the name you are searching. 
	 * there are two loops so that it returns all the teachers with the same name and not just the first one in the list. 
	 * @param name
	 * @param school
	 * @return
	 */
	public static String getTeacherBasedOnName(String name, School school) {
		String s = ""; 
		int integer = 0; 
		for	(int j = 0; j < school.getTeachers().size(); j++) {
			for ( int i = integer ; i < school.getTeachers().size(); i ++) {
				if (name.equals(school.getTeachers().get(i).getName())) {
					s += (school.getTeachers().get(i).toString() + "\n"); 
					
				}
				integer ++ ;
			}
		}
		return s; 
	}
	/**
	 * look up a teacher based on their ID.
	 * @param id
	 * @param school
	 * @param teacherList
	 * @return
	 */
	public static Teacher getTeacherBasedOnId(int id, School school, List<Teacher> teacherList)  { 
		for (int i = 0; i < teacherList.size() ; i ++) { 
			Teacher teacher = teacherList.get(i);
			if (teacher.getId() == id ) {
				return teacher; 
			}
			
			 
		}
		System.out.println("there are no Teachers with that ID"); 
		return null;
					
	}
	/**
	 * pays part of the teachers salary and increases the money spent by the school
	 * @param teacher
	 * @param pay
	 * @param school
	 */
	public static void payTeacher(Teacher teacher, int pay, School school) { 
		
		teacher.pay(pay); 
		school.setTotalMoneySpent(pay); 
		school.updateTotalMoney(-pay);
		System.out.println("their salary for the year is " + teacher.getSalary()); 
		System.out.println("and they have been paid: " + teacher.getPaidSoFar() + " so far this year");
		
	}
	/**
	 * goes through the school and prints the list of the teachers and students
	 * including their name ID salary fees paid and fees total
	 * Additionally it prints the amount of money in the bank, the total money earned, and the total spent
	 * @param school
	 */
	public static void printInfo(School school) { 
		System.out.println("Teachers"); 
		school.printTeacherList(school.getTeachers());
		System.out.println("Students");
		school.printStudentList(school.getStudents());
	
		
		System.out.println("Total Money");
		System.out.println(school.getTotalMoney()) ; 
		System.out.println("Total Money Earned"); 
		System.out.println(school.getTotalMoneyEarned());
		System.out.println("Total Moeny Spent"); 
		System.out.println(school.getTotalMoneySpent());
		
	}
	
	
	/**
	 * looks up a student based on their id 
	 * @param id
	 * @param school
	 * @param studentList
	 * @return
	 */
	public static Student getStudentBasedOnId(int id, School school, List<Student> studentList)  { 
		for (int i = 0; i < studentList.size() ; i ++) { 
			Student student = studentList.get(i);
			if (student.getId() == id ) {
				return student; 
			}
			
			 
		}
		System.out.println("there are no students with that ID"); 
		return null;
					
	}
		 
		
		
					
	
	/**
	 * returns all the students with the same name
	 * @param name
	 * @param school
	 * @return
	 */
	public static String getStudentBasedOnName(String name, School school) {
		String s = ""; 
		int integer = 0; 
		for	(int j = 0; j < school.getStudents().size(); j++) {
			for ( int i = integer ; i < school.getStudents().size(); i ++) {
				if (name.equals(school.getStudents().get(i).getName())) {
					s += (school.getStudents().get(i).toString() + "\n"); 
					
				}
				integer ++ ;
			}
		}
		return s; 
	}
	/**
	 * 	there was some kind of bug that wouldn't scan for user input before continuing on so i had to make a method and force it to execute first
	 * @return
	 */
	public static String inputWord() { 
		Scanner scan = new Scanner(System.in); 
		String word = scan.nextLine() ; 
		return word; 
	}
	/**
	 * pays student fees 
	 * @param student
	 * @param fee
	 */
	public static void payFee(Student student, int fee, School school) { 
		student.updateFeesPaid(fee);
		school.updateTotalMoneyEarned(fee);
		school.updateTotalMoney(fee);
	}
	/**
	 * see the total fees that a student owes for the year 
	 * @param student
	 * @return
	 */
	public static int getFeesTotal(Student student) { 
		return student.getFeesTotal() - student.getFeesPaid() ; 
	}
	
	public static int getFeesPaid(Student student) {
		return student.getFeesPaid() ; 
	}
	
	public static int getGrade(Student student) {
		return student.getGrade(); 
		 
	}


	
	

	
	
		
	

}

