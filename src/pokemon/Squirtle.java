package pokemon;

import interfaz.IAgua;

//Pokemon tipo Agua

public class Squirtle extends Pokemon implements IAgua {
	
	//Constructor
		public Squirtle() {
			
		}

	@Override
	protected void atacarPlacaje() {
		System.out.println("Hola, soy Squirtle y este es mi ataque placaje");
	}

	@Override
	public void atacarAraniazo() {
		System.out.println("Hola, soy Squirtle y este es mi ataque arañazo");
	}

	@Override
	protected void atacarMordisco() {
		System.out.println("Hola, soy Squirtle y este es mi ataque mordizco");
	}

	//Metodos tipo agua
	
	@Override
	public void atacarHidrobomba() {
		System.out.println("Hola, soy Squirtle y este es mi ataque hidrobombda");
	}

	@Override
	public void atacarBurbuja() {
		System.out.println("Hola, soy Squirtle y este es mi ataque burbuja");
	}

	@Override
	public void atacarPistolaAgua() {
		System.out.println("Hola, soy Squirtle y este es mi ataque pistola agua");
	}

}
