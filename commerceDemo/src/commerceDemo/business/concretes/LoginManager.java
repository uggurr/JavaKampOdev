package commerceDemo.business.concretes;

import commerceDemo.business.abstracts.LoginService;
import commerceDemo.core.abstracts.CheckService;
import commerceDemo.core.abstracts.EmailService;
import commerceDemo.dataAccess.abstracts.UserDao;
import commerceDemo.entities.concretes.User;

public class LoginManager implements LoginService {

	
	private EmailService emailService;
	private CheckService checkService;
	private UserDao userDao;
	
	public LoginManager(EmailService emailService, CheckService checkService, UserDao userDao) {
		super();
		this.emailService = emailService;
		this.checkService = checkService;
		this.userDao = userDao;
	}

	@Override
	public void register(User user) {
		if (!userDao.checkEmailExists(user)) {
			System.out.println("Registration failed.\n" + user.getEmail() + "Bu email ile bir hesap kay�tl� !");
			return;
		}
		if (checkService.checkFirstName(user.getFirstName())) {
			System.out.println("isim do�ruland�");
		}
		else {
			return;
		}
		if (checkService.checklastName(user.getLastName())) {
			System.out.println("Soyisim do�ruland�");
		}
		else {
			return;
		}
		if (checkService.checkEmail(user.getEmail())) {
			System.out.println("Email do�ruland�");
		}
		else {
			return;
		}
		if (checkService.checkPassword(user.getPassword())) {
			System.out.println("�ifre do�ruland�");
		}
		else {
			return;
		}
		
		emailService.sendVerifyEmail(user);
		emailService.clickToVerify(user);
		userDao.add(user);
		System.out.println("Do�rulama ba�ar�l�!");
		
	}

	@Override
	public void login(String email, String password) {
		for (User users : userDao.getAll()) {
			if (email==users.getEmail()) {
				
				if(password!=users.getPassword()) {
					System.out.println("Giri� ba�ar�s�z. Emaliniz'i veya �ifrenizi kontrol ediniz");
					return;
				}
				System.out.println("giri� ba�ar�l�");
				return;
				
			}

		}
		
	}

}
