/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlstatements;

import java.util.Scanner;

/**
 *
 * @author DESTINY
 */
public class ControlStatements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        boolean is_end = false;
        Scanner scanner = new Scanner(System.in);
        
        //started do while loop
        do{
            //i will tell us which operation
            int i=0;
            //show manu
            System.out.println("Help on:\n"+
                    "1. Add\n"+
                    "2. Sub\n"+
                    "3. Mult\n"+
                    "4. Div\n");
            
            //get input from user
            i=scanner.nextInt();
            
            //get two numbers from user
            System.out.println("Enter num first");
            int num1 = scanner.nextInt();
            System.out.println("Enter num second");
            int num2 = scanner.nextInt();
            
            //switch to that opration
            switch(i){
                case 1:
                    System.out.println("Result Add:" + (num1+num2));
                    break;
                case 2:
                    System.out.println("Result Sub:" + (num1-num2));
                    break;
                case 3:
                    System.out.println("Result Mul:" + (num1*num2));
                    break;
                case 4:
                    System.out.println("Result Div:" + (num1/num2));
                    break;    
                default:
                    //end loop
                    System.out.println("Buy Buy\n");
                    is_end = true;
                    break;
                
            }
        }while(!is_end);//check condion for while
        
        
        
    }
    
}
