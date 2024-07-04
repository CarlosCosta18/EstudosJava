/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estruturadereticaosimples;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class EstruturaDeReticaoSimples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        /*float n1 = teclado.nextFloat();
        float n2 = teclado.nextFloat();
        float media = (n1 + n2) / 2;
        System.out.println("Sua média foi "+ media);
        if (media >9){
            System.out.println("Parabens, pequeno, gafanhoto");
        }
        */
        System.out.println("Ano de Nascimento");
        int nasc = teclado.nextInt();
        int idade = 2024 - nasc;
        if (idade >= 18){
            System.out.println("Maior");
        } else{
            System.out.println("Menor");
        }
        
    }
    
}
