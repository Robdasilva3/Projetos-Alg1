import javax.swing.JOptionPane;

    public class mediaalunos {

      public static void main (String[]args){

        Double nota1;
        Double nota2;
        Double nota3;
        Double nota4;
        Double media;

          nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
          nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota: "));
          nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota: "));
          nota4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a quarta nota: "));

            media = (nota1 + nota2 + nota3 + nota4)/ 4;

              if (media >= 7.0) {

                JOptionPane.showMessageDialog(null,"Aluno aprovado!");

              }

              else {

                JOptionPane.showMessageDialog(null,"Aluno Reprovado");
              }

      }

    }