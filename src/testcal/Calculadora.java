
package testcal;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Bruno
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        
        float primeiroOperador, segundoOperador, resultado;
        String operacao;
        String retorno;
        boolean resultadoB;
        
        Scanner entrada = new Scanner(System.in);
        
        
        operacao = JOptionPane.showInputDialog("Escolha sua operação [+ - * / ]: ");
        
        
        retorno = JOptionPane.showInputDialog("Entre com o primeiro número: ");
        primeiroOperador = Float.parseFloat(retorno);
        retorno = JOptionPane.showInputDialog("Entre com o segundo número: ");
        
        segundoOperador = Float.parseFloat(retorno);
        
        
        System.out.println();
      
        
            switch( operacao.charAt(0) )
            {

                case '+':
                    resultado = primeiroOperador + segundoOperador;
                    System.out.printf("%.2f + %.2f = %.2f", primeiroOperador, segundoOperador, primeiroOperador + segundoOperador);
                    JOptionPane.showMessageDialog(null, "resultado é: " + resultado);
                    break;        

                case '-':
                    resultado = primeiroOperador - segundoOperador;
                    System.out.printf("%.2f - %.2f = %.2f", primeiroOperador, segundoOperador, primeiroOperador - segundoOperador);
                    JOptionPane.showMessageDialog(null, "resultado é: " + resultado);
                    break;

                case '*':
                    resultado = primeiroOperador * segundoOperador;
                    System.out.printf("%.2f * %.2f = %.2f", primeiroOperador, segundoOperador, primeiroOperador * segundoOperador);
                    JOptionPane.showMessageDialog(null, "resultado é: " + resultado);
                    break;

                case '/':
                    resultado = primeiroOperador / segundoOperador;
                    System.out.printf("%.2f / %.2f = %.2f", primeiroOperador, segundoOperador, primeiroOperador / segundoOperador);
                    JOptionPane.showMessageDialog(null, "resultado é: " + resultado);
                    break;

                default:
                    System.out.printf("Você digitou uma operação inválida.");        
          
            }
      

    }
}

