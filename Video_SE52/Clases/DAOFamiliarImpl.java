package Video_SE52.Clases;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;


import Video_SE52.DAO.Conexion;
import Video_SE52.Interfaces.DAOFamiliar;

public class DAOFamiliarImpl extends Conexion implements DAOFamiliar{

	@Override
	public void insertarFamiliar(Familiar fam) throws Exception {
		try{
			this.conectar();
			PreparedStatement query = this.conexion.prepareStatement("INSERT INTO FAMILIARES (ID_FAMILIAR, NOMBRE,APELLIDO,APODO) VALUES (?,?,?,?)");
			query.setInt(1, fam.getId_familiar());
			query.setString(2,fam.getNombre());
			query.setString(3,fam.getApellido());
			query.setString(4,fam.getApodo());
			query.executeUpdate();
		}catch(Exception e){
			throw e;
		}finally{
			this.desconectar();
		}
		
	}

	@Override
	public void eliminarFamiliar(Familiar fam) throws Exception {
		try{
			this.conectar();
			PreparedStatement query = this.conexion.prepareStatement("DELETE FROM FAMILIARES WHERE ID_FAMILIAR=?");
			query.setInt(1, fam.getId_familiar());
			query.executeUpdate();
		}catch(Exception e){
			throw e;
		}finally{
			this.desconectar();
		}
	}

	@Override
	public void modificarFamiliar(Familiar fam) throws Exception {
		try{
			this.conectar();
			PreparedStatement query = this.conexion.prepareStatement("UPDATE FAMILIARES SET NOMBRE=?, APELLIDO=?, APODO=? WHERE ID_FAMILIAR=?");
			query.setString(1, fam.getNombre());
			query.setString(2, fam.getApellido());
			query.setString(3, fam.getApodo());
			query.setInt(4, fam.getId_familiar());
		}catch(Exception e){
			throw e;
		}finally{
			
		}
	}

	@Override
	public List<Familiar> listarFamiliar() throws Exception {
		List<Familiar> lista = null;
		try{
			PreparedStatement query = conexion.prepareStatement("SELECT ID_FAMILIAR, NOMBRE, APODO FROM FAMILIARES");
			ResultSet resultado = query.executeQuery();
			
			while(resultado.next()){
				Familiar fam = new Familiar();
				fam.setId_familiar(resultado.getInt("ID_FAMILIAR"));
				fam.setNombre(resultado.getString("NOMBRE"));
				fam.setApodo(resultado.getString("APODO"));
				
				lista.add(fam);
			}
			
		}catch(Exception e){
			throw e;
		}finally{
			
		}
		return lista;
	}

}


