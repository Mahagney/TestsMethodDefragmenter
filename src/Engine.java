import java.io.FileNotFoundException;
import java.util.EmptyStackException;

public class Engine {
	private float engineSpeed;
	private float currentTemperature;
	private float maxTemperature;
	private float size;
	private boolean madeFromIron;
	private float maxSpeed;
	private float weight;
	private int[] gears;
	private Object WaterPump;
	public Object getWaterPump() {
		return WaterPump;
	}

	public void setWaterPump(Object waterPump) {
		WaterPump = waterPump;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public Engine(float size, boolean madeFromIron) {
		this.size=size;
		this.madeFromIron=madeFromIron;
	}
	
	public float getEngineSpeed() {
		return engineSpeed;
	}
	public void setEngineSpeed(float engineSpeed) {
		this.engineSpeed = engineSpeed;
	}
	public float getTemp() {
		return currentTemperature;
	}
	public void setTemperature(float temperature) {
		this.currentTemperature = temperature;
	}
	public float getSize() {
		return size;
	}
	public void setSize(float size) {
		this.size = size;
	}
	public float getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(float maxSpeed){
		Engine e=null;
		e.getEngineSpeed();

		System.out.println("out");
		this.maxSpeed = maxSpeed;
	}
	public float getMaxTemp() {
		return maxTemperature;
	}
	public void setMaxTemperature(float maxTemperature) {
		this.maxTemperature = maxTemperature;
		throw new EmptyStackException();
	}

	public boolean getMadeFromIron() {
		return madeFromIron;
	}

	public void setMadeFromIron(boolean madeFromIron) {
		this.madeFromIron = madeFromIron;
	}
	
	public void printGears() {
		System.out.println("It has following gears:");
		int i;
		Car e=new Car();
		float engineSpeed2 = e.getCurrentTemperature();
		for(i=0;i<3;i++) {
			System.out.println(gears[i]);
			Owner p=new Owner();
			//p.getName();
		}
	}
}
