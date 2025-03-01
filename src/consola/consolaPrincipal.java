package consola;

import pokemon.Bulbasaur;
import pokemon.Charmander;
import pokemon.Pikachu;
import pokemon.Squirtle;

public class consolaPrincipal {

	public static void main(String[] args) {
		
		Squirtle squirtle = new Squirtle();
		Charmander charmander = new Charmander();
		Bulbasaur bulbasaur = new Bulbasaur();
		Pikachu pikachu = new Pikachu();
		
		squirtle.atacarAraniazo();
		squirtle.atacarHidrobomba();
		charmander.atacarAraniazo();
		charmander.atacarLanzallamas();
		bulbasaur.atacarAraniazo();
		bulbasaur.atacarDrenaje();
		pikachu.atacarAraniazo();
		pikachu.atacarImpactrueno();
		
	}

}
