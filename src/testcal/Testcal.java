
package testcal;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Bruno
 */
public class Testcal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        String imprimir;
        float primeiroOperador, segundoOperador;
        String operacao;
        
        
        Scanner entrada = new Scanner(System.in);
        
        JOptionPane.showInputDialog("Escolha sua operação [+ - * / ]: ");
        operacao = entrada.nextLine();
        
        JOptionPane.showInputDialog("Entre com o primeiro número: ");
        primeiroOperador = entrada.nextFloat();
        
        JOptionPane.showInputDialog("Entre com o segundo número: ");
        segundoOperador = entrada.nextFloat();
        
        JOptionPane.showMessageDialog(null,"O resultado e :" +operacao,"Resultado", JOptionPane.INFORMATION_MESSAGE);
        System.out.println();
        
        switch( operacao.charAt(0) )
        {
            
            case '+':
                System.out.printf("%.2f + %.2f = %.2f", primeiroOperador, segundoOperador, primeiroOperador + segundoOperador);
                break;        
                
            case '-':
                System.out.printf("%.2f - %.2f = %.2f", primeiroOperador, segundoOperador, primeiroOperador - segundoOperador);
                break;
                
            case '*':
                System.out.printf("%.2f * %.2f = %.2f", primeiroOperador, segundoOperador, primeiroOperador * segundoOperador);
                break;
                
            case '/':
                System.out.printf("%.2f / %.2f = %.2f", primeiroOperador, segundoOperador, primeiroOperador / segundoOperador);
                break;
            
            default:
                System.out.printf("Você digitou uma operação inválida.");        
            
        }
        

    }
}

