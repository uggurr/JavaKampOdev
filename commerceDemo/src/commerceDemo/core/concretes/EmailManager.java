package commerceDemo.core.concretes;

import commerceDemo.core.abstracts.EmailService;
import commerceDemo.entities.concretes.User;

public class EmailManager implements EmailService{

	@Override
	public void sendVerifyEmail(User user) {
		System.out.println("Do�rulama ba�lant�s� emailiniz'e g�nderildi :" + user.getEmail());
		
	}

	@Override
	public void clickToVerify(User user) {
		System.out.println("emailiniz'i do�rulamak i�in t�klay�n :" + user.getFirstName());
		
	}

}
