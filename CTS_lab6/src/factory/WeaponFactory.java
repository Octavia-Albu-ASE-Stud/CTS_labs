package factory;

public class WeaponFactory {
	
	//creating it by some rules and hiding from the user the important information
	//think about the game
	//factory - simple, abstract, method
	public static IWeapon creatrWeapon(float price) throws Exception {
		if(price<200) {
			return new CheapWeapon();
		}
		if(price >= 200 && price <= 500) {
			return new NormalWeapon();
		}
		if(price > 500) {
			return new MagicWeapon();
		}else {
			throw new Exception("Something happened");
		}
	}

}
