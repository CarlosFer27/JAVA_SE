package Video_SE50;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertarConParametros {
	
	public void InsertarConParametros(){
		
	}

	
	public void Insercion(String nombre, String apellido, String apodo) {
		
		final String JDBC_DRIVER="org.h2.Driver";
		final String DB_URL="jdbc:h2:tcp://localhost/~/test";
		final String DB_USER="sa";
		final String DB_PASSWORD="";
		
		Connection conexion= null;
		
		try{
			System.out.println("Creando conexion....");
			Class.forName(JDBC_DRIVER);
			conexion=DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			
			
			PreparedStatement inserta = conexion.prepareStatement("INSERT INTO FAMILIARES (NOMBRE, APELLIDO, APODO) VALUES (?,?,?)");
			System.out.println("Insertando....");
			//Mapeamos los valores que recibe nuestro metodo contra los parametros del query
			inserta.setString(1, nombre);
			inserta.setString(2, apellido);
			inserta.setString(3, apodo);
			
			inserta.executeUpdate();
			inserta.close();
			System.out.println("Insercion Exitosa");
			
		}catch(Exception e){
			e.getMessage();
		}finally{
			try{
				if(conexion != null){
					if(!conexion.isClosed()){
						conexion.close();
					}
				}
				
			}catch(SQLException e){
				e.getSQLState();
			}
		}
	}
}
