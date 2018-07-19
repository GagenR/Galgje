package Week3;

public class ExtensionOpdrachtIndividueel {


	public static void main(String[] args) throws Exception {
		new Netflix().TvMoment();
			
	}
}

class Netflix{
	Abbo abbo = new Abbo();
	void TvMoment() throws Exception {
		Kijker gagen = new Kijker();
		gagen.leeftijd = 17;
		try {
			abbo.abboKiezen(gagen);
		}
		
		catch(Helaas h) {
			System.out.println("Helaas, je bent te jong voor dit abonnement");
		}catch(AnderAbbo a)	{
			System.out.println("Kies aub een ander abonnement");	
		}catch(PlayStation p) {
			System.out.println("Wil je niet liever Fifa spelen op de Playstation?");
		}catch(Exception e) {
			System.out.println("We gaan je ouders inlichten");
		}finally {
			System.out.println("\nGa eens leren programmeren ipv zitten Netflixen");
		}
		
	}
}

class Abbo{
	void abboKiezen(Kijker gagen) throws Exception{
		if (gagen.leeftijd < 18) {
			System.out.println("Ik zie het door de vingers..");
			throw new AnderAbbo();
		}else {
			System.out.println("Welke abbo wilt u kiezen?");
		}
	}
}

class Sport extends Netflix{
	void voetballen() throws Exception{
		
	}
}

class Kijker{
	int leeftijd;
}

class Helaas extends Exception{
	
}

class AnderAbbo extends Exception{
	
}

class PlayStation extends Exception{
	
}