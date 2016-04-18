import javax.swing.JOptionPane;

    public class carroflex {

      public static void main (String[]args){

        Double precogasolina;
        Double precoalcool;        

          precoalcool = Double.parseDouble(JOptionPane.showInputDialog("Digite o preco do alcool: "));
          precogasolina = Double.parseDouble(JOptionPane.showInputDialog("Digite o preco da gasolina: "));

          if (precoalcool > precogasolina){

            JOptionPane.showMessageDialog(null,"Abasteca com gasolina");

          }

          else {

            JOptionPane.showMessageDialog(null,"Abasteca com alcool");

          }

      }

    }