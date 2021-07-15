/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstapplication;

import java.util.Scanner;

/**
 *
 * @author DESTINY
 */
public class FirstApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
      Name gf_name = Name.getNameInstance("Anjali", "Ram", "Sharma");
      GirlFriend Anjali = new GirlFriend(gf_name,"female",20,45,5);
      System.out.println(Anjali.getGf_name());
    }
           

}
