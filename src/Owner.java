import java.util.Date;

public class Owner {

	private String name;
	private int birthYear=1994;
	
	public String getName() {
		return name;
	}
	
	public int getAge(int currentYear) {
		 currentYear=currentYear-birthYear;
		 System.out.println("age="+currentYear);
		return currentYear;
	}
	
	@SuppressWarnings("deprecation")
	public int setAge(Date date) {
		date.setYear(2000);
		return 2;
	}
	
	public static void main(String []args) {
		Owner o=new Owner();
		o.getAge(2018);
		Date d=new Date(2018,12,25);
		o.setAge(d);
		System.out.println("date="+d.getYear());

	}
}
