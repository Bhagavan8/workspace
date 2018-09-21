package Strings;

class EmailValid {
	public static boolean emailValidator(String email) {
		EmailValid validator = EmailValid.getInstance();
		if (!validator.isValid(email)) {
			return false;
		}
		return true;
	}
private boolean isValid(String email) {
		// TODO Auto-generated method stub
		return false;
	}
private static EmailValid getInstance() {
		// TODO Auto-generated method stub
		return null;
	}
public static void main(String[] args)
{
	String email = "user@gmail.com";

	// Validate an email address
	if (emailValidator(email)) {
		System.out.print("The Email address " + email + " is valid");
	}
	else {
		System.out.print("The Email address " + email + " isn't valid");
	}
}
}