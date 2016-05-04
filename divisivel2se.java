import javax.swing.JOptionPane;

    public class divisivel2se {

      public static void main (String[]args){

          int numero1, resultado;

            numero1 = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero: "));

              if ((numero1 %2) == 0){

                  resultado = (numero1 / 2);

                    JOptionPane.showMessageDialog(null, "O resultado eh: " + resultado);

              }else{

                  JOptionPane.showMessageDialog(null, "Nao eh multiplo de dois");

              }
      }
    }