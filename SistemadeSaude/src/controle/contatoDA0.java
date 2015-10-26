
package controle;

import contato.contato;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.SwingConstants;

public class contatoDA0 {
   final private  Connection conn;
    public contatoDA0() throws SQLException{
        this.conn = fabricadeConexao.getconexao();
    }
        public void adicionar(contato cl) throws SQLException{
       String sql = "Insert into cadastro(nome,endereco,cpf,rg,cep,cidade,profissao,pai,mae,telefone,email,pontuario,sexo,uf,data) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
       
           try {
                
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, cl.getNome());
            stmt.setString(2, cl.getEndereco());
            stmt.setString(3, cl.getCpf());
            stmt.setString(4, cl.getRg());
            stmt.setString(5, cl.getCep());
            stmt.setString(6, cl.getCidade());
            stmt.setString(7, cl.getProfissao());
            stmt.setString(8, cl.getPai());
            stmt.setString(9, cl.getMae());
            stmt.setString(10, cl.getTelefone());
            stmt.setString(11, cl.getProntuario());
            stmt.setString(12, cl.getSexo());
            stmt.setString(14, cl.getUf());
            stmt.setString(15, cl.getData());
            stmt.execute();
            stmt.close();
            } catch (Exception e) {
            }
            
        
        }


}
