// Jay Singh


/* Paired Section Program - Writing and Grammar Calculator

- If students place into a split level (e.g. Level 4 for Writing and level 3 for Grammar, the placement with default to the lower level).
- If students place one levels apart (e.g. Level 1 for Writing and Level 3 for Grammar, they may retest for those sections).
- If a student is in Level 0 and part-time, start with Reading & Discussion
- ESL Enrichment (Exit Test Prep Sessions) available in June or Janary (contact Tutorial Services). 

**/

import java.util.Scanner;

public class writingGrammarCalc
{                                      
   public static void main(String[] args) 
   {                                     
      Scanner KB = new Scanner(System.in);
      
      // Initialize
      
      int wScore,          // Writing Score
          gScore,          // Grammar Score 
          runAgain = 1,
          gLevel = 5,      // Grammar Level 
          adjustedWriting,
          adjustedGrammar;
         
      int[] gLevels = {0,1,2,3,4};
      int[] wLevels = {0,1,2,3,4};
      
      
      while(runAgain == 1)
      {      
         // Input 
         
         // Writing
         System.out.printf("\nInput Writing Score: "); // input validation for writing score between 0 and 4
         wScore = KB.nextInt();
            while (wScore < 0 || wScore > 4) // input validation
            {
               System.out.printf("Sorry, the writing score must be between 0 and 4.\n");
               System.out.printf("Input Writing Score: ");
               wScore = KB.nextInt();
            } 
         
         // Grammar
         System.out.printf("Input Grammar Score: ");
         gScore = KB.nextInt();
            while (gScore < 20 || gScore > 120) // input validation for grammar score between 20 and 120
            {
               System.out.printf("Sorry, the grammar score must be between 20 and 120.\n");
               System.out.printf("Input Grammar Score: ");
               gScore = KB.nextInt();
            }     
                                                               
         // Output                       
         System.out.println("\nWriting Course(s) Placed Into: ESL-02" + wLevels[wScore]);
                                  
         // Grammar Score = 20-40
         if (gScore >= 20 && gScore <= 40)
         {
            gLevel = 0;
            System.out.println("Grammar Course(s) Placed Into: ESL-03" + gLevels[gLevel]);
         }
   
         // Grammar Score = 41-60
         else if (gScore >= 41 && gScore <= 60)
         {
            gLevel = 1;
            System.out.println("Grammar Course(s) Placed Into: ESL-03" + gLevels[gLevel]);
         }
               
         // Grammar Score = 61-80
         else if (gScore >= 61 && gScore <= 80)
         {
            gLevel = 2;
            System.out.println("Grammar Course(s) Placed Into: ESL-03" + gLevels[gLevel]);
         }
                  
         // Grammar Score = 81-100
         else if (gScore >= 81 && gScore <= 100)
         {
            gLevel = 3;
            System.out.println("Grammar Course(s) Placed Into: ESL-03" + gLevels[gLevel]);
         }
                     
         // Grammar Score = 101-120
         else if (gScore >= 101 && gScore <= 120)
         {
            gLevel = 4;
            System.out.println("Grammar Course(s) Placed Into: ESL-03" + gLevels[gLevel]);
         }
         
         // System.out.println("\nGrammar Level = " + gLevels[gLevel] + "\nWriting Level = " + wLevels[wScore]);
         
         // If Writing Level is higher than Grammar Level
         if (wLevels[wScore] > gLevels[gLevel])
         {
            // Test Outputs
            // System.out.println ("Writing Level Before: " + wLevels[wScore]);
            adjustedWriting = wLevels[wScore] - gLevels[gLevel]; 
            wLevels[wScore] = gLevels[gLevel];
            // System.out.println ("Writing Level After: " + wLevels[wScore]);
            
            // Final Ouput
            System.out.println("\nFinal Placement (writing level adjusted by -" + adjustedWriting + "):");
            System.out.println("*Students may retest to get placed into the higher section."); 
            
            System.out.println("\n*Writing Course(s) Placed Into: ESL-02" + wLevels[wScore]);           
            System.out.println("Grammar Course(s) Placed Into: ESL-03" + gLevels[gLevel]);
 
         }
         
         // If Grammar Level is higher than Writing Level
         else if (wLevels[wScore] < gLevels[gLevel])
         {
            // Test Outputs
            // System.out.println ("Grammar Level Before: " + gLevels[gLevel]);
            adjustedGrammar = gLevels[gLevel] - wLevels[wScore]; 
            gLevels[gLevel] = wLevels[wScore];
            // System.out.println ("Grammar Level After: " + gLevels[gLevel]); **/
            
            // Final Ouput
            System.out.println("\nFinal Placement (grammar level adjusted by -" + adjustedGrammar + "):");
            System.out.println("*Students may retest to get placed into the higher section."); 
            
            System.out.println("\nWriting Course(s) Placed Into: ESL-02" + wLevels[wScore]);             
            System.out.println("*Grammar Course(s) Placed Into: ESL-03" + gLevels[gLevel]);             
         }
         
         
         /*
         // If Writing Level is higher than Grammar Level
         if (wLevels[wScore] > gLevels[gLevel])
         {
            int wHigher = wLevels[wScore] - gLevels[gLevel];
            if (wHigher == 1)
            {
               System.out.println("Decrement Writing Level by 1 to match Grammar Level.");
               wLevels[wScore] = wLevels[wScore] - 1;
               System.out.println("\nGrammar Course(s) Placed Into: ESL-03" + gLevels[gLevel]);
               System.out.println("Writing Course(s) Placed Into: ESL-02" + wLevels[wScore]);
            }        
         }
         
         // If Grammar Level is higher than Writing Level
         if (gLevels[gLevel] > wLevels[wScore])
         {
            int gHigher = gLevels[gLevel] - wLevels[wScore];
            if (gHigher == 1)
            {
               System.out.println("Decrement Grammar Level by 1 to match Writing Level.");
               gLevels[gLevel] = gLevels[gLevel] - 1;
               System.out.println("\nGrammar Course(s) Placed Into: ESL-03" + gLevels[gLevel]);
               System.out.println("Writing Course(s) Placed Into: ESL-02" + wLevels[wScore]);           
            }        
         }
         */
         
         
                                         
         // Test Output
         // System.out.println("\n\n\n\n\n\nNGR IS: " + NGR);
         System.out.printf("\nPress [1] to run again, press [0] to exit: ");
         runAgain = KB.nextInt();
      }
      
      KB.close(); // close input stream
   } 
      
}


