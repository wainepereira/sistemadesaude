// QUE COMEÇEMMM OS JOGOS
package classes;
import javax.swing.JOptionPane;
/**
 *
 * @author Renato De Moura
 */
public class Verificar_CPF {
    
    
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
  public void verificando(){
      
      int dig1, dig2, erro;
      char CPF [] = getCpf().toCharArray();
      
      dig1 = dig2 = erro=0;
    
      int s1 = Integer.parseInt(String.valueOf(CPF[0]));
      int s2 = Integer.parseInt(String.valueOf(CPF[1]));
      int s3 = Integer.parseInt(String.valueOf(CPF[2]));
      int s4 = Integer.parseInt(String.valueOf(CPF[4]));
      int s5 = Integer.parseInt(String.valueOf(CPF[5]));
      int s6 = Integer.parseInt(String.valueOf(CPF[6]));
      int s7 = Integer.parseInt(String.valueOf(CPF[8]));
      int s8 = Integer.parseInt(String.valueOf(CPF[9]));
      int s9 = Integer.parseInt(String.valueOf(CPF[10]));
    
    int soma = ((s1*10)+(s2*9)+(s3*8)+(s4*7)+(s5*6)+(s6*5)+(s7*4)+(s8*3)+(s9*2));
    
    int resto = (soma%11);
    
    if(resto<2){
        dig1=0;    
    }
    else{
        dig1 = 11-resto;
    }
    
    soma = ((s1*11)+(s2*10)+(s3*9)+(s4*8)+(s5*7)+(s6*6)+(s7*5)+(s8*4)+(s9*3)+(dig1*2));
    
    resto = (soma%11);
    
    
  

    if (resto<2){
        dig2=0;  
    }
    else { 
        dig2=11-resto;

    }
    int a = Integer.parseInt(String.valueOf(CPF[12]));
    int b = Integer.parseInt(String.valueOf(CPF[13]));

    if (dig1==a && dig2==b){

       if (CPF[0]=='1' && CPF[1]== '1' && CPF[2]== '1' && 
           CPF[4]== '1' && CPF[5]== '1'&& CPF[6]== '1' && 
           CPF[8]== '1' && CPF[9]== '1'&& CPF[10]=='1' ){

           erro++;     
       }
       if (CPF[0]=='2' && CPF[1]== '2' && CPF[2]== '2' && 
           CPF[4]== '2' && CPF[5]== '2'&& CPF[6]== '2' && 
           CPF[8]== '2' && CPF[9]== '2'&& CPF[10]=='2' ){

           erro++;       
    }
    if (CPF[0]=='3' && CPF[1]== '3' && CPF[2]== '3' && 
           CPF[4]== '3' && CPF[5]== '3'&& CPF[6]== '3' && 
           CPF[8]== '3' && CPF[9]== '3'&& CPF[10]=='3' ){

           erro++;
    }
    if (CPF[0]=='4' && CPF[1]== '4' && CPF[2]== '4' && 
           CPF[4]== '4' && CPF[5]== '4'&& CPF[6]== '4' && 
           CPF[8]== '4' && CPF[9]== '4'&& CPF[10]== '4' ){

           erro++;
    }
    if (CPF[0]=='5' && CPF[1]== '5' && CPF[2]== '5' && 
           CPF[4]== '5' && CPF[5]== '5'&& CPF[6]== '5' && 
           CPF[8]== '5' && CPF[9]== '5'&& CPF[10]== '5' ){

           erro++;
    }
    if (CPF[0]=='6' && CPF[1]== '6' && CPF[2]== '6' && 
           CPF[4]== '6' && CPF[5]== '6' && CPF[6]== '6' && 
           CPF[8]== '6' && CPF[9]== '6'&& CPF[10]== '6' ){

           erro++;
        }
    if (CPF[0]=='7' && CPF[1]== '7' && CPF[2]== '7' && 
           CPF[4]== '7' && CPF[5]== '7'&& CPF[6]== '7' && 
           CPF[8]== '7' && CPF[9]== '7' && CPF[10]=='7' ){

           erro++;
    }
    if (CPF[0]=='8' && CPF[1]== '8' && CPF[2]== '8' && 
           CPF[4]== '8' && CPF[5]== '8' && CPF[6]== '8' && 
           CPF[8]== '8' && CPF[9]== '8'&& CPF[10]== '8' ){

           erro++;
    }
    if (CPF[0]=='9' && CPF[1]== '9' && CPF[2]== '9' && 
           CPF[4]== '9' && CPF[5]== '9'&& CPF[6]== '9' && 
           CPF[8]== '9' && CPF[9]== '9'&& CPF[10]=='9' ){

           erro++;
    }
    
    
    if (CPF[0]=='0' && CPF[1]== '0' && CPF[2]== '0' && 
           CPF[4]== '0' && CPF[5]== '0'&& CPF[6]== '0' && 
           CPF[8]== '0' && CPF[9]== '0'&& CPF[10]=='0' ){

           erro++;
    }
    if(erro==0){
        JOptionPane.showMessageDialog(null, "CPF Válido.", "INFORMANDO", JOptionPane.INFORMATION_MESSAGE);
        
    }
    else{
        JOptionPane.showMessageDialog(null, "CPF Invalido.", "ERRO", JOptionPane.ERROR_MESSAGE);
    }
   
    }
    else{
        JOptionPane.showMessageDialog(null, "CPF Inválido.", "ERRO", JOptionPane.ERROR_MESSAGE);
    }
    
  }





}
 


  
   

   
    

    
    
    
    
    
    
    
  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  
