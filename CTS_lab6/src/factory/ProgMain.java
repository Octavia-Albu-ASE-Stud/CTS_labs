package factory;

public class ProgMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IWeapon weapon; //hide this: new MaginWeapon();
		
		try {
			weapon = WeaponFactory.creatrWeapon(200);
			weapon.power();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
