package pokemon;

import interfaz.IPlanta;

//Pokemon tipo Planta

public class Bulbasaur extends Pokemon implements IPlanta {
	
	//Constructor
		public Bulbasaur() {
			
		}
	
	@Override
	protected void atacarPlacaje() {
		System.out.println("Hola, soy Bulbasaur y este es mi ataque placaje");	
	}

	@Override
	public void atacarAraniazo() {
		System.out.println("Hola, soy Bulbasaur y este es mi ataque arañazo");	
	}

	@Override
	protected void atacarMordisco() {
		System.out.println("Hola, soy Bulbasaur y este es mi ataque mordisco");
		
	}
	//Metodos tipo Planta

	@Override
	public void atacarDrenaje() {
		System.out.println("Hola, soy Bulbasaur y este es mi ataque drenaje");
	}

	@Override
	public void atacarParalizar() {
		System.out.println("Hola, soy Bulbasaur y este es mi ataque paralizar");
	}

	@Override
	public void atacarHojaAfilada() {
		System.out.println("Hola, soy Bulbasaur y este es mi ataque hoja afilada");
		
	}

	@Override
	public void atacarLatigoCepa() {
		System.out.println("Hola, soy Bulbasaur y este es mi ataque latigo cepa");
		
	}

}
