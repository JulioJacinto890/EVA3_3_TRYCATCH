/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_3_trycatch;

/**
 *
 * @author hp
 */
public class EVA3_3_TRYCATCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        try {
            int x=3,y=0;
            int res=x/y;
            System.out.println("Resultado:"+ res);
            // Primero ve el tipo de excepcion y luego la variable 
            
            } catch (ArithmeticException error) {
                    System.out.println("Exception: "+error.getMessage());
        } 
        
        
        
        System.out.println("Si funciona");
    }
    
}
    