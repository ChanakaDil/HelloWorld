
public class Main {
	public static void main(String args[]){
		Vehicle v1 = new Bus();
		Vehicle v2 = new Van();
		
		v1.start();
		v1.drive();
		
		v2.start();
		v2.drive();
	}
}
