/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermparta;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class MidtermPartA {

    /**
     * @param args the command line arguments
     */
    public double price;
    public static String [] candies = {"chocolate bar", "sour candy", "soft drink", "potato chips"};
    public MidtermPartA()
    {
        //intentionally left blank
    }
    
    /**
     * A getter method to return the item's price
     * @return the cost of the item
     */
    public double getPrice()
    {
        return price;
    }
    
    /**
     * A setter for the price, allowing us to change the price of an item
     * @param givenPrice 
     */
    public void setPrice(double givenPrice)
    {
        price = givenPrice;
    }
    
    /**
     * A method to ask the user to select am item from the vending machine.
     * @param args - not used
     */
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the vendin machine, here is a list of the possible candies");
        for(int i=0; i<candies.length; i++)
        {
            System.out.println(candies[i]);
        }
        System.out.println("To re-fill the vending machine, please follow instructions in program 2");
         System.out.println("Kiran");
      
        // TODO code application logic here
    }
    
}
