package commerceDemo.core.abstracts;

import commerceDemo.entities.concretes.User;

public interface EmailService {
	void sendVerifyEmail(User user);
	void clickToVerify(User user);
}
