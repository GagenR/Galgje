package Week3;

// als we deze code uitvoeren print hij : Niemand kijkt, Op bruiloft buiten te jong exception 
//en Ik word altijd uitgevoerd. 
//Toelichting stap voor stap: Bij de main wordt methode new Bruiloft().champagneMoment(); aangeroepen 
//(Let op: achter de main is hierbij ook throws Exception toegevoegd
//

public class ExceptionDeel2 {

	public static void main(String[] args) throws Exception{
		new Bruiloft().champagneMoment();

	}
}
class Bruiloft{
	Barman barman = new Barman();
	void champagneMoment() throws Exception{ //deze throws Exception is overbodig, hij waarschuwt namelijk voor Niks
		Persoon jan = new Persoon();
		jan.leeftijd = 17;
		try {
			barman.alcoholBedienen(jan);
		}catch(TeJongException te) {
			System.out.println("Ff moeder waarschuwen");
		}catch(Exception e) {
			System.out.println("Op bruiloft buiten te jong exception");
		}finally {
			System.out.println("Ik word altijd uitgevoerd");
		}
		
	}
}

class Barman{
	void alcoholBedienen(Persoon persoon) throws Exception {
		if (persoon.leeftijd < 18) {
			System.out.println("Niemand kijkt");
			throw new Exception();
		}else {
			System.out.println("Welk drankje wilt u?");
		}
	}
}
class Persoon{
	int leeftijd;
}

class TeJongException extends Exception{

}
