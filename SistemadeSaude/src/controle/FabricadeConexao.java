
package controle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FabricadeConexao {
    public Connection con;
    public Statement stmt;
    public ResultSet rs;
    String user = "root";
    String url = "jdbc:mysql://localhost/hospital";
    String password = "";
    String driver = "com.mysql.jdbc.Driver";    
    
        public void abrirConexao(){
            try {
            Class.forName( driver ).newInstance();
            con = DriverManager.getConnection(url, user, password );
            System.out.println("esta conectado");
            stmt = con.createStatement();    
            } catch (Exception e) {
          }
         }
        public static void main(String args[]){
        try {
            FabricadeConexao fab = new FabricadeConexao();
            fab.abrirConexao();
        } catch (Exception e) {
            System.out.println("nao conectado");
        }
    
    }
}
