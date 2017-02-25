package Video_SE52.Clases;

import Video_SE52.Interfaces.DAOFamiliar;

public class Main {
	public static void main(String [] args){
		Familiar familiar = new Familiar();
		familiar.setId_familiar(6);
		familiar.setNombre("Raul");
		familiar.setApellido("Cono");
		familiar.setApodo("Morenazo");
		
		try{
			DAOFamiliar dao = new DAOFamiliarImpl();
			dao.insertarFamiliar(familiar);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
	}
}
