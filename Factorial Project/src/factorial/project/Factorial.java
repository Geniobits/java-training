/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial.project;

/**
 *
 * @author DESTINY
 */
public class Factorial {
    
    public int calculateFact(int num){
        int result;
        
        if(num == 1)
            return 1;
        
        
        result = calculateFact(num -1)*num;        
        return result;
    }
}
