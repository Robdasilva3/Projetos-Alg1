import javax.swing.JOptionPane;
	
	public class somadoisnumeros {

		public static void main (String[]args){

			int numero;
			int outronumero;
			int resposta;

			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero:"));

			outronumero = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero:"));

			resposta = (numero + outronumero);

				JOptionPane.showMessageDialog (null,"A Some eh: " + resposta);

		}
	}