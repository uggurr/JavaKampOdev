package odevUc;

public class StudentManager extends UserManager{
	@Override
	
	public void add(User user) {
		System.out.println(user.getFirstName() + " -- ��renci eklendi");
	}
	public void update(User user) {
		System.out.println(user.getFirstName() + " -- ��renci g�ncellendi");
	}
	public void delete(User user) {
		System.out.println(user.getFirstName() + " -- ��renci silindi");
	}
	
}
