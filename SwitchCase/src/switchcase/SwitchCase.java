/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switchcase;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class SwitchCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a quantidade de pernas");
        int qtdPernas = teclado.nextInt();
        String tipo;
        switch (qtdPernas) {
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 3:
                tipo = "Tripé";
            case 4:
                tipo = "Quadrupede";
                break;
            case 6:
                tipo = "Aranha";
            default:
                tipo = "et";
        }
        
        System.out.println(tipo);
        
        
        
    }
    
}
