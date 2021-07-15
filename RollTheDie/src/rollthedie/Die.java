/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rollthedie;

import java.util.Random;

/**
 *
 * @author DESTINY
 */
public class Die {
    
    int side = 0;
    
    int rollDie(){
        Random ran = new Random();
        side = ran.nextInt(6)+1;
        return side;
    }
}
