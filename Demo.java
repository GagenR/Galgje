//import java.util.Scanner;



class Demo { 
	int g; //instantie variabele || field
	static int h; // klasse variabele, als je final static doet, dan wordt deze niet geinitialiseerd.
	// final houdt in dat je deze niet kan veranderen, maar Java wilt wel weten wat de waarde is
	public static void main(String[] args) {
		Demo mijnDemo = new Demo(); //instantieren
		mijnDemo.starten(); //instantieren 
	}
	void starten()  {
		int a; // lokale variabele NIET AUTOMATISCH geinitieerd worden
	//	if(a == 3) {
			
	//	}
		String b;
		b = "";
		b = new String();
		Huis mijnHuis = new Huis();
		
	}
	
	void aanschaffen() {
		kopen(4);
		kopen(14);
	}
	void kopen(int a) {  //parameter ALTIJD geinitieerd
		
	}
class Huis {
	
}
}


	
	/*	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String hetWoord = "Lantaarn";
		int aantal = hetWoord.length();
		System.out.println(aantal);
		for(int x = 0; x < aantal ;x++) {
			System.out.print(".");
		
		}
		boolean doorspelen = true;
		while(doorspelen) {
			System.out.println("Welke letter wil je proberen?");
			String gegevenAntwoord = scanner.nextLine();	
			if (gegevenAntwoord.equals("qq")){
				doorspelen=false;
			}
			
			System.out.println(gegevenAntwoord);
			System.out.println(hetWoord.contains(gegevenAntwoord));
	
		}
		}
	}
*/	
	
