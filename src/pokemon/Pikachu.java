package pokemon;

import interfaz.IElectrico;

//Pokemon tipo Electrico

public class Pikachu extends Pokemon implements IElectrico{
	
	// Constructor
    public Pikachu() {
        super(25, "Pikachu", 6.0, "Macho", 100, "Electrico", "Primera", 55, false);
    }

	@Override
	protected void atacarPlacaje() {
		System.out.println("Hola, soy Pikachu y este es mi ataque placaje");
		if (this.oponente instanceof Pokemon) {
            ((Pokemon) this.oponente).recibirDaño(20); 
        }
	}

	@Override
	public void atacarAraniazo() {
		System.out.println("Hola, soy Pikachu y este es mi ataque arañazo");
		if (this.oponente instanceof Pokemon) {
            ((Pokemon) this.oponente).recibirDaño(10); 
        }
	}

	@Override
	protected void atacarMordisco() {
		System.out.println("Hola, soy Pikachu y este es mi ataque mordisco");
		if (this.oponente instanceof Pokemon) {
            ((Pokemon) this.oponente).recibirDaño(15); 
        }
	}
	
	//Metodos tipo electrico

	@Override
	public void atacarImpactrueno() {
		System.out.println("Hola, soy Pikachu y este es mi ataque impactrueno");
		if (this.oponente instanceof Pokemon) {
		    ((Pokemon) this.oponente).recibirDaño(30);
		} else {
		    System.out.println("¡No se puede atacar a este oponente!");
		}
	}

	@Override
	public void atacarPunioTrueno() {
		System.out.println("Hola, soy Pikachu y este es mi ataque puño trueno");
		if (this.oponente instanceof Pokemon) {
		    ((Pokemon) this.oponente).recibirDaño(25);
		} else {
		    System.out.println("¡No se puede atacar a este oponente!");
		}
	}

	@Override
	public void atacarRayo() {
		System.out.println("Hola, soy Pikachu y este es mi ataque rayo");
		if (this.oponente instanceof Pokemon) {
		    ((Pokemon) this.oponente).recibirDaño(32);
		} else {
		    System.out.println("¡No se puede atacar a este oponente!");
		}
	}

	@Override
	public void atacarRayoCarga() {
		System.out.println("Hola, soy Pikachu y este es mi ataque rayo carga");
		if (this.oponente instanceof Pokemon) {
		    ((Pokemon) this.oponente).recibirDaño(35);
		} else {
		    System.out.println("¡No se puede atacar a este oponente!");
		}
	}
	

}
