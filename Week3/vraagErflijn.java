package Week3;

//De erflijn van klasses mag abstract - concreet - abstract - concreet zijn.

public class vraagErflijn {
		public static void main(String[] args) {
			Pokemon pokemon = new vuurPokemon(); ;
			System.out.println(pokemon.hp);
			vuurPokemon vuurpokemon = new vuurPokemon();
			System.out.println(vuurpokemon.hp); 
			vuurpokemon.hp = 12; 
			System.out.println(vuurpokemon.hp);
			vuurpokemon.aanvallen();
			new Gymleader().pokemonVangen();
			new Kantotrainer().pokemonVangen();
		}
	}

	abstract class Pokemon{
		int hp = 25;
		public void aanvallen() {
			
		}
	}

	class vuurPokemon extends Pokemon{
		public void aanvallen() {
			System.out.println("Aanvallen met vuur"); 
		}
	}

	class waterPokemon extends Pokemon{ 
		public void aanvallen(){
			System.out.println("Aanvallen met water");
		}
	}

	abstract class LavaPokemon extends vuurPokemon{
	
	}

	abstract class Pokemontrainer extends LavaPokemon{
		int aantalPokeBadges;
		public void pokemonVangen() {
		}	
	}

	class Gymleader extends Pokemontrainer{
		public void pokemonVangen(){
			System.out.println("Pokemons vangen met Giovanni van Team Rocket");
		}
	}

	class Kantotrainer extends Pokemontrainer{
		public void pokemonVangen(){
			System.out.println("Pokemons vangen met Ash Ketchum");
		}
	
}
