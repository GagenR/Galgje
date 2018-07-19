
public class Les2 {

		public static void main(String[] args) {
			Auto auto1;
			auto1 = new Auto();
			Auto auto2 = new Auto();
			Auto auto3 = new Auto();
			
			auto1.kleur = "rood";
			auto1.kentekenplaat = "PV-JS-80";
			auto1.merk = "Audi";
			auto1.paardenkracht = 555;
			auto1.presenteren();
			
			auto2.kleur = "blauw";
			auto2.kentekenplaat = "JJ-272-1";
			auto2.merk = "Mercedes";
			auto2.paardenkracht = 286;
			auto2.presenteren();
			
			auto3.kleur = "zwart";
			auto3.kentekenplaat = "PSV-040";
			auto3.merk = "BMW";
			auto3.paardenkracht = 829;
			auto2.racen(7);
		
			auto3.presenteren();
			auto3.racen();
			auto1.racen(3);
			Auto Lamborgini = auto3.racen("Lamborgini");
					
			System.out.println(Lamborgini.merk);
		
		}
}
		class Auto {
		String kleur;
		String merk;
		String kentekenplaat;
		int paardenkracht;
		
		
		
		void presenteren() {
			
			System.out.println("Mijn " + merk + " is " + kleur 
					+ ", met kentekenplaatnummer " 
				+ kentekenplaat + " en heeft " + paardenkracht);
		}
		
		
		void racen() {
			System.out.println("De auto's gaan racen!");
			
		}
		
		Auto racen(String merk) { //de Auto is een return type
			Auto Lamborgini = new Auto();
			Lamborgini.merk = "Lamborgini";
			System.out.print("Mijn nieuwe auto is ");
			return Lamborgini;
			
		}
		
		void racen(int r){  //byte is een parameter in dit geval. 
			// Dit komt omdat byte de waarde moet weergeven in een byte
			// aantal is de naam van de parameter
			System.out.println("De " + merk + " heeft " + r + " keer geraced!");
		}
 						
		
	}
		