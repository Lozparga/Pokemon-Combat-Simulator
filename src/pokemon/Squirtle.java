package pokemon;

import interfaz.IAgua;

//Pokemon tipo Agua

public class Squirtle extends Pokemon implements IAgua {
	

	//Constructor
	public Squirtle() {
        super(7, "Squirtle", 9.0, "Macho", 100, "Agua", "Primera", 45, false);
    }

	@Override
	public void atacarPlacaje() {
		System.out.println("Hola, soy Squirtle y este es mi ataque placaje");
		if (this.oponente instanceof Pokemon) {
            ((Pokemon) this.oponente).recibirDaño(12); 
        }
	}

	@Override
	public void atacarAraniazo() {
		System.out.println("Hola, soy Squirtle y este es mi ataque arañazo");
		if (this.oponente instanceof Pokemon) {
            ((Pokemon) this.oponente).recibirDaño(20);
        }
	}

	@Override
	public void atacarMordisco() {
		System.out.println("Hola, soy Squirtle y este es mi ataque mordizco");
		if (this.oponente instanceof Pokemon) {
            ((Pokemon) this.oponente).recibirDaño(20); 
        }
	}

	//Metodos tipo agua
	
	@Override
	public void atacarHidrobomba() {
		System.out.println("Hola, soy Squirtle y este es mi ataque hidrobombda");
		if (this.oponente != null && this.oponente instanceof Pokemon) {
	        ((Pokemon) this.oponente).recibirDaño(30); 
	    } else {
	        System.out.println("¡No se puede atacar a este oponente!");
	    }
	}

	@Override
	public void atacarBurbuja() {
		System.out.println("Hola, soy Squirtle y este es mi ataque burbuja");
		if (this.oponente instanceof Pokemon) {
		    ((Pokemon) this.oponente).recibirDaño(10);
		} else {
		    System.out.println("¡No se puede atacar a este oponente!");
		}
	}

	@Override
	public void atacarPistolaAgua() {
		System.out.println("Hola, soy Squirtle y este es mi ataque pistola agua");
		if (this.oponente instanceof Pokemon) {
		    ((Pokemon) this.oponente).recibirDaño(15);
		} else {
		    System.out.println("¡No se puede atacar a este oponente!");
		}
	}

	@Override
	public void atacarHidropulso() {
		System.out.println("Soy Squirtle y estoy atacando con Hidropulso");
		if (this.oponente instanceof Pokemon) {
		    ((Pokemon) this.oponente).recibirDaño(25);
		} else {
		    System.out.println("¡No se puede atacar a este oponente!");
		}
	}

}
