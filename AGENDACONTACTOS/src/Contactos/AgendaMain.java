package Contactos;

import java.util.Arrays;
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
		
		if(!agenda.isEmpty()) {
			
			System.out.println("Elige entre estas dos opciones: ");
			
			System.out.println("1. MODIFICAR NOMBRE DEL CONTACTO");
			
			System.out.println("2. MODIFICAR NUMERO DEL CONTACTO");	
			
			System.out.println("3. MODIFICAR NOMBRE Y NÚMERO DEL CONTACTO");
			
			int modificacionUsuario = entrada.nextInt();
			
			switch (modificacionUsuario) {
			
			case 1:
				
				System.out.println("Introduce el contacto a modificar: ");
				
				String contactoModificar = entrada.next();
				
				if(agenda.containsKey(contactoModificar)) {
					
					agenda.remove(contactoModificar);
					
					System.out.println("Introduce el nuevo nombre: ");
					
					String contactoNombre = entrada.next();
					
			//		agenda.put(contactoNombre, numeroContacto); //COMO HACER QUE COJA EL NUMERO DE CONTACTO DEL APARTADO ANTERIOR
					
					System.out.println("Su cambio se ha realizado con éxito" + agenda);
					
				}else
					
					System.err.println("La agenda no contiene ese contacto.");
				
				break;
				
			case 2:
				
				System.out.println("Introduce el contacto cuyo número quieres modificar: ");
				
				String contacto = entrada.next();
				
				if(agenda.containsKey(contacto)) {
				
					System.out.println("Introduce su nuevo número: ");
					
					String numeroModificar = entrada.next();
					
					if(contacto.equals("Emergencias") || contacto.equals("Policía")) {
						
						agenda.put(contacto, numeroModificar);
						
						System.out.println("El contacto se ha modificado con éxito: " + agenda);
						
					}else if (numeroModificar.length()!= 9){
					
						System.err.println("Número introducido no válido.");
						
					}
					
					else {
						
						agenda.put(contacto, numeroModificar);
						
						System.out.println("El contacto se ha modificado con éxito: " + agenda);
						
				}
			
				}
				else {
				
				System.err.println("La agenda no contiene ese contacto.");
				
			}
				
				break;
				
			case 3:
				
				System.out.println("Introduce el contacto que quieres cambiar: ");
				
				String contactoCambiar = entrada.next();
				
				if(agenda.containsKey(contactoCambiar)) {
					
					System.out.println("Introduce el contacto que quieres anadir: ");
					
					String contactoAnadir = entrada.next();
				
					System.out.println("Introduce el número del contacto a anadir.");
					
					String numeroTelefono = entrada.next();
					
					if(contactoAnadir.equals("Emergencias") || contactoAnadir.equals("Policía")) {
						
						agenda.remove(contactoCambiar);
						
						agenda.put(contactoAnadir, numeroTelefono);
						
						System.out.println("El contacto se ha cambiado con éxito " + agenda);
						
					} else if (numeroTelefono.length() != 9) {
						
						System.err.println("Número introducido inválido.");
						
					}else {
						
						agenda.remove(contactoCambiar);
						
						agenda.put(contactoAnadir, numeroTelefono);
						
						System.out.println("El contacto se ha cambiado con éxito " + agenda);
						
					}
						
				} else
					
					System.err.println("El contacto no se encuentra en la agenda.");
				
				break;
				
			default: System.err.println("Opción escogida inválida.");
			
				break;
				
			}
		
		}else
			
			System.err.println("La agenda está vacía, introduzca un contacto.");
			
	}
	
	public static void Opcion4() {
		
		if(!agenda.isEmpty()) {
			
			System.out.println("Introduzca el contacto a eliminar: ");
			
			String contactoEliminar = entrada.next();
			
			if(agenda.containsKey(contactoEliminar)) {
				
				agenda.remove(contactoEliminar);
				
				System.out.println(agenda);
				
			} else
				
				System.err.println("El contacto no se encuentra en la agenda.");
			
		}
		
		else {
			
			System.err.println("La agenda no tiene contactos, introdúzcalos.");
			
		}
	}
	
	public static void Opcion5() {
		
		if(!agenda.isEmpty()) {
			
			System.out.println("Introduzca el contacto que desea buscar: ");
			String contactoBuscar = entrada.next();
			
			if(agenda.containsKey(contactoBuscar)) {
				System.out.println("El contacto " + contactoBuscar + " se encuentra en la agenda.");
			}else
				System.err.println("El contacto " + contactoBuscar + " no se encuentra en la agenda.");
			
		} else {
			
			System.err.println("La agenda no tiene contactos, introdúzcalos.");
			
		}
		
	}
	
	public static void Opcion6() {
		
		System.out.println("Introduzca una letra: ");
		String letra = entrada.next();
		
		char letraGuardar [] = new char [letra.length()];
		System.out.println(Arrays.toString(letraGuardar));
	}
	
	public static void Opcion7() {
		
		System.out.println("Redirigiendo al menú principal...");
		Agenda();
		
	}

}
