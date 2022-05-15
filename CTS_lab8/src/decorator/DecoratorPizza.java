package decorator;

public class DecoratorPizza extends APizza{
	
	// adaugam un obiect protected de tipul interfata/clasa abstracta
	protected APizza pizza;

	//CTOR
	public DecoratorPizza(APizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String getIngredients() {
		// TODO Auto-generated method stub
		return pizza.getIngredients();
	}

	@Override
	public float getCost() {
		// TODO Auto-generated method stub
		return pizza.getCost();
	}

}
