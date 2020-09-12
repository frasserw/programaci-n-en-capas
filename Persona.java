package data;
/**
 * 
 * @author william frasser acevedo
 *
 */
public class Persona {
	private int id;
	private String nombre;
	private String telefono;
	/**
	 * @param id
	 * @param nombre
	 * @param telefono
	 */
	public Persona(int id, String nombre, String telefono) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.telefono = telefono;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * 
	 */
	@Override
	public String toString() {
		return "Persona Id " + id + " Nombre=" + nombre + "  Telefono=" + telefono +"\n";
	}

	
	
	
}
