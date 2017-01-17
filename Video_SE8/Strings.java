package Video_SE8;

public class Strings {
	
	public static void main(String[] fer){
		String texto1="Fernanda";
		String texto2=" te amo";
		
		/* ######################
		 *       Metodo charAt
		 * ######################*/
		
		char primerletra= texto1.charAt(5); /*la variable texto1 al ser de tipo String (no primitivo)
											tiene a su disposicion varios metodos y uno de ellos es charArt
											el cual regresa un Caracter (char) y espera un indice*/
		System.out.println(primerletra); // aqui se imprime el caracter del indice que se selecciono previamente 
		
		/* ######################
		 *       Metodo compareTo
		 * ######################*/
		
		int comparacion = texto1.compareTo(texto2);/*aqui utilizaremos otro metodo llamado compareTo el cual va
													a comparar dos cadenas de caracteres, nos regresara un valor
													de tipo entero, si el resultado de ese entero es 0 quiere decir
													que las dos cadenas son iguales, si el resultado es negativo
													quiere decir que la primer cadena es mas pequeña que la segunda
													y si el resultado es positivo quiere decir que la primer cadena
													es mas grande que la segunda. ESTE METODO ES SENCIBLE A MAYUSCULAS 
													Y MINUSCULAS, POR LO CUAL SI ES LA MISMA CADENA PERO TIENEN MAYUSCULAS
													O MINUSCULAS DISTINTAS LAS CADENAS DARA UN RESULTADO NEGATIVO*/
		System.out.println(comparacion);// aqui se imprime el entero con la comparacion tomando en cuenta mayusculas y minusculas

		/* ######################
		 *       Metodo compareToIgnoreCase
		 * ######################*/
		
		int caseSensitive = texto1.compareToIgnoreCase(texto2); /*El metodo compareToIgnoreCase tiene la misma funcionalidad
																 del metodo anteriormente comentado (compareTo), con la 
																 diferencia que este no es sencible al uso de mayusculas
																 o minusculas*/
		System.out.println(caseSensitive);// aqui se imprime el entero con la comparacion sin tomar en cuenta mayusculas y minusculas
		
		/* ######################
		 *       Metodo concat
		 * ######################*/
		
		String concatenar = texto1.concat(texto2); //El metodo concat, concatena 2 cadenas
		System.out.println(concatenar);//Se impime la variable que concateno las dos cadenas.
		
		/* ######################
		 *       Metodo contains
		 * ######################*/
		
		boolean contiene = texto1.contains("Fe"); //metodo contains busca coincidencias en la cadena que se le indique 
		
		System.out.println(contiene);
		
		/* ######################
		 *       Metodo indexOf
		 * ######################*/
		
		int concidencia =texto1.indexOf("r"); //indexOf de tipo entero busca en que posicion de la cadena se encuentra el caracter buscado
		System.out.println(concidencia);
		
		/* ######################
		 *       Metodo substring
		 * ######################*/
		
		String substrin = texto1.substring(1, 5);
		System.out.println(substrin);
		
		
	}

}
