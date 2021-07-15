/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programmer;

/**
 *
 * @author DESTINY
 */
public class PythonProgrammer extends Programmer{
    
    public PythonProgrammer(String name, int age) {
        super(name, age);
    }
    
    
    @Override
    public void Work(){
        System.out.println("Python Programming");
    }

    @Override
    public int getSalary() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
