package logica;

import java.util.ArrayList;
import data.Persona;

public class Logica{
	private ArrayList<Persona> listaPersona;

	/**
	 * Constructor de la clase, crea una instancia de la clase ArraysList de clase Persona
	 * Composición
	 * @param listaPersona
	 */
	public Logica() {
		super();
		this.listaPersona =new ArrayList();
	}
	/**
	 * Método para agregar personas a la lista de personas
	 * @param persona
	 */
	public void agregarPersona(Persona persona) {
		this.listaPersona.add(persona);
		
	}
	/**
	 * Método para buscar una persona en la lista
	 * @param id
	 * @return
	 */
	public Persona buscarPersona(int id) {
		for (Persona persona : listaPersona) {
			if (persona.getId() == id) {
				return persona;
			}
		}
		return null;
	}

	/**
	 * @return the listaPersona
	 */
	public ArrayList<Persona> getListaPersona() {
		return listaPersona;
	}
	/**
	 * 
	 */
	public void mostrarLista() {
		System.out.println(listaPersona.toString());
	}

}
