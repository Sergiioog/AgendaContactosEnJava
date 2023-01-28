package Contactos;

import java.util.Scanner;
import java.util.TreeMap;

public class AgendaMain {


public static final String black = "\u001B[30m";
	
	public static final String rojo = "\u001B[31m";
	
	public static final String verde = "\u001B[32m";
	
	public static final String amarillo = "\u001B[33m";
	
	public static final String azul = "\u001B[34m";
	
	public static final String morado = "\u001B[35m";
	
	public static final String cyan = "\u001B[36m"; 				//Colores
	
	static Scanner entrada = new Scanner(System.in);
	
	static TreeMap <String,String> agenda = new TreeMap <>();
	
	public static void main(String [] args) {
		
		Agenda();
	}
	
	public static void Agenda() {

		System.out.println("**** APLICACIÓN MÓVIL ****");
		
		System.out.println("1. AÑADIR CONTACTO");
		
		System.out.println("2. VER CONTACTOS");
		
		System.out.println("3. MODIFICAR CONTACTO");
		
		System.out.println("4. ELIMINAR CONTACTO");
		
		System.out.println("5. BUSCAR CONTACTO");
		
		System.out.println("6. MOSTRAR TODOS LOS CONTACTOS DE UNA LETRA DADA");
		
		System.out.println("7. SALIR");
		
		System.out.println("Selecciona una opción: ");
		
		int seleccion = entrada.nextInt();
		
			switch (seleccion) {
			
			case 1:
				
				Opcion1();
				
				Agenda();
				
				break;
				
			case 2:
				
				Opcion2();
				
				Agenda();
				
				break;
				
			case 3:
				
				Opcion3();
				
				Agenda();
				
				break;
				
			case 4:
				
				Opcion4();
				
				Agenda();
				
				break;
				
			case 5:
				
				Opcion5();
				
				Agenda();
				
				break;
				
			case 6:
				
				Opcion6();
				
				Agenda();
				
				break;
				
			case 7:
				
				Opcion7();
				
				Agenda();
				
				break;
				
			default:
				
				System.err.println("Opción seleccionada no válida.");
				
				Agenda();
				
				break;
			}

	}
	
	public static void Opcion1() {
		
		System.out.println("Nombre del contacto: ");
		
		String nombreContacto = entrada.next();
		
		System.out.println("Número del contacto: ");
		
		String numeroContacto = entrada.next();
		
		
			if(nombreContacto.equals("Emergencias") || nombreContacto.equals("Policía")) {
				
				agenda.put(nombreContacto, numeroContacto);
				System.out.println("Contactos: " +  agenda );
				
			}else if (numeroContacto.length()!= 9){
			
				System.err.println("Número introducido no válido.");
			}
			else {
			
			agenda.put(nombreContacto, numeroContacto);
			System.out.println("Contactos: " +  agenda );
		}
		
		
	}
	
	
	public static void Opcion2() {
		
		if(agenda.isEmpty()) {
			
			System.err.println("La agenda está vacía, introduzca un contacto...");
			
		}else
			
			System.out.println(agenda);
		
	}
	
	public static void Opcion3() {
		
		if(agenda.isEmpty()) {
			
			System.err.println("La agenda está vacía, introduzca un contacto.");
			//preguntar si quiere cambiar el nombre, número o ambas
		}else
			System.out.println("Elige entre estas dos opciones: ");
			System.out.println("1. MODIFICAR CONTACTO");
			System.out.println("2. MODIFICAR NUM DE CONTACTO");	
			System.out.println("3. MODIFICAR AMBAS");
			int modificacionUsuario = entrada.nextInt();
			
			switch (modificacionUsuario) {
			case 1:
				System.out.println("Introduce el contacto a modificar: ");
				String contactoModificar = entrada.next();
				
				if(agenda.containsKey(contactoModificar)) {
					agenda.remove(contactoModificar);
					System.out.println("Introduce el contacto a añadir: ");
					String contactoAnadir = entrada.next();
					agenda.put(contactoAnadir,numeroContacto );
				}
				break;
			case 2:
				
				break;
			case 3:
				
				break;


			default:
				break;
			}
			
			/*System.out.println("Introduzca el contacto a modificar: ");
			
			
			if(agenda.containsKey(modificacionUsuario)) {
				agenda.remove(modificacionUsuario);
				System.out.println("Introduce el contacto que quieres añadir: ");
				String contactoAñadir = entrada.next();
				agenda.put(contactoAñadir, contactoAñadir)
			}
			System.out.println(agenda);*/
		
	}
	
	public static void Opcion4() {
	
		
	}
	
	public static void Opcion5() {
	
		
	}
	
	public static void Opcion6() {
		
		
	}
	
	public static void Opcion7() {
		
		
	}

}
