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
              
      int[] gLevel = {0,1,2,3,4};
      
      
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
               System.out.println("\nCourse(s) Placed Into: ESL-03" + gLevel[0]);
            }
   
            // Grammar Score = 41-60
               else if (gScore >= 41 && gScore <= 60)
               {
                  System.out.println("\nCourse(s) Placed Into: ESL-03" + gLevel[1]);
               }
                  
               // Grammar Score = 61-80
                  else if (gScore >= 61 && gScore <= 80)
                  {
                     System.out.println("\nCourse(s) Placed Into: ESL-03" + gLevel[2]);
                  }
                     
                  // Grammar Score = 81-100
                     else if (gScore >= 81 && gScore <= 100)
                     {
                        System.out.println("\nCourse(s) Placed Into: ESL-03" + gLevel[3]);
                     }
                        
                     // Grammar Score = 101-120
                        else if (gScore >= 101 && gScore <= 120)
                        {
                           System.out.println("\nCourse(s) Placed Into: ESL-03" + gLevel[4]);
                        }
                                         
         // Test Output
         // System.out.println("\n\n\n\n\n\nNGR IS: " + NGR);
         System.out.println("\n- If students place into a split level (e.g. Level 4 for Writing and Level 3 for Grammar, the placement will default to the lower level).\n- If students place one levels apart (e.g. Level 1 for Writing and Level 3 for Grammar, they may retest for those sections).\n- If a student is in Level 0 and part-time, start with Reading & Discussion.\n- ESL Enrichment (Exit Test Prep Sessions) available in June or January (Contact Tutorial Services)."); 
         System.out.printf("\nPress [1] to run again, press [0] to exit: ");
         runAgain = KB.nextInt();	
      }
      
      KB.close(); // close input stream
   } 
   
   public static void welcomeMessage()
   {
      System.out.printf("Test Message");
   }
      
}

