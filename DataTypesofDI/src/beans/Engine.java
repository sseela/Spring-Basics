package beans;

public class Engine implements Comparable{
	private int model;

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}
	
	public String toString() {
		return "toString:"+model;
	}

	@Override
	public int compareTo(Object o) {
		Engine engine = (Engine)o;
		int input2 = engine.getModel();
		int input1 = this.model;
		if(input1>input2) return 1;
		else if(input1<input2) return -1;
		else return 0;
	}
	
}
