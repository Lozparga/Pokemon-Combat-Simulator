package pokemon;

import interfaz.IElectrico;

//Pokemon tipo Electrico

public class Pikachu extends Pokemon implements IElectrico{
	
	//Constructor
	public Pikachu() {
		
	}

	@Override
	protected void atacarPlacaje() {
		System.out.println("Hola, soy Pikachu y este es mi ataque placaje");
	}

	@Override
	public void atacarAraniazo() {
		System.out.println("Hola, soy Pikachu y este es mi ataque arañazo");
	}

	@Override
	protected void atacarMordisco() {
		System.out.println("Hola, soy Pikachu y este es mi ataque mordisco");
	}
	
	//Metodos tipo electrico

	@Override
	public void atacarImpactrueno() {
		System.out.println("Hola, soy Pikachu y este es mi ataque impactrueno");
	}

	@Override
	public void atacarPunioTrueno() {
		System.out.println("Hola, soy Pikachu y este es mi ataque puño fuego");
	}

	@Override
	public void atacarRayo() {
		System.out.println("Hola, soy Pikachu y este es mi ataque rayo");
	}

	@Override
	public void atacarRayoCarga() {
		System.out.println("Hola, soy Pikachu y este es mi ataque rayo carga");
	}
	

}
