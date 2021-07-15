/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rolldie;

import java.util.Random;

/**
 *
 * @author DESTINY
 */
public class Die {
    
    int side = 0;
    
    void roll(){
        Random ran = new Random();                
        side = ran.nextInt(6)+1;
    }
    
}
