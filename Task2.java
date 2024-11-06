/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zeelgajjarpricecalculator;
import java.util.*;

/**
 *
 * @author 2474008
 */
public class ZeelGajjarPriceCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner UserInfo = new Scanner(System.in);
        
        //Asking and getting user info
        System.out.print("Please enter the item price: " );
        float itemPrice = UserInfo.nextFloat();


        System.out.print("Please enter the discount ratio (5 for 5%): ");
        float discount = UserInfo.nextFloat();

        System.out.println("\n");


        //Printing the results
        System.out.printf("Original Price %9s %.2f \n", ":", itemPrice);

        System.out.printf("Discount ratio %9s %.2f%% \n", ":" , discount);

        //Calculate the price before tax
        float priceBeforeTax = itemPrice - (itemPrice * discount/100);

        System.out.printf("Price Before Tax: %6.6s %.2f \n", ":", priceBeforeTax);


        System.out.println("---------------------------------------");

        
        //Calculating federal and provincial tax
        double fedTax = priceBeforeTax * 0.05;
        System.out.printf("Federal Tax: %11s %.2f \n", ":", fedTax);

        double provTax = priceBeforeTax * (9.975 / 100); 
        System.out.printf("Provincial Tax: %8s %.2f \n", ":", provTax);

        //Calculating total price
        System.out.printf("Final Price: %11s %.2f", ":", priceBeforeTax + fedTax + provTax);

    }
    
}
