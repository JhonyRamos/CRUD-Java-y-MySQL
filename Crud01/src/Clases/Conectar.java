/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Connection; /*libreria*/
import java.sql.DriverManager;

/**
 *
 * @author alexi
 */
public class Conectar {
   
    /*variable coneccion*/
    Connection cn;
/* conectar a la base de datos mysql*/ 
    
/*constructor publico*/    
public Connection conexion () {
        
        try {
            // Cargar el controlador JDBC de MySQL
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3308/basecrud01","root",""); /*"" "argumento es la contraseña utilizada para autenticarse en la base de datos"*/
            
// Imprimir mensaje en la consola para indicar que la conexión se realizó con éxito.
            System.out.println("conectado");
      
        } catch (Exception e){
            
// produce una excepción, imprimir un mensaje de error en la consola
            System.err.println(e.getMessage());
        }
                
         return cn;
}
    
}
