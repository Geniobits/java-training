/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testproject;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DESTINY
 */
public class TestProject {

    private static ArrayList<Student> studentList;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean end = false;
        studentList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        do{
            try{
                System.out.print("1. Add Student\n"
                        + "2. Show\n"
                        + "3. Delete\n"
                        + "4. Exit\n");
                int input = scanner.nextInt();
                switch(input){
                    case 1:
                        add_student();
                        break;
                    case 2:
                        show_students();
                        break;
                    case 3:
                        delete_student_by_roll();
                        break;
                    default:
                        end = true;
                        break;

                }
            }catch(Exception e){
                System.out.println("Enter numbers only");
            }
        }while(!end);
    }

    private static void add_student() {
        Scanner myscan = new Scanner(System.in);
        System.out.println("Enter name");
        String name = myscan.nextLine();
        System.out.println("Enter rol_num");
        String roll_num = myscan.nextLine();
        System.out.println("Enter div");
        String div = myscan.nextLine();
        studentList.add(new Student(name, roll_num, div));
    }

    private static void show_students() {
        for(Student student: studentList){
            System.out.println(student.name+" "+student.roll_no+" "+student.div);
        }
    }

    private static void delete_student_by_roll() {
        Scanner myscan = new Scanner(System.in);
        System.out.println("Enter rol_num");
        String roll_num = myscan.nextLine();
        for(Student student: studentList){
            if(student.roll_no.equals(roll_num)){
                studentList.remove(student);
                break;
            }
        }
    }
    
}
