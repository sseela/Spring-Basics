package beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Car {

	private Engine engine;
	
	private int price;
	
	private Map<String, Integer> carMap;
	
	private Set<Engine> engineSet;
	
	private List<String> carList;
	
	
	public Map<String, Integer> getCarMap() {
		return carMap;
	}
	public void setCarMap(Map<String, Integer> carMap) {
		this.carMap = carMap;
	}
	public Set<Engine> getEngineSet() {
		return engineSet;
	}
	public void setEngineSet(Set<Engine> engineSet) {
		this.engineSet = engineSet;
	}
	public List<String> getCarList() {
		return carList;
	}
	public void setCarList(List<String> carList) {
		this.carList = carList;
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
