/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor04;

import java.util.Arrays;

/**
 *
 * @author Carlos
 */
public class Vetor04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int vet[] = {3, 1, 5, 3, 6, 7, 8, 10};
        for(int valor: vet){
            System.out.print(valor);
        }
        int p = Arrays.binarySearch(vet, 10);
        System.out.println("Encontrei o valor na posição " + p);
    }
    
}
