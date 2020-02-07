package beans;

import java.util.List;

public class Car {

	private Engine engine;
	
	private int price;
	
	private List<String> carlist;//doubt
	public Car() {}
	public Car(Engine engine, int price){
		this.engine = engine;
		this.price = price;
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

	public List<String> getCarlist() {
		return carlist;
	}

	public void setCarlist(List<String> carlist) {
		this.carlist = carlist;
	}

	
	
	
}
