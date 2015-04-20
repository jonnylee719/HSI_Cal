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

/**
 *
 * @author user
 */
public class Calculator {
    
    // Calculate min of a sorted double []
    public double minCal(double[] inputArray){
        double min = inputArray[0];
        return min;
    }
    
    // Calculate max of a sorted double []
    public double maxCal(double[] inputArray, int arraySize){
        double max = inputArray[arraySize - 1];
        return max;
    }
    
    // Calculate avg of a sorted double []
    public double avgCal(double[] inputArray, int arraySize){
        double avg = 0;
        double total = 0;
        for (int i = 0; i < arraySize; i++){
            total = total + inputArray[i];
        }
        avg = total / (double)arraySize;
        return avg;
    }
    
    // Calculate the median of a sorted double []
    public double medianCal (double [] inputArray, int arraySize){
        double median = 0;
        if ((arraySize)%2 == 0){ //check if the array size is even or not
            int temp = arraySize/2 - 1; //calculate the index number of the two median numbers
            median = (inputArray[temp] + inputArray[temp+1])/2;
        } else{
            median = inputArray[(arraySize / 2)];
        } 
        return median;
    }

    String minCal(double[] print, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
