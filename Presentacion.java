package presentacion;

import java.util.Scanner;

import data.Persona;
import logica.Logica;

public class Presentacion {
	private Logica logica;
	private Scanner leerDato =new Scanner(System.in);
	
	public Presentacion() {
		logica =new Logica();
	}
	
	public void run() {
		int opc = 0;;
		boolean salir=false;
		while(!salir) {
			System.out.println("Lista de Contactos");
			System.out.println("1. Crear contacto");
			System.out.println("2. Mostrar contactos");
			System.out.println("3. Buscar contacto ");
			System.out.println("4. Salir");
			System.out.print("Entrar una de las opciones");
			opc = leerDato.nextInt();
			switch (opc) {
				case 1:
					crear();break;
				case 2:
					logica.mostrarLista();break;
				case 3:
					buscar();break;
				case 4:salir=true;break;	
				default: 
					System.out.println("Solo números entre 1 y 4");break; 
		   }
		}
	}

	private void buscar() {
		// TODO Auto-generated method stub
		System.out.println("Enter el Id del contacto");
		int id = leerDato.nextInt();
		Persona persona = logica.buscarPersona(id);
		if(persona != null) {
			System.out.println("Contacto " + persona);
		}else {
			System.out.println("Contacto no existe");
		}
		
	}

	private void crear() {
		// TODO Auto-generated method stub
		System.out.println("Datos del Contacto");
		System.out.print("Id");
		int id = leerDato.nextInt();
		System.out.print("Nombre ");
		String nombre = leerDato.next();
		System.out.print("Telefono ");
		String telefono = leerDato.next();
		
		logica.agregarPersona(new Persona(id,nombre,telefono));
	}
	
}
