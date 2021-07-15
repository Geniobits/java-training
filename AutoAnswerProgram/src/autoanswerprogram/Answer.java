/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoanswerprogram;

/**
 *
 * @author DESTINY
 */
public class Answer implements SharedConstants{
    
    public static void get_answer(int q){
        switch(q){
            case Yes:
                System.out.println("Answer: Yes");
                break;
            case No:
                System.out.println("Answer: No");
                break;
            case MayBe:
                System.out.println("Answer: MayBe");
                break;
            case Later:
                System.out.println("Answer: Later");
                break;   
                
        }
    }
}
