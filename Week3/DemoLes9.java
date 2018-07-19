package Week3;

public class DemoLes9 {

	public static void main(String[] args) {
	
	}
}

class Dier{
	boolean dood;
	Dier() throws IsGiftigException{
		
	}
	void voortbewegen() throws Exception, IsGiftigException{
		if(dood) {
			throw new IsDoodException();
		}
	}
}
class Slak extends Dier{
	Slak()throws IsGiftigException{ //deze doet het niet omdat bij regel 12 staat Dier throws IsGiftigException
		
	}
	void voortbewegen() throws IsGiftigException{
		
	}
}

class IsDoodException extends Exception{}
class IsGiftigException extends Exception{}
