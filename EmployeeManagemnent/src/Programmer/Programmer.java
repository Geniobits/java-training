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
public abstract class Programmer implements Employee{
    
    int age;
    final int salary = 20000;
    public String name;
    public Programmer(String name, int age) {
        this.name = name;
    }

    @Override
    public void Work() {
        System.out.println("Programming");
    }
    
    public interface EmployeeSuper{
    
            public int salary=100000;

            void Work();

            public int getSalary();
    }

    
}
