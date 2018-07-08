/*Stappenplan:
 *Stap 1 Uitleg van MasterMind:
 *Er zijn 2 spelers: de codemaker en de codebreker. 
 *De codemaker heeft in het geheim 4 ballen, elk met een andere kleur, in een bepaalde volgorde 
 *achter zijn schermpje neergezet. De codemaker heeft keuze uit 6 verschillende kleuren.
 *Het is aan de codebreker de taak om de verborgen code in
 *12 pogingen te ontrafelen. Bij elk poging van de codebreker, geeft de codemaker met pinnen aan of de
 *ballen en kleuren op de juiste volgorde staan. Met zwarte pinnen wordt aangegeven hoeveel kleuren er 
 *op de juiste positie staan en met witte pinnen wordt aangegeven dat de gekozen kleuren wel voorkomen, 
 *maar niet in de juiste volgorde. Het spel houdt op als de codebreker binnen 12 pogingen de code 
 *heeft gekraakt.
 
 
 *Stap 2 Benodigheden:
 *Functie waarbij het spel wordt gestopt als de code wordt gekraakt of als de code na 12 pogingen niet 
 *is gekraakt
 *Functie waarbij de computer onthoud welke ballen met betreffende kleuren door de codebreker is gekozen
 *Functie waarbij de computer onthoud in welke volgorde de codebreker zijn ballen heeft gezet
 

 *Stap 3 Uitvoering:
 *Nagaan welke methodes je moet gebruiken en welke import packages
*/

import java.io.*;
import java.util.*;
public class Mastermind {
	public BufferedReader lezer = new BufferedReader (new InputStreamReader (System.in));
	public int[] raad = new int[4];
	public int[] geheim = new int[4];
	public static void main(String[] args) throws IOException {
		new Mastermind ();
	}
	Mastermind() throws IOException {
		System.out.println("Welkom bij het spel MasterMind!");
		System.out.println("Kraak de geheime code."); 
		
		// de geheime code = {(a,b,c,d): d,b,a,c 
		for (int i = 0; i < geheim.length; i++)
			geheim[i] = new Random().nextInt(6)+1;
		
		// het antwoord uitprinten
		System.out.println("\nDe geheime code is: " + geheim[0] + geheim[1] + geheim[2] + geheim[3]);
			// vragen om te raden
			for (int i = 0; i < 4; i++) {
				do {
					System.out.println("Gekozen nummer " + (i++ + 1) + ": ");
					raad[i] = Integer.parseInt (lezer.readLine ());
				} while (!(raad[i] >= 1 && raad[i] <= 6));
			
			System.out.println("Jou antwoord was: " + raad[0] + raad[1] + raad[2] + raad[3] + "\n");
		}
			//Op dit moment loop ik enorm vast.. desondanks ga ik het alsnog up Git uploaden
		}
	
}		

