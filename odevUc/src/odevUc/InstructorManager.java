package odevUc;

public class InstructorManager extends UserManager{
	@Override
	
	public void add(User user) {
		System.out.println(user.getFirstName() + " -- Öðretmen eklendi");
	}
	public void update(User user) {
		System.out.println(user.getFirstName() + " -- Öðretmen güncellendi");
	}
	public void delete(User user) {
		System.out.println(user.getFirstName() + " -- Öðretmen silindi");
	}
	
	
	public void addCamp() {
		System.out.println("Kamp sisteme eklendi");
	}

}
