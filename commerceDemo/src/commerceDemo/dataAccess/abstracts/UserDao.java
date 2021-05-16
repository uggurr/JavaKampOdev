package commerceDemo.dataAccess.abstracts;

import java.util.List;

import commerceDemo.entities.concretes.User;

public interface UserDao {
	void add(User user);
	void update(User user);
	void delete(User user);
	User getByEmail(String email);
	User getByEmailAndPassword(String email,String password);
	List<User> getAll();
	boolean checkEmailExists(User user);
}
