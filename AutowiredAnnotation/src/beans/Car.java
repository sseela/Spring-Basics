package beans;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {

	@Autowired
	@Qualifier(value="e1")				// autowire is done byType. If more than one bean is present(there will be ambiguity), then instead of autowire-candidate, we can use @Qualifier to specify the bean
	private Engine engine;
	
	private int price;
	
	private List<String> carlist;//doubt
	
	public Car(){
		
	}
	public Car(Engine engine, int price){
		System.out.println("constructor injecting");
		this.engine = engine;
		this.price = price;
	}
	
	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		System.out.println("setter injecting engine");
		this.engine = engine;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		System.out.println("setter injecting price");
		this.price = price;
	}

	public List<String> getCarlist() {
		return carlist;
	}

	public void setCarlist(List<String> carlist) {
		this.carlist = carlist;
	}

	
	
	
}
