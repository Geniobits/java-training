/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorapp;

import java.util.Scanner;

/**
 *
 * @author DESTINY
 */
public class CalculatorApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1:");
        double num1 = sc.nextDouble();
        
        
        Calculator my_calc = new Calculator(num1);
        
        
        System.out.println("Addition:"+my_calc.add());
        System.out.println("Sub:"+my_calc.sub());
        System.out.println("Multi:"+my_calc.mult());
        System.out.println("Div:"+my_calc.div());
        
        System.out.println(my_calc.add("Shubham", "Shirse"));
        
        
        
    }
    
}
