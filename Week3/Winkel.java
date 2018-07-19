package Week3;

//super.field of super.methode() kan ook. Maar dan roep je geen constructor aan.

public class Winkel {

	public static void main(String[] args) {
		new Banaan().kopen();

	}
}

class Fruit{
    int prijs;
    void kopenn() {
    	System.out.println("Ik ga winkelen");
    }
}

class Banaan extends Fruit
{
    int prijs = 3;
    void kopen()
    {
        super.kopenn();
        System.out.println("Ik ga een banaan kopen voor € " + prijs );
    }
   
}