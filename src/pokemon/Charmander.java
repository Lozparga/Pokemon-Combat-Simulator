package pokemon;

import interfaz.IFuego;

//Pokemon tipo Fuego

public class Charmander extends Pokemon implements IFuego {
	
	//Constructor
		public Charmander() {
			
		}

	@Override
	protected void atacarPlacaje() {
		System.out.println("Hola, soy Chamander y este es mi ataque placaje");
	}

	@Override
	public void atacarAraniazo() {
		System.out.println("Hola, soy Chamander y este es mi ataque arañazo");
	}

	@Override
	protected void atacarMordisco() {
		System.out.println("Hola, soy Chamander y este es mi ataque mordisco");
	}
	
	//Metodos tipo fuego

	@Override
	public void atacarPunioFuego() {
		System.out.println("Hola, soy Chamander y este es mi ataque puño fuego");
	}

	@Override
	public void atacarLanzallamas() {
		System.out.println("Hola, soy Chamander y este es mi ataque lanzallamas");
	}

	@Override
	public void atacarAscuas() {
		System.out.println("Hola, soy Chamander y este es mi ataque ascuas");
	}

}
