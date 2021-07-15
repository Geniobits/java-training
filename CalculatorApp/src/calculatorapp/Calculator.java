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
public class Calculator {
    
    double num1;
    double num2=15;
    
    Calculator(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    
    Calculator(double num1){
        this.num1 = num1;
    }
    
    double add(){
        
        return num1+num2;
    }
    
    String add(String a, String b){
        
        return a+b;
    }
    
    double sub(){
        
        return num1-num2;
    }
    
    double mult(){
        return num1*num2;
    }
    
    double div(){
        return num1/num2;
    }
    
}
