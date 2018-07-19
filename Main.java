import java.io.*;
import java.util.*;
public class Main {
	private BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
	private int[] guess = new int[4];
	private int[] secret = new int[4];
	private int turn = 1;
	public static void main(String[] args) throws IOException {
		new Main ();
	}
	Main() throws IOException {
		//	intro //
		System.out.println ("Hi and welcome to the game Mastermind!! :)\nMade by Jakob Petersson\n\n");
		//	secret = {(w,x,y,z): w,x,y,z € {1,2,3,4,5,6}} //
		for (int i = 0; i < secret.length; i++)
			secret[i] = new Random ().nextInt (6) + 1;
		//	print the answer //
		System.out.println ("The secret: " + secret[0] + secret[1] + secret[2] + secret[3]);
		do {
			// ask for quess //
			for (int i = 0; i < 4; i++) {
				do {
					System.out.println ("Guess number " + (i + 1) + ": ");
					guess[i] = Integer.parseInt (reader.readLine ());
				} while (!(guess[i] >= 1 && guess[i] <= 6));
			}
			System.out.println ("Your guess was: " + guess[0] + guess[1] + guess[2] + guess[3] + "\n");
			// white and black pins//
			boolean[] white = new boolean[4], black = new boolean[4];
			Arrays.fill (white, false);
			Arrays.fill (black, false);
			for (int i = 0; i < white.length; i++) {
				black[i] = guess[i] == secret[i];
				if (!black[i]) {
					int j = 0;
					for (int k = 0; k < 3; k++, j++) {
						if (j == i)
							j++;
						white[i] = white[i] || (guess[i] == secret[j]);
					}
				}
			}
			int whitePins = 0, blackPins = 0;
			for (int i = 0; i < white.length; i++) {
				if (white[i])
					whitePins++;
				if (black[i])
					blackPins++;
			}
			System.out.println ("You have " + whitePins + " white pin" + (whitePins == 1 ? "" : "s") + " and " + blackPins + " black pin"
					+ (blackPins == 1 ? "" : "s"));
			
			turn ++;
		} while (!(secret[0] == guess[0] && secret[1] == guess[1] && secret[2] == guess[2] && secret[3] == guess[3]) && turn <= 8);
		System.out.println ("\nCongratulations, you've won!! :D");
	}
}