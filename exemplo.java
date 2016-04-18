import javax.swing.JOptionPane;
	
	public class Exemplo {
		
		public static void main(String[] args) {

			String nome;

				nome = JOptionPane.showInputDialog("Digite seu nome:");

				JOptionPane.showMessageDialog(null,"Seu nome eh: " + nome);
		
		}		

	}
