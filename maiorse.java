import javax.swing.JOptionPane;

    public class maiorse {

      public static void main (String[]args){

          int numero1, numero2;

            numero1 = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero: "));
            numero2 = Integer.parseInt(JOptionPane.showInputDialog("Insira outro numero: "));

              if (numero1 > numero2){

                JOptionPane.showMessageDialog(null, numero1 + " eh maior que " + numero2);
              
              }else{

                if (numero2 > numero1){

                  JOptionPane.showMessageDialog(null, numero2 + " eh maior que "+ numero1);

                }else{

                  JOptionPane.showMessageDialog(null, numero1 + " eh igual a " + numero2);

                }
              }
      
      }
    }