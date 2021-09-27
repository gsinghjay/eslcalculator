/*
Jay Singh
**/

// Grammar - ESL ACCUPLAC Language Use

import java.util.Scanner;

public class grammarCalc
{                                      
   public static void main(String[] args) 
   {                                     
      Scanner KB = new Scanner(System.in);
      
      int gScore, // Grammar Score 
          runAgain = 1;
      
      while(runAgain == 1)
      {
         // Initialize
         System.out.printf("\nInput Grammar Score: ");
         gScore = KB.nextInt();
         while (gScore < 20 || gScore > 120) // input validation
         {
            System.out.printf("Sorry, the grammar score must be between 20 and 120.\n");
            System.out.printf("Input Grammar Score: ");
            gScore = KB.nextInt();
         }   
                                
         // Output 
                                  
         // Grammar Score = 20-40
            if (gScore >= 20 && gScore <= 40)
            {
               System.out.println("\nCourse(s) Placed Into: ESL-030");
            }
   
            // Grammar Score = 41-60
               else if (gScore >= 41 && gScore <= 60)
               {
                  System.out.println("\nCourse(s) Placed Into: ESL-031");
               }
                  
               // Grammar Score = 61-80
                  else if (gScore >= 61 && gScore <= 80)
                  {
                     System.out.println("\nCourse(s) Placed Into: ESL-032");
                  }
                     
                  // Grammar Score = 81-100
                     else if (gScore >= 81 && gScore <= 100)
                     {
                        System.out.println("\nCourse(s) Placed Into: ESL-033");
                     }
                        
                     // Grammar Score = 101-120
                        else if (gScore >= 101 && gScore <= 120)
                        {
                           System.out.println("\nCourse(s) Placed Into: ESL-034");
                        }
                                         
         // Test Output
         // System.out.println("\n\n\n\n\n\nNGR IS: " + NGR);
         System.out.printf("\nPress [1] to run again, press [0] to exit: ");
         runAgain = KB.nextInt();	
      }
      
      KB.close(); // close input stream
   }    
}

