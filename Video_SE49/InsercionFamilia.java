package Video_SE49;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class InsercionFamilia {
	public static void main(String[] args){
		
		final String JDBC_DRIVER="org.h2.Driver";
		final String DB_URL="jdbc:h2:tcp://localhost/~/test";
		
		final String DB_USER="sa";
		final String DB_PASSWORD="";
		
		Connection conexion=null;
		
		try{
			Class.forName(JDBC_DRIVER);
			conexion=DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			
			PreparedStatement insert = conexion.prepareStatement("INSERT INTO FAMILIARES (ID_FAMILIAR, NOMBRE, APELLIDO, APODO) VALUES (2,'JACQUELINE','GALEANA','CHINA')");
			PreparedStatement insert2 = conexion.prepareStatement("INSERT INTO FAMILIARES (ID_FAMILIAR, NOMBRE, APELLIDO, APODO) VALUES (4,'KENIA','HERNANDEZ','MUÑE')");
			PreparedStatement insert3 = conexion.prepareStatement("INSERT INTO FAMILIARES (ID_FAMILIAR, NOMBRE, APELLIDO, APODO) VALUES (5,'JUAN','HERNANDEZ','SHREK')");
			PreparedStatement insert4 = conexion.prepareStatement("INSERT INTO FAMILIARES (ID_FAMILIAR, NOMBRE, APELLIDO, APODO) VALUES (3,'LUZ','CONO','FIONA')");
			
			insert.executeUpdate();
			insert.close();
			
			insert2.executeUpdate();
			insert2.close();
			
			insert3.executeUpdate();
			insert3.close();
			
			insert4.executeUpdate();
			insert4.close();
			
		
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
