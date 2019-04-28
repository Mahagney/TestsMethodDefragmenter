import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Car {
	private float currentTemperature;
	private float weight;
	private Engine engine;
	private Owner person;
	public static int s = 0;
	private static float waterThreshold = 5.3f;
	private static float oilThreshold = 5.3f;
	private static float waterMaxTemperature = 5.3f;
	private static float waterFirstTemperatureLimit = 5.3f;

	public Car() {
		this.engine = new Engine(3, true);
		engine.setWeight(5);
	}

	public Engine getEngine() {
		return engine;
	}

	public float getTirePresure() {
		return 2.4f;
	}

	public float getWaterLevel() {
		return 2.4f;
	}

	public float getWaterTemperature() {
		return 2.4f;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public float calculateMaxEngineSpeed() {
		float speed = 0;
		try {
			float engineTemp = engine.getMaxTemperature();
			float engineSize = engine.getSize();
			boolean madeFromIron = engine.getMadeFromIron();
			if (engine.getMadeFromIron()) {
				person.getName();
				engineTemp = engine.getMaxTemperature();
				engineSize = engine.getSize();
				madeFromIron = engine.getMadeFromIron();
				float toAdd = engineTemp + engineSize / 2;
				speed = toAdd + engine.getWeight();
			} else {
				engineTemp = engine.getMaxTemperature();
				engineSize = engine.getSize();
				madeFromIron = engine.getMadeFromIron();
				float toSub = engineSize / 2;
				speed = engine.getWeight() - toSub;
				if (engine.getMadeFromIron()) {
					System.out.println("");
				} else
					engine.getEngineSpeed();
			}
			System.out.println("before exception in try");
			engine.setMaxSpeed(speed);
			System.out.println("after exception in try");
		} catch (NullPointerException e) {
			person.getName();
			System.out.println("after printstack in catch");
			e.printStackTrace();
			System.out.println("after printstack in catch");
		} finally {
			System.out.println("finally");

		}
		System.out.println("out car" + "");
		return speed;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public float getCurrentTemperature() {
		if (engine.getMadeFromIron())
			engine.getEngineSpeed();
		else {
			engine.getMadeFromIron();
			engine.getEngineSpeed();
		}
		return currentTemperature;
	}

	// no envy
	public void setCurrentTemperature(float currentTemperature) {
		engine.getMaxTemperature();
		engine.getSize();
		engine.getMadeFromIron();
		engine.getMadeFromIron();
		engine.getEngineSpeed();
		Owner o = new Owner();
		o.getName();
		do {
			this.currentTemperature = currentTemperature;

		} while (currentTemperature != this.currentTemperature);
	}

	public void whileTest(float currentTemperature) {
		engine.getMaxTemperature();
		engine.getSize();
		engine.getMadeFromIron();
		engine.getMadeFromIron();
		engine.getEngineSpeed();
		person.getName();
		while (currentTemperature != this.currentTemperature) {
			this.currentTemperature = currentTemperature;
			do {
				person.getName();
				this.currentTemperature = currentTemperature;

			} while (engine.getEngineSpeed() != this.currentTemperature);
		}
	}

	public void whileNoBodyTest(float currentTemperature) {
		engine.getMaxTemperature();
		engine.getSize();
		engine.getMadeFromIron();
		engine.getMadeFromIron();
		engine.getEngineSpeed();
		while (currentTemperature != this.currentTemperature)
			this.currentTemperature = currentTemperature;
	}

	public static void main(String[] args) {
		HashMap<Car, Integer> map = new HashMap<Car, Integer>();
		Car c1 = new Car();
		map.put(c1, (Integer) 3);
		map.put(c1, 5);
		Iterator<Entry<Car, Integer>> i = map.entrySet().iterator();
		while (i.hasNext()) {
			System.out.println(i.next().getValue());
		}
		System.out.println(map.get(c1));
	}

	public void test() {
		engine.getEngineSpeed();
		person.getName();
	}

	public void switchTest() {
		int month = 8;
		String monthString;
		person.getName();
		engine.getEngineSpeed();
		person.getName();
		switch (month) {
		case 1:
			monthString = "January";
			engine.getEngineSpeed();
			person.getName();
			break;
		case 2:
			monthString = "February";
			break;
		case 3:
			System.out.println("");
			monthString = "March";
			person.getName();
			break;
		default:
			monthString = "";
		}
	}

	public void testSynchronized() {
		System.out.println("");
		synchronized (engine.getWaterPump()) {
			System.out.println("");
			person.getName();
		}

		System.out.println("");
		synchronized (this) {
			System.out.println("");
			person.getName();
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(currentTemperature);
		result = prime * result + Float.floatToIntBits(weight);
		s++;
		return result + s;
	}

	public void testEnhancedFor() {
		int[] a = { 1, 2, 3, 4 };
		engine.getEngineSpeed();
		for (int i : a) {
			engine.getEngineSpeed();
			System.out.println(i);
			person.getName();
		}
		System.out.println("");
		for (int i : a) {
			engine.getEngineSpeed();
			System.out.println(i);
		}

	}

	public Owner getPerson() {
		return person;
	}

	public void setPerson(Owner person) {
		this.person = person;
	}

	public boolean checkCar() {

		if (getWaterLevel() > waterThreshold) {
			return false;
		}
		
		float waterTemperature = getWaterTemperature();
		if (waterTemperature > waterMaxTemperature) {
			return false;
		}
		
		float temperature = engine.getTemperature();
		float engineSpeed = engine.getEngineSpeed();
		if(engine.getMaxTemperature()< temperature){
			return false;
		}

		return true;
	}

}
