/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication25;

/**
 *
 * @author DESTINY
 */
public class MyStack implements Stack{
    
    private String[] myArray = new String[100]; 
    private int pointer = 0 ;

    @Override
    public void push(String s) {
        myArray[pointer] = s;
        pointer++;
    }

    @Override
    public String pop() {
        String ret = myArray[pointer-1];
        pointer--;
        return ret;
    }
    
}
