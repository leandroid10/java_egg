/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2e1;

import java.util.Scanner;

/**
 *
 * @author leandro
 */
public class Guia2e1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer =new Scanner(System.in);
        int num1;
        int num2;
        
         System.out.println("Ingrese dos numeros enteros:");
         num1=leer.nextInt();
         num2=leer.nextInt();
         int suma = num1+num2;
         System.out.println("el resultado de la suma es:"+ suma);
    }
    
}
