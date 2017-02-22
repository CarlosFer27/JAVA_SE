package Video_SE52.Interfaces;

import java.util.List;

import Video_SE52.Clases.Familiar;

public interface DAOFamiliar {
	
	public void insertarFamiliar(Familiar fam);
	public void eliminarFamiliar(Familiar fam);
	public void modificarFamiliar(Familiar fam);
	public List<Familiar> listarFamiliar() throws Exception;
	

}
