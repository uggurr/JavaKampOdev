package odevUc;

public class InstructorManager extends UserManager{
	@Override
	
	public void add(User user) {
		System.out.println(user.getFirstName() + " -- ��retmen eklendi");
	}
	public void update(User user) {
		System.out.println(user.getFirstName() + " -- ��retmen g�ncellendi");
	}
	public void delete(User user) {
		System.out.println(user.getFirstName() + " -- ��retmen silindi");
	}
	
	
	public void addCamp() {
		System.out.println("Kamp sisteme eklendi");
	}

}
