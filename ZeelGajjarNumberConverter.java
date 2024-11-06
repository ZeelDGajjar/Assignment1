/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zeelgajjarnumberconverter;
import java.util.*;
/**
 *
 * @author 2474008
 */
public class ZeelGajjarNumberConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner UserInfo= new Scanner(System.in);

        //Asking and getting user info
        System.out.print("Please enter a 4-digits Octal number: " );
        String octalNo = UserInfo.nextLine();
        
        
        System.out.println("\n");
        
        
        //Calculating the decimal value
        int decimalValue =  Character.getNumericValue(octalNo.charAt(0)) * (int)Math.pow(8,3) + Character.getNumericValue(octalNo.charAt(1)) * (int)Math.pow(8,2) + Character.getNumericValue(octalNo.charAt(2)) * (int)Math.pow(8,1) + Character.getNumericValue(octalNo.charAt(3)) * (int)Math.pow(8,0);
        
        
        //Printing the results
        System.out.printf("Octal Number %5s %1s \n", ":", octalNo);

        System.out.printf("Decimal Number %3s %1d \n", ":", decimalValue);
        
       }
    
}
