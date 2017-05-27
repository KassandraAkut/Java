/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.util.Scanner;

/**
 *
 * @author WILSON CORELIA
 */
public class Prime {
    
    public static void main(String[] args){
        
        boolean IsPrime =true;
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a number for check");
        
        int temp = scan.nextInt();
        
        for(int i=2; i<=temp/2; i++){
        int fill = temp%i;
        if(fill==0){
            IsPrime=false;
            break;
        }
    }
        if(IsPrime){
            System.out.println(temp + " Is a Prime number");
    }else{
    System.out.println(temp + " Is not a Prime number");
}
      
    }
}
