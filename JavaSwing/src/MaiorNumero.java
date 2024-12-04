/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ikaro
 */
import javax.swing.JOptionPane;

public class MaiorNumero {
    
    public static void main(String[] args) {
        
        String numero1 = JOptionPane.showInputDialog("Insira um número: ");
        String numero2 = JOptionPane.showInputDialog("Insira outro número: ");
        
        
        int num1 = Integer.parseInt(numero1); 
        int num2 = Integer.parseInt(numero2);
     
       
         

        if (num1 > num2) {
            JOptionPane.showMessageDialog(null, "O primeiro número " + num1 + " é maior que o segundo número " + num2);
        } else if (num2 > num1) {
            JOptionPane.showMessageDialog(null, "O segundo número " + num2 + " é maior que o primeiro número "+ num1);
        } else {
            JOptionPane.showMessageDialog(null, "Ambos os números são iguais.");
        }
    }
}

        
        
        
        
 
