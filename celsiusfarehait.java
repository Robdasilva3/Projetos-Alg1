import javax.swing.JOptionPane;

    public class celsiusfarehait {

      public static void main (String[]args){

        Double grausceusius;
        Double grausfarehait;

        grausceusius = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em graus Celsius: "));


        grausfarehait = ((grausceusius / 5) * 9 + 32);

          JOptionPane.showMessageDialog(null,"A temperatura em graus Farenheit eh: " + grausfarehait);

      }

    }