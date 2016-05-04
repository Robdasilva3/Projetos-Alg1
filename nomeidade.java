import javax.swing.JOptionPane;

    public class nomeidade {

      public static void main (String[]args){

        String nome;
        int idade;

          nome = JOptionPane.showInputDialog("Insira seu nome: ");
          idade = Integer.parseInt(JOptionPane.showInputDialog("Insira sua idade: "));

            if (idade >= 15 && idade <= 25){

                JOptionPane.showMessageDialog(null, nome + " ACEITA!");

            }else{

                JOptionPane.showMessageDialog(null, nome + " NAO ACEITA!");

            }
      }
    }