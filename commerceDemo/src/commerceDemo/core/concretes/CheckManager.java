package commerceDemo.core.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import commerceDemo.core.abstracts.CheckService;

public class CheckManager implements CheckService {
	
	public static final String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";

	@Override
	public boolean checkFirstName(String firstName) {
		if (firstName.length()<3) {
			System.out.println("Ýsim 2 Karakterden az olmamalýdýr.");
			return false;
		}
		return true;
	}

	@Override
	public boolean checklastName(String lastName) {
		if (lastName.length()<3) {
			System.out.println("Soy isim 2 Karakterden az olmamalýdýr.");
			return false;
		}
		return true;
	}

	@Override
	public boolean checkEmail(String email) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		if (!matcher.matches()) {
			System.err.println("Mail formatýnda olmalýdýr.");
			return false;
		}
		return true;
	}

	@Override
	public boolean checkPassword(String password) {
		if (password.length()<6) {
			System.out.println("Þifre 6 karakterden az olmamalýdýr.");
			return false;
		}
		return true;
	}

}
