package proxy;

import java.util.Iterator;

public class ProgMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LoginModule loginModule = new LoginModule("admin", "1234");
		
		String [] dictionarPasswords = new String[] {"123456", "12345678", "alabala", "1234", "abcd", "adminpswd"};
		
		for (String string : dictionarPasswords) {
			if(loginModule.Login("admin", string)) {
				System.out.println("FOUND IT: " + string);
			}
		}
		
		System.out.println("-------------------------------");
		
		ProxyLogin proxy = new ProxyLogin(loginModule);
		for (String string : dictionarPasswords) {
			if(loginModule.Login("admin", string)) {
				System.out.println("FOUND IT: " + string);
			}
		}
	}

}
