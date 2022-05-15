package abstractFactory;

public class MagicFactory implements IFactory{

	@Override
	public IWeapon getWeapon() {
		return new MagicWeapon();
	}

	@Override
	public ICostume getCostume() {
		// TODO Auto-generated method stub
		return new MagicCostume();
	}

}
