import javax.swing.JOptionPane;
	
	public class caixacomnome {

		public static void main (String[]args){

			String nome = null;

			nome = JOptionPane.showInputDialog("Digite um nome:");

				JOptionPane.showMessageDialog(null,"Seu nome: " + nome);

		}
	}