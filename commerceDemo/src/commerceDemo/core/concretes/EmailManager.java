package commerceDemo.core.concretes;

import commerceDemo.core.abstracts.EmailService;
import commerceDemo.entities.concretes.User;

public class EmailManager implements EmailService{

	@Override
	public void sendVerifyEmail(User user) {
		System.out.println("Doðrulama baðlantýsý emailiniz'e gönderildi :" + user.getEmail());
		
	}

	@Override
	public void clickToVerify(User user) {
		System.out.println("emailiniz'i doðrulamak için týklayýn :" + user.getFirstName());
		
	}

}
