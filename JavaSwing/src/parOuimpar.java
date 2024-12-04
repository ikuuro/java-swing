/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ikaro
 */

import javax.swing.JOptionPane;

public class parOuimpar {
    
    public static void main(String [] args){
        
       String num1 = JOptionPane.showInputDialog("Insira um número: ");
       
       int numero1 = Integer.parseInt(num1);
        
        if (numero1 % 2 == 0) {
            JOptionPane.showMessageDialog(null,+ numero1 + " é um número par.");
        } else {
            JOptionPane.showMessageDialog(null, + numero1 + " é um número ímpar.");
        }
    }
}