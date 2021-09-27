/*
Jay Singh
**/

// Writing - ESL Essay Calculator

import java.util.Scanner;

public class writingCalc
{                                      
   public static void main(String[] args) 
   {                                     
      Scanner KB = new Scanner(System.in);
      
      int wScore, // Writing Score 
          runAgain = 1;
      
      while(runAgain == 1)
      {
      
         // Initialize
         System.out.printf("\nInput Writing Score: "); // input validation for writing score between 0 and 4
         wScore = KB.nextInt();
         while (wScore < 0 || wScore > 4) // input validation
         {
            System.out.printf("Sorry, the writing score must be between 0 and 4.\n");
            System.out.printf("Input Writing Score: ");
            wScore = KB.nextInt();
         }      
                                
         // Output                          
         System.out.println("\nCourse: ESL-02" + wScore);
                             
         // Test Output
         // System.out.println("\n\n\n\n\n\nNGR IS: " + NGR);
         System.out.printf("\nPress [1] to run again, press [0] to exit: ");
         runAgain = KB.nextInt();
      }
      
      KB.close(); // close input stream
   }    
}

