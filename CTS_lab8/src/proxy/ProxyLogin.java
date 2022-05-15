package proxy;

public class ProxyLogin  implements ILoginModule{
	// use interface
	ILoginModule moduleLogin;
	int counter = 0;
	
	// ctor
	public ProxyLogin(ILoginModule moduleLogin) {
		super();
		this.moduleLogin = moduleLogin;

	}

	
	@Override
	public boolean Login(String username, String password) {
		// TODO Auto-generated method stub
		if (counter >= 3) {
			System.out.println("brutforce detected");
			return false;
		}
		boolean result = this.moduleLogin.Login(username, password);
		if(!result) {
			counter++;
		}
		else {
			counter = 0;
		}
		return result;
	}

}
