import javax.swing.JOptionPane;

    public class valordelta {

      public static void main (String[]args){

        Double a;
        Double b;
        Double c;
        Double delta;

          a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de A"));
          b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de B"));
          c = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de C"));

            delta = (b*b) - (4*a*c);

              JOptionPane.showMessageDialog(null,"O valor de delta eh: " + delta);

      }

    }