import javax.swing.JOptionPane;
	
	public class caixacomnumero {

		public static void main (String[]args){

			int numero;

			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero:"));

			JOptionPane.showMessageDialog(null,"Seu numero eh: " + numero);

		}
	}