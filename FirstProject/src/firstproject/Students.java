/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstproject;

/**
 *
 * @author DESTINY
 */
public class Students {
    private String name;
    private String roll_num;
    private String div;

    public Students(String name, String roll_num, String div) {
        this.name = name;
        this.roll_num = roll_num;
        this.div = div;
    }

    public String getName() {
        return name;
    }

    public String getRoll_num() {
        return roll_num;
    }

    public String getDiv() {
        return div;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoll_num(String roll_num) {
        this.roll_num = roll_num;
    }

    public void setDiv(String div) {
        this.div = div;
    }
    
    
}
