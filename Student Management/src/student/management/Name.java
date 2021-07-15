/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.management;

/**
 *
 * @author DESTINY
 */
public class Name {
    
    String firstName;
    String middleName;
    String lastName;

    public Name(String firstName, String middleName, String lastName) {
        Capitalization cp = new Capitalization();
        
        this.firstName = cp.capitalFirstLetter(firstName);
        this.middleName = cp.capitalFirstLetter(middleName);
        this.lastName = cp.capitalFirstLetter(lastName);
    }
    
    
    public class Capitalization{
        
        String capital(String input){
            return input.toUpperCase();
        }
        
        String lower(String input){
            return input.toLowerCase();
        }
        
        String capitalFirstLetter(String input){
            String firstChar = input.charAt(0)+"";
            return firstChar.toUpperCase() + input.substring(1).toLowerCase();
        }
    }
    
    
    
}
