package Week2;

public class Demo2 {

	public static void main(String[] args) {
		int qq = 6; //deze blijft zelfde
		System.out.println(qq);
		ab(qq); 			// deze is losstaand kopietje van 
		System.out.println(qq); //deze blijft zelfde als boven, is slecht een copy by value
		Auto auto = new Auto();
		
		System.out.println("==================");
		
		System.out.println(auto.aantalWielen); 
		cd(auto); 
		System.out.println(auto.aantalWielen); //hier wordt het 4, dit is copy by referece (object)
		
	}
	static void ab(int a) {
		a = 5;
	}
	static void cd(Auto a) {
		a.aantalWielen = 4;
	}
	
}
class Auto{
	int aantalWielen = 3;
}