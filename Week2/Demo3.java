package Week2;

public class Demo3 {

	public static void main(String[] args) {
		Schipje zb = new Zeilboot();
		Zeilboot zeilboot = new Zeilboot();
		//zb.lengte = 34;
		System.out.println(zb.lengte);
		System.out.println(zeilboot.lengte);
		zb.varen();
		zeilboot.varen();
		Schipper ahab = new Schipper();
		ahab.besturen(zb);
		ahab.besturen(zeilboot);
		ahab.besturen(new Roeiboot());
		new Luchtbed();
	//	new CompressorWinkel().opLatenBlazen(new Schipje);
		Schipje[] schepen = {new Roeiboot(), new Schipje(), new Zeilboot()};
		
	}
}

class CompressorWinkel{
	void opLatenBlazen(Opblaasbaar opb) {
		opb.opblazen();
		Luchtbed lbb = (Luchtbed)opb;
		if(opb instanceof Luchtbed) {
			Luchtbed lb = (Luchtbed)opb;
	//		lb.hoofdeinde = 34;
		}
	}
}

interface Opblaasbaar{
	public abstract void opblazen();
}

class Luchtbed implements Opblaasbaar{
	String hoofdeinde;
	public void opblazen() {
		
	}
}

class Schipje{
	int lengte = 4;
	void varen() {
		System.out.println("varen in schip");
	}
}
class Roeiboot extends Schipje implements Opblaasbaar{
	public void opblazen() {
		
	}
	
}
class Zeilboot extends Schipje{
	int zeillengte = 3;
	int lengte = 24;
	void varen() {
		System.out.println("n zeilboot");
		
	}
}
class Schipper{
	void besturen(Schipje schip) {
		schip.varen();
	}
}