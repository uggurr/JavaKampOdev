package odevUc;

public class StudentManager extends UserManager{
	@Override
	
	public void add(User user) {
		System.out.println(user.getFirstName() + " -- Öðrenci eklendi");
	}
	public void update(User user) {
		System.out.println(user.getFirstName() + " -- Öðrenci güncellendi");
	}
	public void delete(User user) {
		System.out.println(user.getFirstName() + " -- Öðrenci silindi");
	}
	
}
