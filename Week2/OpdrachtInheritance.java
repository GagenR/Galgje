package Week2;

import java.util.ArrayList;

public class OpdrachtInheritance {
	public static void main(String[] args) {
		Voertuig voertuig = new Fiets(); //je kan wel variabelen van het abstracte maken, maar geen objecten
		// omdat de class nu niet meer geïnstantieerd kan worden.
		Voertuig voertuig2 = new DeltaVlieger();
		System.out.println(voertuig.snelheid);
		Fiets fiets = new Fiets();
		System.out.println(fiets.snelheid); //door overerfing kan snelheid worden aangeroepen
		fiets.snelheid = 12; //alleen eigenschap wordt overgeerf, niet de waarde(12)
		System.out.println(fiets.snelheid);
		System.out.println(voertuig.snelheid);
		fiets.trappers = 15;
	//	voertuig.trappers = 3; //trappers is specifieke eigenschap van fiets en niet van voertuig
		voertuig.voortbewegen();
		fiets.voortbewegen();
		Voertuig rc = new RaceFiets();
		
	
	}
}
abstract class Voertuig{
	int snelheid = 23;
	abstract void voortbewegen(); // als een methode abstract is dan veranderen er een paar dingen:
		// 1. hij mag geen body hebben,dus geen accoladers, in plaats daarvan zet je ";" er achter 
	//2. de void moet abstract zijn
	
}

class DeltaVlieger extends Voertuig{
	void voortbewegen() {
		System.out.println("Voortbewegen in Deltavlieger"); //hij overerft void voortbewegen van classe Voertuig
	}
	
}

class Fiets extends Voertuig{ //door het woordje "extends" neemt eigenschappen over van class Voertuig
	void voortbewegen(){
		System.out.println("Voortbewegen in fiets");
	}
	int trappers = 2;
}

class RaceFiets extends Fiets{
	
}

// bij overriding moet de signature hetzelfde zijn, het returntype moet hetzelfde zijn, dan wel covariant,

