package commerceDemo;

import commerceDemo.business.abstracts.UserService;
import commerceDemo.business.concretes.LoginManager;
import commerceDemo.business.concretes.UserManager;
import commerceDemo.core.adabters.GoogleManagerAdapter;
import commerceDemo.core.concretes.CheckManager;
import commerceDemo.core.concretes.EmailManager;
import commerceDemo.dataAccess.concretes.HibernateUserDao;
import commerceDemo.entities.concretes.User;

public class Main {

	public static void main(String[] args) {

		UserService userService = new UserManager(new LoginManager(new EmailManager(), new CheckManager(), new HibernateUserDao()), 
				new GoogleManagerAdapter());
		
		User user = new User(1,"Uður","Yýldýz","uggurryldz@gmail.com","123456");
		userService.register(user);
		userService.login("uggurryldz@gmail.com", "123456");

	}

}
