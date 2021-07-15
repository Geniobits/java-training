/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmangement;

import java.util.Scanner;

/**
 *
 * @author DESTINY
 */
public class StudentMangement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String studnet[][] = new String[100][3];
        boolean do_end = false;
        int counter = 0;
        Scanner myScanner = new Scanner(System.in);
        do{
            System.out.println("Menu\n"
                    + "1. Add studnets\n"
                    + "2. Search studnet\n"
                    + "3. Edit Student\n"
                    + "4. Show Student\n"
                    + "5. Delete Studnet");
            int input_from_user = myScanner.nextInt();
            switch(input_from_user){
                case 1:
                    //add studnet
                    System.out.println("Enter Name:\n");
                    String name = myScanner.next();
                    System.out.println("Enter roll_num:\n");
                    String roll_num = myScanner.next();
                    System.out.println("Enter Div:\n");
                    String div = myScanner.next();
                    studnet[counter][0] = name;
                    studnet[counter][1] = roll_num;
                    studnet[counter][2] = div;
                    counter++;
                    break;
                case 2:
                    //search by name
                    System.out.println("Enter Name:\n");
                    String name_for_search = myScanner.next();
                    for(int i=0;i<counter; i++){
                        String name_from_array = studnet[i][0];
                        if(name_from_array.equals(name_for_search)){
                            System.out.print("Name:"+studnet[i][0]);
                            System.out.print(" Roll num:"+studnet[i][1]);
                            System.out.print(" Div:"+studnet[i][2]);
                            System.out.println();
                        }
                    }
                    break;
                case 3:
                    //edit
                    System.out.println("Enter roll num:\n");
                    String roll_for_search = myScanner.next();
                    for(int i=0;i<counter; i++){
                        String roll_from_array = studnet[i][1];
                        if(roll_from_array.equals(roll_for_search)){
                        
                            System.out.println("Enter Name:\n");
                            String name_to_chnage = myScanner.next();
                            System.out.println("Enter Div:\n");
                            String div_to_chnage = myScanner.next();
                            studnet[i][0] = name_to_chnage;
                            studnet[i][2] = div_to_chnage;
                            
                        }
                    }
                    break;
                case 4: 
                    //show
                    for(int i=0;i<counter; i++){
                        System.out.print("Name:"+studnet[i][0]);
                        System.out.print(" Roll num:"+studnet[i][1]);
                        System.out.print(" Div:"+studnet[i][2]);
                        System.out.println();
                    }
                    break;
                    
                case 5:
                    //delete
                    System.out.println("Enter roll num:\n");
                    String roll_for_delete = myScanner.next();
                    int studnet_position = 100;
                    for(int i=0;i<counter; i++){
                        String roll_from_array = studnet[i][1];
                        if(roll_from_array.equals(roll_for_delete)){
                            studnet_position = i;
                        }
                    }
                    
                    for(int i=studnet_position;i<counter; i++){
                        studnet[i][0] = studnet[i+1][0];
                        studnet[i][1] = studnet[i+1][1];
                        studnet[i][2] = studnet[i+1][2];
                    }
                    counter--;
                    
                    break;
                default:
                    do_end = true;
                    break;
                    
            }
            
        }while(!do_end);
        
        
    }
    
}
