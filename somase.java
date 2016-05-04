import javax.swing.JOptionPane;

    public class somase {

      public static void main (String[]args){


          int numero1, numero2, resultado;

            numero1 = Integer.parseInt(JOptionPane.showInputDialog ("Insira um numero: "));
            numero2 = Integer.parseInt(JOptionPane.showInputDialog("Insira outro numero: "));

              resultado = (numero1 + numero2);

                if (resultado > 10) {

                    JOptionPane.showMessageDialog(null, "O resultado eh: " + resultado);
                    
                }
       
            
      }
    }