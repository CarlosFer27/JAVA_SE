package Video_SE34;

/* Ejercicio:  Existe un banco el cual tiene registrados 3 clientes
 * Estos 3 clientes pueden retirar, abonar y consultar su saldo
 * 
 */

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		
		//Declaramos nuestros 3 clientes, este tema se puede remplazar por base de datos.
		
		Cliente cliente1= new Cliente();
		Cliente cliente2= new Cliente();
		Cliente cliente3= new Cliente();
		
		Scanner leer = new Scanner(System.in);
		
		//Damos valores a nuestros 3 clientes
		cliente1.Cliente(27, "Fernanda", 3000);
		cliente2.Cliente(1, "Jacke", 30000);
		cliente3.Cliente(7, "Carlos", 27000);
		
		
		System.out.println("#####################################");
		System.out.println("#####################################");
		System.out.println("####                             ####");
		System.out.println("####   BIENVIDO A BANCAFERJAC    ####");
		System.out.println("####                             ####");
		System.out.println("#####################################");
		System.out.println("#####################################");
		System.out.println("\n");
		
		System.out.println("Por favor ingrese su numero de cuenta: ");
		int cuent = leer.nextInt();
		
		
		switch (cuent) {
		
		case 27:
			System.out.println("Bienvenido "+cliente1.getNombre());
			System.out.println("Seleccione la opcion deseada:");
			System.out.println("1) Consultar Saldo.");
			System.out.println("2) Depositar efectivo.");
			System.out.println("3) Retirar efectivo.");
			int oper = leer.nextInt();
			
			switch (oper){
			case 1:
				
			}
			
			break;
		case 1:
			break;
		case 7:
			break;
			
		default:
			System.out.println("Ingreso una cuenta que no esta registrada");
				
		
		}
			
				
		
		
		
		
		
	}

}
