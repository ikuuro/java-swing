/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ikaro
 */

import javax.swing.JOptionPane;

public class Média {

    public static void main(String[] args) {
       
        String nota1 = JOptionPane.showInputDialog(null, "Digite a primeira nota:");
        String nota2 = JOptionPane.showInputDialog(null, "Digite a segunda nota:");
        String nota3 = JOptionPane.showInputDialog(null, "Digite a terceira nota:");

        
          
            double n1 = Double.parseDouble(nota1);
            double n2 = Double.parseDouble(nota2);
            double n3 = Double.parseDouble(nota3);

            
            double media = (n1 + n2 + n3) / 3;

            
            String resultado = media >= 6 ? "Aprovado" : "Reprovado";

            
            JOptionPane.showMessageDialog(null, "Média: " + String.format("%.2f", media) + "\nResultado: " + resultado);
       
        }
    }


    

