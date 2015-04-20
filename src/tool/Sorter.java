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
public class Sorter {
    
    // This objects uses selection sort to sort an array
    
    // Selection sort method
    public double[] selectionSort (double [] inputArray, int arraySize){
        double [] userArray = new double[arraySize];
        userArray = inputArray;
        int round, pt,   size = arraySize;
        
        for (round = 0; round < (size - 1); round++){
            
            for (pt = (round + 1); pt < size; pt++){
                
                if (userArray[pt] < userArray[round]){
                    double temp = userArray[pt]; 
                    userArray[pt] = userArray[round];
                    userArray[round] = temp;
                }
                    
                
            }
            
        }
        
        return userArray;
    }
    
    
}
