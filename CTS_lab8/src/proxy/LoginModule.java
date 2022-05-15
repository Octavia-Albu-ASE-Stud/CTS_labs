package proxy;

public class LoginModule implements ILoginModule{

	private String username;
	private String password;
	
	public LoginModule(String string, String string2) {
		this.username = string;
		this.password = string2;
	}

	@Override
	public boolean Login(String username, String password) {
		if ((this.username == username) && (this.password == password)) {
			return true;
		} else {
			return false;
		}
	}

}
