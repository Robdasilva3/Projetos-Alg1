import javax.swing.JOptionPane;

    public class divisao2numeros {

      public static void main (String[]args){

        Double numero1;
        Double numero2;
        Double resultado;

          numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero: "));

          numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero: "));

            resultado = numero1 / numero2;

              JOptionPane.showMessageDialog(null,"O resultado da divisao eh: " + resultado);
              

      }

    }