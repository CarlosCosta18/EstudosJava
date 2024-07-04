/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor03;

import java.util.Arrays;

/**
 *
 * @author Carlos
 */
public class Vetor03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double v[] = {3.4, 54.4, 14.5, 1.51};
        Arrays.sort(v);
        
        
        
        for(double valor: v){
            System.out.println(valor);
        }
    }
    
}
