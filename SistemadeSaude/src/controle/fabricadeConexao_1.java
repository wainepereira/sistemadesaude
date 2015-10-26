
package controle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class fabricadeConexao {
    
    public static Connection conectabd() throws ClassNotFoundException, SQLException{
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://db4free.net:3306/dbhospitaliesb","waine","d1cbe1");
            //JOptionPane.showMessageDialog(null, "Conectado!");
            return con;
            
        }
        catch(ClassNotFoundException e){
          //  JOptionPane.showMessageDialog(null, error);
         //   return null;
            throw new SQLException(e.getMessage());
        }
    }

    static Connection getconexao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}