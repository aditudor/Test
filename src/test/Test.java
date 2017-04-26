package test;

import java.io.*;

/**
 *
 * @author Adrian.Tudor
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
//        System.out.println(montant); 
        
        int a = 452342367;
        Dollar d = new Dollar();
        System.out.println("Ävant: " + a);
        System.out.println("Apres: " + d.toString(a));

    }
}