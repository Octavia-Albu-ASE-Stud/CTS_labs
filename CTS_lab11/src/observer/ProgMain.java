package observer;

public class ProgMain {

	public static void main(String[] args) {
		
		RainEvent rain = new RainEvent("rain");
		
		IHandler anto = new AntoHandler();
		IHandler diana = new DianaHandler();
		IHandler ale = new AleHandler();
		
		rain.subscribeHandler(anto);
		rain.subscribeHandler(diana);
		rain.subscribeHandler(ale);
		
		rain.activateEvent();
	}

}
