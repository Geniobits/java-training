/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geniobits.classesexplianed;

/**
 *
 * @author DESTINY
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Name gf_name = Name.getNameInstance("Anjali","pranav","Sharma"); 
       GirlFriend gf1 = new GirlFriend(gf_name, 5, 20, 40);
       
       Name bf_name = Name.getNameInstance("Shivam","Ram","Singh"); 
       BoyFriend bf1 = new BoyFriend(bf_name, 6, 20, 60, true, "Engineer");
       
       boolean accepted=gf1.getAndAnswerTheProposal(bf1.createProposal());
       if(accepted){
           System.out.println("She said yes");
       }else{
        System.out.println("She said no");
       }
    }
    
    
    
    
}
