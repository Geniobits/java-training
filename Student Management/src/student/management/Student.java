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
public class Student {
    
    public Name student_name;
    public String roll_no;
    public String div;
    public double marks;

    public Student(Name student_name, String roll_no, String div) {
        this.student_name = student_name;
        this.roll_no = roll_no;
        this.div = div;
    }

    
    public Name getStudent_name() {
        return student_name;
    }

    public void setStudent_name(Name student_name) {
        this.student_name = student_name;
    }

    public String getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(String roll_no) {
        this.roll_no = roll_no;
    }

    public String getDiv() {
        return div;
    }

    public void setDiv(String div) {
        this.div = div;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }
    
    
    
    
}
