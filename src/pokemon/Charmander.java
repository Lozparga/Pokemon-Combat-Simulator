package pokemon;

import interfaz.IFuego;

//Pokemon tipo Fuego

public class Charmander extends Pokemon implements IFuego {
	
	// Constructor
    public Charmander() {
        super(4, "Charmander", 8.5, "Macho", 100, "Fuego", "Primera", 52, false); 
    }

	@Override
	protected void atacarPlacaje() {
		System.out.println("Hola, soy Chamander y este es mi ataque placaje");
		 if (this.oponente instanceof Pokemon) {
	            ((Pokemon) this.oponente).recibirDaño(20); 
	        }
	}

	@Override
	public void atacarAraniazo() {
		System.out.println("Hola, soy Chamander y este es mi ataque arañazo");
		if (this.oponente instanceof Pokemon) {
            ((Pokemon) this.oponente).recibirDaño(10); 
        }
	}

	@Override
	protected void atacarMordisco() {
		System.out.println("Hola, soy Chamander y este es mi ataque mordisco");
		if (this.oponente instanceof Pokemon) {
            ((Pokemon) this.oponente).recibirDaño(15); 
        }
	}
	
	//Metodos tipo fuego

	@Override
	public void atacarPunioFuego() {
		System.out.println("Hola, soy Chamander y este es mi ataque puño fuego");
		if (this.oponente instanceof Pokemon) {
		    ((Pokemon) this.oponente).recibirDaño(30);
		} else {
		    System.out.println("¡No se puede atacar a este oponente!");
		}
	}

	@Override
	public void atacarLanzallamas() {
		System.out.println("Hola, soy Chamander y este es mi ataque lanzallamas");
		if (this.oponente instanceof Pokemon) {
		    ((Pokemon) this.oponente).recibirDaño(18);
		} else {
		    System.out.println("¡No se puede atacar a este oponente!");
		}
	}

	@Override
	public void atacarAscuas() {
		System.out.println("Hola, soy Chamander y este es mi ataque ascuas");
		if (this.oponente instanceof Pokemon) {
		    ((Pokemon) this.oponente).recibirDaño(15);
		} else {
		    System.out.println("¡No se puede atacar a este oponente!");
		}
	}

}
