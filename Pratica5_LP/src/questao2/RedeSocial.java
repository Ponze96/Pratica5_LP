package questao2;

import javax.swing.JOptionPane;
import java.util.*;

public class RedeSocial {

	public static void main(String[] args) {
		
		 int i,j;
	     ArrayList<String> RedeSocial = new ArrayList();

	    // [ B ] usando o metodo add() para gravar 4 contatos na agenda
	    
	     do
	     {
	     String menu= JOptionPane.showInputDialog("MENU\n1-Cadastrar\n2-Excluir\n3-Pesquisar\n4-Sair");
	     i = Integer.parseInt(menu);
	     switch (i)
	        {
	             case 1:
	                String nome= JOptionPane.showInputDialog("Digite o Nome: ");
	                String telefone = JOptionPane.showInputDialog("Digite o Telefone: ");
	                String usuarioinsta = JOptionPane.showInputDialog("Digite o @ do seu instagram: ");
	                String email = JOptionPane.showInputDialog("Digite seu email: ");

	                RedeSocial.add(nome+";"+telefone + ";" + usuarioinsta + ";" + email);
	                JOptionPane.showMessageDialog(null, "Inserido com Sucesso");
	                 break;
	           
	             case 2:
	            	 String nomeexcluir = JOptionPane.showInputDialog("Digite o Nome: ");
		               for( j = 0; j<RedeSocial.size(); j++)
		               {
		            	   if(RedeSocial.get(j).contains(nomeexcluir))
		            	   {
		            		   RedeSocial.remove(j);
		            		   j--;		            		   
		            		   
		            		   JOptionPane.showMessageDialog(null, "Removido com sucesso");
		            		   try {
		                           RedeSocial.remove(nomeexcluir);
		                         } catch (IndexOutOfBoundsException e) {		                             
		                             System.out.printf("\nErro: posição inválida (%s).",
		                             e.getMessage());	
		                             }
		            	   		}
		                         
		                        break; 
		                  }
		               	            
	                      
	             case 3:
	            	 int x = RedeSocial.size();
	            	 for(int y = 0; y < x ; y++) {
	            		 String consultar = JOptionPane.showInputDialog("Insira sua Consulta");
	            		 if(RedeSocial.get(y).contains(consultar)) {
	            			 RedeSocial.get(y);
	            			 JOptionPane.showMessageDialog(null, RedeSocial.get(y));
	            			 }
	            	 }
	 
	                   break;
	                    
	                    
	             default:
	            	 JOptionPane.showMessageDialog(null, "Opção Invalida");
	       
	              
	        }
	     }while(i!=4);
	        
	}
	
}

	     
	
	 

	     

	


