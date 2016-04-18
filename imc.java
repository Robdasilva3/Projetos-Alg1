import javax.swing.JOptionPane;
	
	public class imc {

		public static void main (String[]args){

			Double altura;
			int massa;
			Double imc;
			

			massa = Integer.parseInt(JOptionPane.showInputDialog("Digite seu peso em KG:"));

			altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura em Metros:"));

			imc = massa / (altura * altura);

				JOptionPane.showMessageDialog (null,"Seu IMC eh: " + imc);

		}
		
	}