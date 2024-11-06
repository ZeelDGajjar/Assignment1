/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zeelgajjarpersonalinfo;
import java.util.*;


/**
 *
 * @author 2474008
 */
public class ZeelGajjarPersonalInfo {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner UserInfo= new Scanner(System.in);


        //Asking and getting user info
        System.out.print("Please enter your name: " );
        String name = UserInfo.nextLine();


        System.out.print("Please enter you age: ");
        int age = UserInfo.nextInt();
        UserInfo.nextLine();
        
        System.out.print("Please enter your gender: ");
        String gender = UserInfo.nextLine();


        System.out.print("Please enter your department: ");
        String department = UserInfo.nextLine();


        System.out.print("Please enter the value of PI (3.1415926): ");
        float pi = UserInfo.nextFloat();


        
        System.out.println("\n");


        
        //Printing the results
        System.out.printf("Name %12s %1s \n", ":", name);


        System.out.printf("Age %13s %1s \n", ":" , age);


        System.out.printf("Gender %10s %1s \n", ":" , gender);


        System.out.printf("Department %6s %1s \n", ":" , department);


        System.out.printf("PI %14s %.2f \n", ":" , pi);


    }
    
}
