package commerceDemo.business.concretes;

import commerceDemo.business.abstracts.LoginService;
import commerceDemo.business.abstracts.UserService;
import commerceDemo.core.abstracts.GoogleService;
import commerceDemo.entities.concretes.User;

public class UserManager implements UserService{
	
	private LoginService loginService;
	private GoogleService googleService;
	
	public UserManager(LoginService loginService, GoogleService googleService) {
		
		this.loginService = loginService;
		this.googleService = googleService;
	}
	
	@Override
	public void register(User user) {
		loginService.register(user);
		
	}

	@Override
	public void login(String email,String password) {
		loginService.login(email,password);

		
	}

	@Override
	public void loginToGoogle() {
		googleService.registerToSystem();
		
	}
	
}
