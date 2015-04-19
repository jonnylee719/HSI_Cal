/**
 * CSCI1530 Java Programming Assignment
 *
 * --- Declaration ---
 *
 * I declare that the assignment here submitted is original except for source
 * material explicitly acknowledged. I also acknowledge that I am aware of
 * University policy and regulations on honesty in academic work, and of the
 * disciplinary guidelines and procedures applicable to breaches of such policy
 * and regulations, as contained in the website
 *
 *     http://www.cuhk.edu.hk/policy/academichonesty/
 *
 * Assignment 6
 * Student Name : Lee Wai Lam Jonathan
 * Student ID   : 1155017574
 * Email Address: s1155017574@cuhk.edu.hk
 

 * Date    : 14/04/2015
 */
package tool;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class HSI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
    try {
    //declare a String variable to store the url
    String addr ="http://www.cse.cuhk.edu.hk/csci1530/assignment/HSI.txt";
    
    //New a URL object
    URL link = new URL(addr);
    
    //Associate the scanner object to stream object
    Scanner dataStream = new Scanner(link.openStream());
    
    //Read a whole line
    String line1 = dataStream.nextLine();
    String line2 = dataStream.nextLine();
    int[] day = new int[4000]; //declare & initialize new array for dates
    double [] hsi = new double [4000];
    if ( dataStream.hasNextInt()){
        int day2 = dataStream.nextInt();
        double hsi2 = dataStream.nextDouble();
    }
    
    for (int i = 0; i < 4000; i++){
        System.out.print( day[i] );
        System.out.println(hsi);
    }
    
    
    
    
    }catch (FileNotFoundException e){
        System.out.println("File cannot be opened");
    }catch (IOException e){
        System.out.println("I/O error! Program exit.");
    }   
    
    }
    
}
