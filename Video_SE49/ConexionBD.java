package Video_SE49;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConexionBD {
	public static void main(String[] args) {
		
		//JDBC driver nombre y base de datos URL
		final String JDBC_DRIVER="org.h2.Driver";
		final String DB_URL="jdbc:h2:tcp://localhost/~/test";
		
		//Credenciales de la BD
		final String USER="sa";
		final String PASSWORD="";
		
		//Definimos una variable de tipo Conecction para posteriormente poder abrir la conexion a la BD
		Connection conexion=null;
		
		try { //Este try es para intentar realizar la conexion e insercion de un registro a la BD
			
			//Class for Name sirve para poder cargar el driver
			Class.forName(JDBC_DRIVER);
			
			//Aqui abrimos la conexion a la base con la url, usuario y password validos		
			conexion=DriverManager.getConnection(DB_URL, USER, PASSWORD);
			
			//PreparedStatement nos ayuda a generar sentencias de Insert, Update y Delete
			PreparedStatement iud=conexion.prepareStatement("INSERT INTO FAMILIARES (ID_FAMILIAR, NOMBRE, APELLIDO, APODO) VALUES (1,'FERNANDA','HERNANDEZ','PRINCESA')");
			
			//Una vez generada la sentencia se debe ejecutar con el metodo executeUpdate
			iud.executeUpdate();
			
			//Liberamos el recurso de PreparedStatement una vez que se ejecuto
			iud.close();
			
		}catch(Exception e){ //Aqui vamos a cachar las excepciones si es que no podemos conectar o insertar en la BD
			System.out.println(e.getMessage());
			
		}finally{ //en Finally siempre vamos a cerrar los recursos para que nuestra aplicacion no se quede pegada
			if(conexion !=null){ //Validamos Si nuestra conexion esta llena o si se pudo conectar
				try { //Este try es para validar si podemos realizar la liberacion de los recursos (Es por las validaciones que se realizan)
					if(!conexion.isClosed()){ // si la conexion no esta cerrada
						conexion.close();
					}	
				}catch(SQLException e){ // Es el catch de la validacion de liberacion de recursos
					System.out.println(e.getSQLState());
				}
			}
		}
		
		
		
		
		
	}

}
