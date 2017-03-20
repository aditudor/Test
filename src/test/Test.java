/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Adrian.Tudor
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        long montant; 
        montant = 100L;
       
        montant = Calculer(montant, true, true);
     
        System.out.println(montant); 
    }
    
    static long Calculer(long montant, boolean federal, boolean provincial){
    if (montant <= 0) {
            throw new IllegalArgumentException();
        }
        
        long resultat = montant;
        if (federal) {
            resultat += Math.round(montant * 0.05);
        }
        if (provincial) {
            resultat += Math.round(montant * 0.09975);
        }
        return resultat;
    }
   
}
