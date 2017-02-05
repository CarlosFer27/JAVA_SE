package Video_SE51;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;


public class ConsultarBD {
	
	public List<Familiar> listaBD(){
		final String JDBC_DRIVER="org.h2.Driver";
		final String DB_URL="jdbc:h2:tcp://localhost/~/test";
		
		final String DB_USER="sa";
		final String DB_PASSWORD="";
		
		Connection conexion=null;
		List<Familiar> lista=null;
		
		try{
			Class.forName(JDBC_DRIVER);
			conexion=DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			
			PreparedStatement consulta = conexion.prepareStatement("SELECT ID_FAMILIAR, NOMBRE, APODO FROM FAMILIARES");
			
			lista = new ArrayList();
			
			ResultSet resultado=consulta.executeQuery();
			
			while(resultado.next()){
				Familiar fam = new Familiar();
				fam.setId_familiar(resultado.getInt("ID_FAMILIAR"));
				fam.setNombre(resultado.getString("NOMBRE"));
				fam.setApodo(resultado.getString("APODO"));
				
				lista.add(fam);
			}
			
			resultado.close();
			consulta.close();
			
			
			
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		finally{
			try{
				if(conexion !=null){
					if(!conexion.isClosed()){
						conexion.close();
					}
				}
			}catch(SQLException e){
				
			}
		}
		
		return lista;
	}
	
	
	
	
	
	
}
