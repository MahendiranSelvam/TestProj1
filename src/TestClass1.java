
public class TestClass1 {

	public static void main(String[] args) {
		
		printWish("Hello","Sachin");
		
		Car car = new Car("Honda Civic", "Black");
		car.printCarDetails();
		

	}
	
	public static void printWish(String wish, String name) {
		System.out.println(wish + " " + name);
		
	}

}


