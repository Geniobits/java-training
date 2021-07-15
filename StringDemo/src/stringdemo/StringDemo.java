/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringdemo;

/**
 *
 * @author DESTINY
 */
public class StringDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s1 = new String("Shubham Shirse");
        String s2 = new String("SHUBHAM Shirse");
        String s3 = s1 +" "+ s2;
        //concat
        System.out.println(s3 +" "+ (2 + 2.2) +"\n");
        
        //charAt()
        System.out.println(s3.charAt(8));
        
        //equals
        if(s1.equals(s2)){
            System.out.println("Both same");
        }else{
            System.out.println("Not same");
        }
        
        //equalIgnoreCase
        if(s1.equalsIgnoreCase(s2)){
            System.out.println("Both same");
        }else{
            System.out.println("Not same");
        }
        
        //startWith and endsWith
        if(s1.endsWith("shirse")){
            System.out.println("end with shirse");
        }else{
            System.out.println("not end with shirse");
        }
        
        //concate
        s3= s1.concat(s2);
        
        //replace
        System.out.println(s1.replace("Shubham", ""));
        
        //toLowerCase toUpperCase
        System.out.println(s1.toLowerCase());
        
        //contains
        if(s1.contains("Shubham")){
            System.out.println("It contains shubham");
        }else{
            System.out.println("It doesnt contains shubham");
        }
        
        //substring
        System.out.println(s1.substring(5, 10));
        
        //split
        String[] mySplit = s1.split(" ");
        
        
        
        
        
    }
    
}
