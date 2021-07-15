/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstapplication;

/**
 *
 * @author DESTINY
 */
public class Name {
    private String first_name;
    private String middle_name;
    private String last_name;

    public Name(String first_name, String middle_name, String last_name) {
        this.first_name = first_name.toUpperCase().charAt(0)+first_name.toLowerCase().substring(1);
        this.middle_name = middle_name.toUpperCase().charAt(0)+middle_name.toLowerCase().substring(1);
        this.last_name = last_name.toUpperCase().charAt(0)+last_name.toLowerCase().substring(1);
    }

    @Override
    public String toString() {
        return first_name; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public static Name getNameInstance(String first_name, String middle_name, String last_name){
        return new Name(first_name, middle_name, last_name);
    }

    public String getFirst_name() {
        return first_name;
    }


    public String getLast_name() {
        return last_name;
    }
    
    public String getInitialsName(){
        return getFirst_name().charAt(0) +" "+ middle_name.charAt(0) + " "+ getLast_name();
    }
   
}
