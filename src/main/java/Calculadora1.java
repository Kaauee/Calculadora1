

import calculadora.Calculadora;
import javax.swing.JOptionPane;

public class Calculadora1 {

    public static void main(String[] args) {

        String opcao = ""; 
        Calculadora calculadora = new Calculadora();

        while (!opcao.equals("9")) {
 
            opcao = JOptionPane.showInputDialog("1 - Leitura \n2 - Soma \n3 - Subtracao\n4 - Produto \n5 - Divisao \n 9 - Sair");
            
            switch (Integer.parseInt(opcao)) {

                case 1:
                    calculadora.setValorA(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de A")));
      
                    calculadora.setValorB(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de B")));

                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Soma: " + calculadora.getAdicao());
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Subtracao: " + calculadora.getSubtracao());
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Produto: " + calculadora.getProduto());
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Divisao: " + calculadora.getDivisao());
                    break;
            }

        }

    }
}
