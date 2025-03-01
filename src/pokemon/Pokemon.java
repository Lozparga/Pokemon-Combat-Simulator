package pokemon;

public abstract class Pokemon {
	//Todos los pokemones tendran estas atributos
	protected int numPokedex;
	protected String nombre;
	protected double peso;
	protected String sexo;
	protected String temporada;
	
	
	//Metodos de ataque
	protected abstract void atacarPlacaje();
	protected abstract void atacarAraniazo();
	protected abstract void atacarMordisco();
	
	
	

}
