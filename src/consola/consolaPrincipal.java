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
		
		// Turno 1
        squirtle.setOponente(charmander);
        squirtle.atacarAraniazo();

        charmander.setOponente(bulbasaur);
        charmander.atacarLanzallamas();

        bulbasaur.setOponente(pikachu);
        bulbasaur.atacarDrenaje();

        pikachu.setOponente(squirtle);
        pikachu.atacarImpactrueno();

        // Turno 2
        squirtle.setOponente(charmander);
        squirtle.atacarHidrobomba();

        charmander.setOponente(bulbasaur);
        charmander.atacarAraniazo();

        bulbasaur.setOponente(pikachu);
        bulbasaur.atacarParalizar();

        pikachu.setOponente(squirtle);
        pikachu.atacarAraniazo();

		
	}

}
