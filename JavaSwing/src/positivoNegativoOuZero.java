/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ikaro
 */
import javax.swing.JOptionPane;

public class positivoNegativoOuZero {
    
    public static void main(String[] args) {
        
        String entrada = JOptionPane.showInputDialog(null, "Digite um número inteiro:");

       
            
            int numero = Integer.parseInt(entrada);

            
            String resultado;
            if (numero > 0) {
                resultado = "O número é positivo.";
            } else if (numero < 0) {
                resultado = "O número é negativo.";
            } else {
                resultado = "O número é zero.";
            }

          
            JOptionPane.showMessageDialog(null, resultado);
       
    }
}

    

