/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepita;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here]
        int n, p = 0, i = 0, ac = 0, v = 0, s = 0;
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Digite um numero <br> (O valor 0 interrompe)</html>"));
            s += n;
            v++;
            
            if (n % 2 == 0){
                p++;
            } else{
                i++;
            }
            
            if (n > 100){
                ac++;
            }
            
        } while (n != 0);
        
        int m = s / v;
        
        JOptionPane.showMessageDialog(null, "<html> Resultado final <br><hr><br> Total de valores: " + v + 
        "<hr> Total de pares: " + p + "<hr> Total de impares: " + i + "<hr> Acima de 100: " + ac + "<hr>Média: </html>" + m
       
        
        
        
        );
        
        
        
    }
    
}
