/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.util.Scanner;
import jdk.nashorn.internal.parser.TokenType;

/**
 *
 * @author WILSON CORELIA
 */
public class Even {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        System.out.println("Enter a number to check if it is even or odd");
        Scanner age = new Scanner(System.in);
            int x= age.nextInt();
         if(x%2==0){
                 System.out.println("This is an even number");
             }
         else{
             System.out.println("This is an odd number");}
         
    }
}
  
            
                
            
    
