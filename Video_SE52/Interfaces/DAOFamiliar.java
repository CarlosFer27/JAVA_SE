package Video_SE52.Interfaces;

import java.util.List;

import Video_SE52.Clases.Familiar;

public interface DAOFamiliar {
	
	public void insertarFamiliar(Familiar fam) throws Exception;
	public void eliminarFamiliar(Familiar fam) throws Exception;
	public void modificarFamiliar(Familiar fam) throws Exception;
	public List<Familiar> listarFamiliar() throws Exception;
	

}
