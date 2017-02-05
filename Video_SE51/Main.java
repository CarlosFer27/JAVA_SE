package Video_SE51;
import java.util.List;

public class Main {
	public static void main(String[] args){
		
		ConsultarBD objConsulta = new ConsultarBD();
		
		List<Familiar> listaBD = objConsulta.listaBD();
		
		for(Familiar fam : listaBD ){
			System.out.println(fam.id_familiar+" - "+fam.nombre+" - "+fam.apodo);
		}
		
	}

}
