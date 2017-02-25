package Video_SE52.DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	
	protected Connection conexion;
	
	private final String JDBC_DRIVER="org.h2.Driver";
	private final String DB_URL="jdbc:h2:tcp://localhost:9092/Test";
	
	private final String DB_USER="test";
	private final String DB_PASSWORD="";
	
	
	public void conectar()throws Exception{
		try {
			conexion=DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			Class.forName(JDBC_DRIVER);
		}catch(Exception e){
			throw e;
		}
		
	}
	
	public void desconectar() throws SQLException{
		if(conexion != null){
			if(!conexion.isClosed()){
				conexion.close();
			}
		}
	}
	

}
