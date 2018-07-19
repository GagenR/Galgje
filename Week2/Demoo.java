package Week2;

public class Demoo {
	public static void main(String[] args) {
		Bakker bakker = new Bakker();
		Pizza eenPizza = bakker.pizzaMaken();
		System.out.println(eenPizza.gebakken);
//		eenPizza.pizzaBakken();
		bakker.oven.pizzaBakken(eenPizza);
		System.out.println(eenPizza.gebakken);
		Bezorger eenBezorger = new Bezorger(true); //gelijk aangeven of het vegatarisch is of ofniet
		eenBezorger.pizzaBezorgen(eenPizza);
		System.out.println(eenPizza.gebakken);
		Ingredient[] ingredienten = {new Ingredient("Kaas "), new Ingredient("Döner"), new Ingredient("Kip")};
		Pizza tweedePizza = bakker.pizzaMaken(ingredienten);
		System.out.println(tweedePizza);
	}
}
class Pizza{
	boolean zachteBodem;
	int diameter;
	boolean gebakken;
	Ingredient ingredienten[] = new Ingredient[6];
//	int[] getallen = new int[6];
	public String toString() {
		String returnString = "";
		for(Ingredient i : ingredienten) {
			returnString += i.soort;
		}
		return "De pizza "+ returnString;
	}
}
class Ingredient{
	String soort;
	boolean vegetarisch;
	Ingredient(String deSoort) {
		soort = deSoort;
	}
}
class Bezorger{
	String naam;
	int leeftijd;
	private boolean bezorgtVegetarisch;
	Bezorger(boolean isVegetarisch) {
		bezorgtVegetarisch = isVegetarisch;
	}
	boolean pizzaBezorgen(Pizza lamacun) {// je kan niet in je argumentenlijst al beslissen
		//of je pizza is gebakken of niet
		if(lamacun.gebakken == true) {
			System.out.println("Bezorger gaat bezorgen");
		}else {
			System.out.println("Bezorger blijft thuis");
		}
		return true;
		// we beloven plechtig dat we een "boolean" return terug krijgen, let op rode lijnen
	}
}
class Bakker{
	String naam;
	String gereedschap;
	Oven oven = new Oven(); //door deze instantiering geef je aan de dat over van de Bakker is.
	Pizza pizzaMaken(){
		Pizza pizza = new Pizza();
		return pizza;//je moet pizza terug geven, nagaan wat je terug krijgt. 
		// bijv. je gaat naar fiets winkel en je wilt fiets, dan krijg je ook fiets terug, 
		// en niet alleen ventiel
	
	}
	Pizza pizzaMaken(Ingredient[] ingredienten) {
		Pizza pizza = new Pizza();
		pizza.ingredienten = ingredienten;
		return pizza;
	}
}
class Oven{
	int temperatuur;
	String merk;
	void pizzaBakken(Pizza pizza){
		pizza.gebakken = true;
	}
}

