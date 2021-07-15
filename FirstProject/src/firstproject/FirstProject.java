/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstproject;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author DESTINY
 */
public class FirstProject {

    private static ArrayList<Students> myStudentList;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean end = false;
        myStudentList = new ArrayList<>();
        Scanner myScanner = new Scanner(System.in);
        do{
            int option = 1;
            System.out.println("Select the option:\n"
                    + "1. Add New Student\n"
                    + "2. Edit Name by id\n"
                    + "3. Delete Student by id\n"
                    + "4. Show\n"
                    + "5. Exit");
            
            option = myScanner.nextInt();
            if(option==1){
                addNewStudent();
            }        
            else if(option==2){}
            else if(option==3){} 
            else if(option==4){
                show_students();
            }else{
                 end=true;
            }
            System.out.println(end);
        }while(!end);
        
    }

    private static void addNewStudent() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = myScanner.nextLine();
        System.out.println("Enter Roll number:");
        String roll_num = myScanner.nextLine();
        System.out.println("Enter Div:");
        String div = myScanner.nextLine();
        myStudentList.add(new Students(name, roll_num,div));
        System.out.println("Student added successfully"); //To change body of generated methods, choose Tools | Templates.
    }

    private static void show_students() {
        for(int i=0;i<myStudentList.size(); i++){
            System.out.println("ID: "+i+
                    "Name: "+ myStudentList.get(i).getName()+
                    "Roll Num: "+ myStudentList.get(i).getRoll_num()+
                    "Div: "+myStudentList.get(i).getDiv()+"\n");
        }
    }

    
}
