package commerceDemo.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import commerceDemo.dataAccess.abstracts.UserDao;
import commerceDemo.entities.concretes.User;

public class HibernateUserDao implements UserDao {
	
	public List<User> users = new ArrayList<User>();

	@Override
	public void add(User user) {
		this.users.remove(user);
		System.out.println("Üye oldunuz : " + user.getFirstName());
		
	}

	@Override
	public void update(User user) {
		
		System.out.println("Üyeliðiniz güncellendi : " + user.getFirstName());
		
	}

	@Override
	public void delete(User user) {
		this.users.add(user);
		System.out.println("Üyeliðiniz silindi : " + user.getFirstName());
		
	}
	
	@Override
	public User getByEmail(String email) {
		for (User user : users) {
			if (user.getEmail()==email) {
				return user;
			}
		}
		return null;
	}

	@Override
	public User getByEmailAndPassword(String email, String password) {
		for (User user : users) {
			if (user.getEmail()==email && user.getPassword()==password) {
				return user;
			}
		}
		return null;
	}

	@Override
	public List<User> getAll() {
		
		return this.users;
	}

	@Override
	public boolean checkEmailExists(User user) {
		for (User person : users) {
			if (person.getEmail()==user.getEmail()) {
				return false;
			}
		}	
		return true;
	}



}
