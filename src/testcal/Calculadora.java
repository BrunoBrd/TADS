
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
        
        
        operacao = JOptionPane.showInputDialog("Escolha sua opera��o [+ - * / ]: ");
        
        
        retorno = JOptionPane.showInputDialog("Entre com o primeiro n�mero: ");
        primeiroOperador = Float.parseFloat(retorno);
        retorno = JOptionPane.showInputDialog("Entre com o segundo n�mero: ");
        
        segundoOperador = Float.parseFloat(retorno);
        
        
        System.out.println();
      
        
            switch( operacao.charAt(0) )
            {

                case '+':
                    resultado = primeiroOperador + segundoOperador;
                    System.out.printf("%.2f + %.2f = %.2f", primeiroOperador, segundoOperador, primeiroOperador + segundoOperador);
                    JOptionPane.showMessageDialog(null, "resultado �: " + resultado);
                    break;        

                case '-':
                    resultado = primeiroOperador - segundoOperador;
                    System.out.printf("%.2f - %.2f = %.2f", primeiroOperador, segundoOperador, primeiroOperador - segundoOperador);
                    JOptionPane.showMessageDialog(null, "resultado �: " + resultado);
                    break;

                case '*':
                    resultado = primeiroOperador * segundoOperador;
                    System.out.printf("%.2f * %.2f = %.2f", primeiroOperador, segundoOperador, primeiroOperador * segundoOperador);
                    JOptionPane.showMessageDialog(null, "resultado �: " + resultado);
                    break;

                case '/':
                    resultado = primeiroOperador / segundoOperador;
                    System.out.printf("%.2f / %.2f = %.2f", primeiroOperador, segundoOperador, primeiroOperador / segundoOperador);
                    JOptionPane.showMessageDialog(null, "resultado �: " + resultado);
                    break;

                default:
                    System.out.printf("Voc� digitou uma opera��o inv�lida.");        
          
            }
      

    }
}

