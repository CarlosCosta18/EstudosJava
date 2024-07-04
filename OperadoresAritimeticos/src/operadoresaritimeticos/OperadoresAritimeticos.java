/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoresaritimeticos;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class OperadoresAritimeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        Scanner teclado = new Scanner(System.in);
        
       /* System.out.println("Digite a nota 1");
        int n1 = teclado.nextInt();
        System.out.println("Digite a nota 2");
        int n2 = teclado.nextInt();
        float m = (n1 + n2) / 2;
        System.out.println("A média é " + m);
        */
       /*
        int numero1 = 5;
        int valor = 5 + ++numero1;
        System.out.println(valor);
        */
       
      /*float v = 8.5f;
      int ar = (int)Math.round(v);
        System.out.println(ar);
        */
      
      double al = Math.random();
      int n = (int)(5 + al * (10-5)); 
        System.out.println(n);
               
    }
    
}
