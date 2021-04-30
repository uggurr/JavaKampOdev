package odevUc;

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.setId(1);
		student1.setFirstName("Uður");
		student1.setLastName("Yýldýz");
		student1.setMail("mail@gmail.com");
		student1.setPassword("12345");
		
		Student student2 = new Student();
		student2.setId(2);
		student2.setFirstName("Taha");
		student2.setLastName("Yýldýz");
		student2.setMail("mail@gmail.com");
		student2.setPassword("54321");
		
		Instructor instructor1 = new Instructor();
		instructor1.setId(3);
		instructor1.setInstructorId(34);
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demiroð");
		instructor1.setMail("mailMail@gmail.com");
		instructor1.setPassword("6789");
		
		Instructor instructor2 = new Instructor();
		instructor2.setId(4);
		instructor2.setInstructorId(45);
		instructor2.setFirstName("Atýl");
		instructor2.setLastName("Samancýoðlu");
		instructor2.setMail("mail4@gmail.com");
		instructor2.setPassword("9876");
		
		User[] users = {student1,student2,instructor1,instructor2};
		System.out.println("--------------Kullanýcýlar---------");
		for (User user : users) {
			
			System.out.println("Kullanýcý adý :" +  user.getFirstName() + " " + user.getLastName());
		}
		
		System.out.println("---------------Öðrenciler---------");
		Student[] students = {student1,student2};
		for (Student student : students) {
			System.out.println("Öðreci adý :" + student.getFirstName() + "///" + "Ýlerleme Durumu :" + student.getPercent());
		}
		

		System.out.println("---------------Öðretmenler---------------------");
		
		Instructor[] instructors = {instructor1,instructor2};
		for (Instructor instructor : instructors) {
			System.out.println("Öðretmen adý :" + instructor.getFirstName() + " " + instructor.getLastName());
		}
		
		
		System.out.println("------------------------------------");
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student1);
		
		System.out.println("------------------------------------");
		
		UserManager userManager = new UserManager();
		userManager.add(student1);		
		userManager.add(instructor1);
		
		
		System.out.println("------------------------------------");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor1);
		instructorManager.addCamp();
		

	}

}
