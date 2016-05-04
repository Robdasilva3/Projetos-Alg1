import javax.swing.JOptionPane;

    public class salarioprestacao {

      public static void main (String[]args){

          Double salariobruto, prestacao;

            salariobruto = Double.parseDouble(JOptionPane.showInputDialog("Informe seu salario bruto: "));
            prestacao = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da prestacao: "));

              if ((salariobruto * 0.3) >= prestacao) {

                JOptionPane.showMessageDialog(null, "O emprestimo pode ser concedido.");

              }else{

                JOptionPane.showMessageDialog(null, "O eprestimo nao pode ser concedido.");

              }
      }
    }