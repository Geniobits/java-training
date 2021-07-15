/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemanagemnent;

import Programmer.Employee;
import Programmer.JavaProgrammer;
import Programmer.Programmer;
import Programmer.PythonProgrammer;

/**
 *
 * @author DESTINY
 */
public class EmployeeManagemnent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee em = new JavaProgrammer("shubhm", 22);
        em.Work();
        
        JavaProgrammer jp2 = new JavaProgrammer("Shubham", 22);
        jp2.Work();
        
        
        PythonProgrammer pp = new PythonProgrammer("Shubham", 22);
        pp.Work();
        
    
       
    }
    
}
