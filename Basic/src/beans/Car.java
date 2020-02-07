package beans;

public class Car {

	private Engine engine;
	
	private int price;

	Car(){
		System.out.println("car object....");
	}
	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		System.out.println("injecting engine");
		this.engine = engine;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		System.out.println("injecting price");
		this.price = price;
	}

	
	
	
}
