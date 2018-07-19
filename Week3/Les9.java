package Week3;

public class Les9 {
	public static void main(String[] args) {
		Recruiter qien = new Recruiter();
		qien.opstartenTraject();
		MiddelbareSchool zwijnstein = new MiddelbareSchool();
		zwijnstein.leerjaarVoltooien();
	}
}

class MiddelbareSchool{
	void leerjaarVoltooien() {
		Leraar leraarSchool = new Leraar();
		try {
			leraarSchool.lesgeven(5);
		}catch(Exception e) {
			System.out.println("Leerling briefje van ouders meenemen");
		}
	}
}

class Recruiter {
	void opstartenTraject(){
		Leraar leraarTraject = new Leraar();
		try {
			leraarTraject.lesgeven(0);
		}catch(Exception e) {
			System.out.println("Leerling ontslaan");
		}
		
	}
}

class Leraar{
	
	void lesgeven(int aantalLeerlingen) throws Exception{ //hiermee geeft hij een waarschuwing aan dat er iets kan gebeuren
		if(aantalLeerlingen < 1) {
				throw new Exception(); //dit is daadwerkelijk opwerpen zo van: "ho ho ho, er is iets gaande
		} else {
			System.out.println("Ik ga lesgeven");
		}
	}
}
