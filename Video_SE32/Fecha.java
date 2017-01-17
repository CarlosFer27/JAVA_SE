package Video_SE32;
import java.util.Date;

public class Fecha {
	public static void main(String[] args){
		Date fecha = new Date();
		
		//Estos metodos nos los subraya por que ya casi no se utilizan, y en versiones posteriores ya no existen
		int mes=fecha.getMonth();
		int hoy=fecha.getDate();
		int anio=fecha.getYear();

		
		System.out.println(hoy);
		System.out.println(mes);//Esta impresion da 0 la siguiente linea es la correcta.
			System.out.println(anio+1900); //Esta funcion se le deben sumar 1900 para que de el año exacto
	}

}
