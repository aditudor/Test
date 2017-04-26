/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

// comentaire Avril 26 

/**
 *
 * @author Adrian.Tudor
 */
public class Dollar {
    public int Add(int a, int b){
     return a+b;   
    }
    
    public int Procent(int a, int b){
        return a = (int)((a*b) / 10000);
    }
    
    public String toString(int a){
        String a$;
        String b$ = "";
        
        a$ = String.valueOf(a);
        int l = a$.length(); 
       
        for (int i = 0;  i < l; i++ ){
            if ( i == (l - 2) ){
                b$ += ".";
                b$ += a$.charAt(i);
            } else {
                b$ += a$.charAt(i);
            }
            
        } 
        b$ += "$";
        return b$;
    }
}
