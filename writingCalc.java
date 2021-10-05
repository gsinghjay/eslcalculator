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
      
      int wScore,
          runAgain = 1;
          
      int[] wLevel = {0,1,2,3,4};
      
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
         System.out.println("\nCourse: ESL-02" + wLevel[wScore]);
                             
         // Test Output
         // System.out.println("\n\n\n\n\n\nNGR IS: " + NGR);
         System.out.println("\n- If students place into a split level (e.g. Level 4 for Writing and Level 3 for Grammar, the placement will default to the lower level).\n- If students place one levels apart (e.g. Level 1 for Writing and Level 3 for Grammar, they may retest for those sections).\n- If a student is in Level 0 and part-time, start with Reading & Discussion.\n- ESL Enrichment (Exit Test Prep Sessions) available in June or January (Contact Tutorial Services)."); 
         System.out.printf("\nPress [1] to run again, press [0] to exit: ");
         runAgain = KB.nextInt();
      }
      
      KB.close(); // close input stream
   }    
}

