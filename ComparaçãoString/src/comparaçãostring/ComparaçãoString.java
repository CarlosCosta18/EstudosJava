/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparaçãostring;

/**
 *
 * @author Carlos
 */
public class ComparaçãoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nome1 = "Carlos";
        String nome2 = "Carlos";
        String nome3 = new String("Carlos");
        String res;
        res = nome1.equals(nome3) ? "Igual":"Diferente";
        System.out.println(res);
    }
    
}
