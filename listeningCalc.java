/*
Jay Singh
**/

// Listening - Academic Discussion ESL ACCUPLAC Listening

import java.util.Scanner;

public class listeningCalc
{                                      
   public static void main(String[] args) 
   {                                     
      Scanner KB = new Scanner(System.in);
      
      int lScore, // Listening Score 
          runAgain = 1;
      
      while(runAgain == 1)
      {

         // Initialize
         System.out.printf("\nInput Listening Score: ");
         lScore = KB.nextInt();
         while (lScore < 20 || lScore > 120) // input validation
         {
            System.out.printf("Sorry, the listening score must be between 20 and 120.\n");
            System.out.printf("Input Listening Score: ");
            lScore = KB.nextInt();
         }       
                                
         // Output 
                                  
         // Listening Score = 20-40
            if (lScore >= 20 && lScore <= 40)
            {
               System.out.println("\nCourse(s) Placed Into: ESL-060"); 
            }
               // Listening Score = 41-65
               if (lScore >= 41 && lScore <= 65)
               {
                  System.out.println("\nCourse(s): ESL-061");
               }
   
               // Listening Score = 66-75
                  if (lScore >= 66 && lScore <= 75)
                  {
                     System.out.println("\nCourse(s): ESL-062");
                  }
                     
                  // Listening Score = 76-85
                     if (lScore >= 76 && lScore <= 85)
                     {
                        System.out.println("\nCourse(s): ESL-063");
                     }
                        
                     // Listening Score = 86-120
                        if (lScore >= 86 && lScore <= 120)
                        {
                           System.out.println("\nCourse(s): ENG-112 OR PSY-101-LC");
                        }
                             
         // Test Output
         // System.out.println("\n\n\n\n\n\nNGR IS: " + NGR);    
         System.out.println("\n- If students place into a split level (e.g. Level 4 for Writing and Level 3 for Grammar, the placement will default to the lower level).\n- If students place one levels apart (e.g. Level 1 for Writing and Level 3 for Grammar, they may retest for those sections).\n- If a student is in Level 0 and part-time, start with Reading & Discussion.\n- ESL Enrichment (Exit Test Prep Sessions) available in June or January (Contact Tutorial Services).");     
         System.out.printf("\nPress [1] to run again, press [0] to exit: ");
         runAgain = KB.nextInt();
      }
      
      KB.close(); // close input stream
   }    
}

