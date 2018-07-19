package Week2;

public class Aap {

	public static void main(String[] args) { new Aap().beginnen(); }//
	void beginnen() {
		Leeuw Simba = new Leeuw();
		Dierenarts dierenarts = new Dierenarts();
		
		System.out.println("Simba had eerst " + Simba.bk.tanden + " tanden in zijn bek");
		
		dierenarts.tandentrekken(Simba.bk);
		System.out.println("Simba heeft nu " + Simba.bk.tanden + " tanden over");
		
		System.out.println("Simba gaat naar het woud, maar heeft meer tanden nodig");
		Oerwoud ZuidAfrika = new Oerwoud();
		Simba.bk = ZuidAfrika.vergroten(3);
		System.out.println(Simba.bk.tanden);
		ZuidAfrika.Amazone(Simba);
		System.out.println(Simba.bk.tanden);
		
	}		
}

class Leeuw{
	static int hoeveelheidVoedsel = eten();
	double lengte = groeien();
	Bek bk = new Bek();
	String naam;
	
//	
	
	static int eten() {
		System.out.println("Simba heeft veel gegeten");
		System.out.println("Simba heeft last van zijn tanden door het eten");
		return 5;
	}
	static double groeien() {
//		System.out.println("Leeuw is groot");
		return 1.5;
	}
	
}	
class Bek{
	int tanden = 50;
}

class Dierenarts{
	void tandentrekken(Bek nieuweBek) {
		nieuweBek.tanden = 49;
	}
}

class Oerwoud{
	Bek vergroten(int extratanden) { //Leeuw gaat vlees zoeken, hij extra tanden nodig [in vorm van int]
		Bek newBek = new Bek();
		newBek.tanden = 51;
		return newBek;
		
	}
		
	void Amazone(Leeuw Simba) {
	Bek bek = new Bek();
	bek.tanden = 53;	
	Simba.bk = bek;
	}
	
}

