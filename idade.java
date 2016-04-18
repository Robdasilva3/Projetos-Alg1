import javax.swing.JOptionPane;

    public class idade {

      public static void main (String[]args){

          int idade;
          int idadeemdias;

            idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));

            idadeemdias = idade * 365;

              JOptionPane.showMessageDialog(null,"Voce tem " + idadeemdias + " dias de vida.");
        
      }

    }