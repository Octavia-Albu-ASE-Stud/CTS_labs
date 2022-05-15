package decorator;

public class ProgMain {

	public static void main(String[] args) {
	
		APizza pizzaBasic = new PizzaBasic();
		System.out.println(pizzaBasic.getIngredients() + " " + pizzaBasic.getCost());
		
		System.out.println();

		APizza pizzaChicken = new PizzaChicken(pizzaBasic);
		System.out.println(pizzaChicken.getIngredients() + " " + pizzaChicken.getCost());

	}

}
