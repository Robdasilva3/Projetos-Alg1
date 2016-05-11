import javax.swing.JOptionPane;

    public class case2 {

      public static void main (String[]args){

        String controle;

          controle = JOptionPane.showInputDialog("Escolha a profissao de Tiburciu: " + 
            "\n E- Engenheiro \n P- Programador \n M- Medico \n A- Advogado \n D- Designer ");


            char controleCHAR = controle.charAt(0);


            switch(controleCHAR){

                case 'e':

                  JOptionPane.showMessageDialog(null, "Tiburciu eh Engenheiro.");

                break;

                case 'p':

                  JOptionPane.showMessageDialog(null, "Tiburciu eh Programador.");

                break;

                case 'm':

                  JOptionPane.showMessageDialog(null, "Tiburciu eh Medico.");

                break;

                case 'a':

                  JOptionPane.showMessageDialog(null, "Tiburciu eh Advogado.");

                break;

                case 'd':

                  JOptionPane.showMessageDialog(null, "Tiburciu eh Designer.");

                break;

                default:

                  JOptionPane.showMessageDialog(null, "Tiburciu eh Desempregado.");

                break;
            }
      }
    }