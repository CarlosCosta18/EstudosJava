/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor02;

/**
 *
 * @author Carlos
 */
public class Vetor02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] meses = {
            "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
            "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };
        
        int[] dias = {
            31, // Janeiro
            28, // Fevereiro (não considerando ano bissexto)
            31, // Março
            30, // Abril
            31, // Maio
            30, // Junho
            31, // Julho
            31, // Agosto
            30, // Setembro
            31, // Outubro
            30, // Novembro
            31  // Dezembro
        };
        for(int c = 0; c < meses.length; c++){
            System.out.println("O mes de " + meses[c] + " tem " + dias[c] + " Dias ao todo");
        }
    }
    
}
