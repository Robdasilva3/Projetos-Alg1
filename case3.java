import javax.swing.JOptionPane;

    public class case3 {

      public static void main (String[]args){

          Double preco, resultado;
          String nome, controle;

            nome = JOptionPane.showInputDialog("Digite seu nome: ");

            preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preco do produto: "));

            controle = JOptionPane.showInputDialog("Escolhe a categoria do produto: " + 
              "\n Categoria A \n Categoria B \n Categoria C \n Categoria D \n Categoria E ");

             char controleCHAR = controle.charAt(0);

              switch(controleCHAR){

                  case 'A':

                    resultado = preco * 0.90;

                      JOptionPane.showMessageDialog(null, nome + ", o preco a pagar eh: R$" + resultado);

                  break;

                  case 'B':

                    resultado = preco * 0.85;

                      JOptionPane.showMessageDialog(null, nome + ", o preco a pagar eh: R$" + resultado);

                  break;

                  case 'C':

                    resultado = preco * 0.80;

                      JOptionPane.showMessageDialog(null, nome + ", o preco a pagar eh: R$" + resultado);

                  break;

                  case 'D':

                    resultado = preco * 0.75;

                      JOptionPane.showMessageDialog(null, nome + ", o preco a pagar eh: R$" + resultado);

                  break;

                  case 'E':

                    resultado = preco * 0.50;

                      JOptionPane.showMessageDialog(null,  nome + ", o preco a pagar eh: R$" + resultado);

                  break;

                  default:

                    JOptionPane.showMessageDialog(null, nome + ", categoria invalida.");

                  break;


              }
      }
    }