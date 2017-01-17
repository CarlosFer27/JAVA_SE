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
		
		//Damos valores a nuestros 3 clientes
		cliente1.Cliente(27, "Fernanda", 3000);
		cliente2.Cliente(1, "Jacke", 30000);
		cliente3.Cliente(7, "Carlos", 27000);
		
		
		
		
		
		
	}

}
