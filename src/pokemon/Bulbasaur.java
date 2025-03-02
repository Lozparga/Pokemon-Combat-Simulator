package pokemon;

import interfaz.IPlanta;

//Pokemon tipo Planta

public class Bulbasaur extends Pokemon implements IPlanta {
	
	// Constructor
    public Bulbasaur() {
        super(1, "Bulbasaur", 6.9, "Macho", 100, "Planta", "Primera", 40, false);
    }
	
	@Override
	public void atacarPlacaje() {
		System.out.println("Hola, soy Bulbasaur y este es mi ataque placaje");	
		if (this.oponente instanceof Pokemon) {
            ((Pokemon) this.oponente).recibirDaño(20);
        }
	}

	@Override
	public void atacarAraniazo() {
		System.out.println("Hola, soy Bulbasaur y este es mi ataque arañazo");	
		if (this.oponente instanceof Pokemon) {
            ((Pokemon) this.oponente).recibirDaño(10);
        }
	}

	@Override
	public void atacarMordisco() {
		System.out.println("Hola, soy Bulbasaur y este es mi ataque mordisco");
		if (this.oponente instanceof Pokemon) {
            ((Pokemon) this.oponente).recibirDaño(15);
        }
		
	}
	//Metodos tipo Planta

	@Override
	public void atacarDrenaje() {
		System.out.println("Hola, soy Bulbasaur y este es mi ataque drenaje");
		if (this.oponente instanceof Pokemon) {
		    ((Pokemon) this.oponente).recibirDaño(25);
		} else {
		    System.out.println("¡No se puede atacar a este oponente!");
		}
	}

	@Override
	public void atacarParalizar() {
		System.out.println("Hola, soy Bulbasaur y este es mi ataque paralizar");
		 if (this.oponente instanceof Pokemon) {
	            ((Pokemon) this.oponente).recibirParalisis();
	        }
	}

	@Override
	public void atacarHojaAfilada() {
		System.out.println("Hola, soy Bulbasaur y este es mi ataque hoja afilada");
		if (this.oponente instanceof Pokemon) {
		    ((Pokemon) this.oponente).recibirDaño(30);
		} else {
		    System.out.println("¡No se puede atacar a este oponente!");
		}
		
	}

	@Override
	public void atacarLatigoCepa() {
		System.out.println("Hola, soy Bulbasaur y este es mi ataque latigo cepa");
		if (this.oponente instanceof Pokemon) {
		    ((Pokemon) this.oponente).recibirDaño(22);
		} else {
		    System.out.println("¡No se puede atacar a este oponente!");
		}
		
	}

}
