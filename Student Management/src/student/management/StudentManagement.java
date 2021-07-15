/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.management;

import java.util.Scanner;

/**
 *
 * @author DESTINY
 */
public class StudentManagement {

    /**
     * @param args the command line arguments
     */
    private static Student[] students = new Student[100];
    private static int counter = 0;
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        boolean do_end = false;
        
        do{
            System.out.println("Choose option:\n"
                    + "1. Add studnet\n"
                    + "2. Show studnet\n"
                    + "3. Search studnet\n");
            Scanner sc = new Scanner(System.in);
            int option = sc.nextInt();
            
            switch(option){
                case 1: 
                    //add
                    Student st = add_studnet();
                    students[counter] = st;
                    counter++;
                    break;
                case 2:
                    //show
                    show_student();
                    break;
                case 3:
                    //search
                    break;
                default:
                    do_end = true;
            }
            
            
        }while(!do_end);
        
    }
    
    public static Student add_studnet(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:\n");
        String fn  = sc.nextLine();
        
        String[] afn = fn.split(" ");
        
        Name student_name = new Name(afn[0], afn[1], afn[2]);
        
        
        System.out.println("Enter div:\n");
        String div  = sc.nextLine();
        
        System.out.println("Enter roll_num:\n");
        String roll_num  = sc.nextLine();
        
        return new Student(student_name, roll_num, div);
        
    }

    private static void show_student() {
          for(int i=0; i<counter; i++){
              Student st = students[i];
              System.out.println("Name:"+ st.getStudent_name().firstName 
                      + " "+ st.getStudent_name().lastName+"\t"
                      + "Roll_num:"+st.roll_no+"\t"
                              + "Div:"+st.div+"\t");
          }
    }
    
    
}
