/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zeelgajjarbalancecalculator;
import java.util.*;
/**
 *
 * @author 2474008
 */
public class ZeelGajjarBalanceCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner UserInfo= new Scanner(System.in); 

        //Asking and getting user info
        System.out.print("Please enter the intial balance: " );
        double intialBalance = UserInfo.nextDouble();

        System.out.print("Please enter the annual interest rate (2 for 2%): ");
        double interestRate = UserInfo.nextDouble();

        System.out.print("Please enter the number of years the client wants to save the money in the bank: ");
        double numOfYears = UserInfo.nextDouble();

        System.out.println("\n");


        //Printing the information recieved
        System.out.printf("Initial Balance %7s %5.2f \n", ":", intialBalance); 

        System.out.printf("Annual Interest Rate %2s %7.2f%% \n", ":" , interestRate); 

        System.out.printf("Saving Years %10s %8.0f \n", ":" , numOfYears); 

        System.out.println("-------------------------------");

        //Calculating the balance after certain number of years
        double balanceAfterYr = intialBalance * Math.pow(1+(interestRate/100), numOfYears);
        
        //Printing the final result
        System.out.printf("Balance After %.0f Years %1s %2.2f \n", numOfYears, ":", balanceAfterYr);
    
    }
    
}
 
