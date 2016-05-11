import javax.swing.JOptionPane;

    public class case1 {

      public static void main (String[]args){

        int controle;
        Double adicao, subtracao, divisao, multiplicacao, resultado, n1, n2;

          controle = Integer.parseInt(JOptionPane.showInputDialog("Escolha a oprecao: " + 
            "\n 1- Adicao \n 2- Subtracao \n 3- Divisao \n 4- Multiplcacao "));

          n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero: "));
          n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero: "));

            switch(controle){
                
                case 1:

                  resultado = n1 + n2;

                    JOptionPane.showMessageDialog(null, "O resultado eh: " + resultado);

                break;

                case 2: 

                  resultado = n1 - n2;

                    JOptionPane.showMessageDialog(null, "O resultado eh: " + resultado);

                break;

                case 3:

                  resultado = n1 / n2;

                    JOptionPane.showMessageDialog(null, "O resultado eh: " + resultado);

                break;

                case 4:

                  resultado = n1 * n2;

                    JOptionPane.showMessageDialog(null, "O resultado eh: " + resultado);

                break;

                default:

                  JOptionPane.showMessageDialog(null, "Oprecao invalida!");

                break;

            }
       
            
      }
    }