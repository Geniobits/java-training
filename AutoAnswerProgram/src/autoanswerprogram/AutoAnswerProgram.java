/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoanswerprogram;

import java.util.Random;

/**
 *
 * @author DESTINY
 */
public class AutoAnswerProgram implements SharedConstants{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Random rm  = new Random();
        int ran = rm.nextInt(3);
        Answer.get_answer(ran);
    }
    
}
