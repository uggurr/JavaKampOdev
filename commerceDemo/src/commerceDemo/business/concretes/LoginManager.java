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
			System.out.println("Registration failed.\n" + user.getEmail() + "Bu email ile bir hesap kayýtlý !");
			return;
		}
		if (checkService.checkFirstName(user.getFirstName())) {
			System.out.println("isim doðrulandý");
		}
		else {
			return;
		}
		if (checkService.checklastName(user.getLastName())) {
			System.out.println("Soyisim doðrulandý");
		}
		else {
			return;
		}
		if (checkService.checkEmail(user.getEmail())) {
			System.out.println("Email doðrulandý");
		}
		else {
			return;
		}
		if (checkService.checkPassword(user.getPassword())) {
			System.out.println("Þifre doðrulandý");
		}
		else {
			return;
		}
		
		emailService.sendVerifyEmail(user);
		emailService.clickToVerify(user);
		userDao.add(user);
		System.out.println("Doðrulama baþarýlý!");
		
	}

	@Override
	public void login(String email, String password) {
		for (User users : userDao.getAll()) {
			if (email==users.getEmail()) {
				
				if(password!=users.getPassword()) {
					System.out.println("Giriþ baþarýsýz. Emaliniz'i veya þifrenizi kontrol ediniz");
					return;
				}
				System.out.println("giriþ baþarýlý");
				return;
				
			}

		}
		
	}

}
