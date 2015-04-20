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
    
    int endIndex = 0; //for later calculation
    
    for (int i = 0; i < 4000; i++){
        if ( dataStream.hasNextInt()){
        int day2 = dataStream.nextInt();
        double hsi2 = dataStream.nextDouble();
        day [i] = day2;
        hsi [i] = hsi2;
        } else {
            endIndex = (i-1); //saving the endDate
            break; // finish reading all available record
        }            
    }
    
    //ask User input startDate
    System.out.print("Start Date (YYYYMMDD): ");
    Scanner userInput = new Scanner (System.in);
    int startDate = userInput.nextInt();
    
    //locate the array number of the Start Date
    int j = 0;
    while (day[j] != startDate && j <= endIndex){
        j++;
    }
    int startIndex = j;
    
//Calculate number of record between startIndex and endIndex for array size
    int recordNum = endIndex - startIndex + 1;
    
    // if recordNum equals to 1, then there's no need for any calculation at all
    if (recordNum == 1){
    System.out.println("HSI from " + startDate + " to " + day[endIndex]);
    System.out.println("Number of record: " + recordNum);
    System.out.println("Max: " + hsi[startIndex]);
    System.out.println("Min: " + hsi[startIndex]);
    System.out.println("Average: " + hsi[startIndex]);
    System.out.println("Median: " + hsi[startIndex]);
    return;
    }
    
    //Build new array specific to User's request
    double[] userArray = new double[recordNum];
    
    //Store relevant values into new array
    int cnt = startIndex;
    for (int i = 0; i < recordNum; i++){
        userArray[i] = hsi[cnt];
        cnt++;
    }
        
    // use sorter class to sort the userArray to userHsi
    Sorter Sort = new Sorter();
    double[] userHsi = Sort.selectionSort(userArray, recordNum);
    
        
    //use calculator to calculate and print all required results
    Calculator cal = new Calculator();
    System.out.println("HSI from " + day[startIndex] + " to " + day[endIndex]);
    System.out.println("Number of records: " + recordNum);
    System.out.println("Max: " + cal.maxCal(userArray, recordNum));
    System.out.println("Min: " + cal.minCal(userArray));
    System.out.println("Average: " + cal.avgCal(userArray, recordNum));
    System.out.println("Median: " + cal.medianCal(userArray, recordNum));
    
    
    }catch (FileNotFoundException e){
        System.out.println("File cannot be opened");
    }catch (IOException e){
        System.out.println("I/O error! Program exit.");
    }   
    
    }
    
}
