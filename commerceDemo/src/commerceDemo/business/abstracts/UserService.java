package commerceDemo.business.abstracts;

import commerceDemo.entities.concretes.User;

public interface UserService {
	void register(User user);
	void login(String email, String password);
	void loginToGoogle();
}
