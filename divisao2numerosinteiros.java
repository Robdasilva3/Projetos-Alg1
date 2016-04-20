import javax.swing.JOptionPane;

    public class divisao2numerosinteiros {

      public static void main (String[]args){

        int numero1;
        int numero2;
        int resultado;

          numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero: "));

          numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero: "));

            resultado = numero1 / numero2;

              JOptionPane.showMessageDialog(null,"O resultado da divisao eh: " + resultado);
              

      }

    }