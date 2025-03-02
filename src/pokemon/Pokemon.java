package pokemon;

public abstract class Pokemon {
	//Todos los pokemones tendran estas atributos
	protected int numPokedex;
	protected String nombre;
	protected double peso;
	protected String sexo;
	protected int hp;
	protected String tipo;
	protected String temporada;
	protected int ataque;
	Pokemon oponente;
	protected boolean paralizado = false;

	public Pokemon(int numPokedex, String nombre, double peso, String sexo, int hp, String tipo, String temporada,
			int ataque, boolean paralizado) {
		super();
		this.numPokedex = numPokedex;
		this.nombre = nombre;
		this.peso = peso;
		this.sexo = sexo;
		this.hp = hp;
		this.temporada = temporada;
		this.tipo = tipo;
		this.ataque = ataque;
		this.paralizado = paralizado;
		}
	
	public void setOponente(Pokemon oponente) {
        this.oponente = oponente;
    }

    public void recibirDaño(int daño) {
        this.hp -= daño;
        if (this.hp < 0) {
            this.hp = 0;
        }
        System.out.println(this.nombre + " recibe " + daño + " de daño. HP restante: " + this.hp);
    }
	
	
	//Metodos de ataque
	protected abstract void atacarPlacaje();
	protected abstract void atacarAraniazo();
	protected abstract void atacarMordisco();
	
	protected void recibirParalisis(){
	    double probabilidad = Math.random();
	    if(probabilidad <= 0.8){
	        this.paralizado = true;
	        System.out.println(this.nombre + " ha sido paralizado");
	    } else {
	        System.out.println(this.nombre + " no ha sido paralizado");
	    }
	}
	
	
	protected void atacar(Pokemon oponente) {
	    if (this.paralizado) {
	        double probabilidad = Math.random();
	        if (probabilidad <= 0.25) { // 25% de probabilidad de no moverse
	            System.out.println(this.nombre + " está paralizado y no puede moverse.");
	            return; 
	        }
	    }
	
	}
}
   
	
