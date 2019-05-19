
public class testInIsolation {
	public void testif(Car c){
		int a=4;
		
		if(a==3){
			c.getEngine();
			c.getEngine().getEngineSpeed();
			int e =3;
			int f=5;
			Owner o=null;
			o.getAge();
		}
	}
	
	public void testiftwo(Car c){
		int a=4;
		
		if(a==3){
			c.getEngine();
			c.getEngine().getEngineSpeed();
			int e =3;
			int f=5;
			Owner o=null;
			c.getPerson();
		}
	}
	
	public void testifthree(Car c){
		int a=4;
		
		if(a==3){
			c.getEngine();
			c.getEngine().getEngineSpeed();
			int e =3;
			int f=5;
			Owner o=null;
		}
	}
}
