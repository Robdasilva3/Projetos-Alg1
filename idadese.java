import javax.swing.JOptionPane;

    public class idadese {

      public static void main (String[]args){

          int datanasc, dataatual, idade;

            datanasc = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano do seu nascimento: "));
            dataatual = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano atual: "));

              if (dataatual > datanasc){

                  idade = (dataatual - datanasc);

                    JOptionPane.showMessageDialog(null, "Voce tem aproximadamente " + idade + " anos!");

              }else{

                JOptionPane.showMessageDialog(null, "Voce inseriu uma data invalida!");


              }
      }
    }