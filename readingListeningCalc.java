/*
Jay Singh
**/

// Reading - ESL ACCUPLAC Reading Skills

import java.util.Scanner;

public class readingListeningCalc
{                                      
   public static void main(String[] args) 
   {                                     
      Scanner KB = new Scanner(System.in);
      
      // Initialize
      int rScore,          // Reading Score 
          lScore,          // Listening Score
          rLevel = 5,      // Reading Level
          lLevel = 5,      // Reading Score
          runAgain = 1,
          adjustedReading,
          adjustedListening;
          
      int[] rLevels = {0,1,2,3,4};
      int[] lLevels = {0,1,2,3,4};
      
      while(runAgain == 1)
      {
         System.out.printf("\nInput Reading Score: ");
         rScore = KB.nextInt();
         while (rScore < 20 || rScore > 120) // input validation
         {
            System.out.printf("Sorry, the reading score must be between 20 and 120.\n");
            System.out.printf("Input Reading Score: ");
            rScore = KB.nextInt();
         }
         
         System.out.printf("Input Listening Score: ");
         lScore = KB.nextInt();
         while (lScore < 20 || lScore > 120) // input validation
         {
            System.out.printf("Sorry, the listening score must be between 20 and 120.\n");
            System.out.printf("Input Listening Score: ");
            lScore = KB.nextInt();
         }        
                                
         // Output 
                                  
         // Reading Score = 20-40
         if (rScore >= 20 && rScore <= 40)
         {
            rLevel = 0;
            System.out.println("\nReading Course(s) Placed Into: ESL-04" + rLevels[rLevel] + " + ESL-06" + rLevels[rLevel]);
         }
            // Reading Score = 41-60
            else if (rScore >= 41 && rScore <= 60)
            {
               rLevel = 1;
               System.out.println("\nReading Course(s) Placed Into: ESL-04" + rLevels[rLevel] + " + ESL-06" + rLevels[rLevel]);
            }

            // Reading Score = 61-80
               else if (rScore >= 61 && rScore <= 80)
               {
                  rLevel = 2;
                  System.out.println("\nReading Course(s) Placed Into: ESL-04" + rLevels[rLevel] + " + ESL-06" + rLevels[rLevel]);
                  System.out.println("Up to one (1) college course(s) from the following list:");
                  System.out.println("ART-101\n*Any MAT course the student is eligible for.\nCSC-100\nCDP-100");     
               }
                  
               // Reading Score = 81-95
                  else if (rScore >= 81 && rScore <= 95)
                  {
                     rLevel = 3;
                     System.out.println("\nReading Course(s) Placed Into: ESL-04" + rLevels[rLevel] + " + ESL-06" + rLevels[rLevel]);
                     System.out.println("Up to two (2) college courses from the following list:");
                     System.out.println("ART-101\nASL-101\nART-103\nART-106\nART-107\n*Any MAT course the student is eligible for.\nCSC-100\nCSC-109\nCSS-100\nENG-112\nPSY-101");
                  }
                     
                  // Reading Score = 96-120
                     else if (rScore >= 96 && rScore <= 120)
                     {
                        rLevel = 4;
                        System.out.println("\nReading Course(s) Placed Into: ESL-04" + rLevels[rLevel] + " + ESL-06" + rLevels[rLevel]);
                        System.out.println("Up to two (2) college courses from the following list:");
                        System.out.println("ART-101\nASL-101\nMLF-101\nMLS-101\nMLS-111\nACC-121\nACC-221\nART-103\nART-106\nART-107\n*ARC 100 level courses.\nART-113\nART-114\nBIO-201\nCRJ-111\n*Any CAI course.\nHLT-103\nHLT-115\nMDA-106\nMAN-121\nMAN-221\n*Any MAT course the student is eligible for.\nBIO-107\nCHP-100\nCSC-100\nCSC-109\nCSS-100\nENG-112\nPSY-101");
                     }
                                              
            // Listening Score = 20-40
            if (lScore >= 20 && lScore <= 40)
            {
               lLevel = 0;
               System.out.println("\nListening Course(s) Placed Into: ESL-06" + lLevels[lLevel]); 
            }
               // Listening Score = 41-65
               else if (lScore >= 41 && lScore <= 65)
               {
                  lLevel = 1;
                  System.out.println("\nListening Course(s) Placed Into: ESL-06" + lLevels[lLevel]); 
               }
   
                  // Listening Score = 66-75
                  else if (lScore >= 66 && lScore <= 75)
                  {
                     lLevel = 2;
                     System.out.println("\nListening Course(s) Placed Into: ESL-06" + lLevels[lLevel]); 
                  }
                     
                     // Listening Score = 76-85
                     else if (lScore >= 76 && lScore <= 85)
                     {
                        lLevel = 3;
                        System.out.println("\nListening Course(s) Placed Into: ESL-06" + lLevels[lLevel]); 
                     }
                        
                        // Listening Score = 86-120
                        else if (lScore >= 86 && lScore <= 120)
                        {
                           lLevel = 4;
                           System.out.println("\nListening Course(s) Placed Into: ENG-112 OR PSY-101-LC");
                        }
                        
         
         // If Reading Level is higher than Listening Level
         if (rLevels[rLevel] > lLevels[lLevel])
         {
            // Test Outputs
            // System.out.println ("Reading Level Before: " + rLevels[rLevel]);
            adjustedReading = rLevels[rLevel] - lLevels[lLevel]; 
            rLevels[rLevel] = lLevels[lLevel];
            // System.out.println ("Reading Level After: " + rLevels[rLevel]);
            
            // Final Ouput
            System.out.println("\nFinal Placement (writing level adjusted by -" + adjustedReading + "):");
            System.out.println("*Students may retest to get placed into the higher section."); 
            
            System.out.println("\n*Reading Course(s) Placed Into: ESL-04" + rLevels[rLevel]);           
            System.out.println("Listening Course(s) Placed Into: ESL-06" + lLevels[lLevel]);
            
            if (rLevels[rLevel] == 2)
            {
               System.out.println("Up to one (1) college course(s) from the following list:");
               System.out.println("ART-101\n*Any MAT course the student is eligible for.\nCSC-100\nCDP-100");
            }
               if (rLevels[rLevel] == 3)
               {
                  System.out.println("Up to two (2) college courses from the following list:");
                  System.out.println("ART-101\nASL-101\nART-103\nART-106\nART-107\n*Any MAT course the student is eligible for.\nCSC-100\nCSC-109\nCSS-100\nENG-112\nPSY-101");
               }      
                  if (rLevels[rLevel] == 4)
                  {
                     System.out.println("Up to two (2) college courses from the following list:");
                     System.out.println("ART-101\nASL-101\nMLF-101\nMLS-101\nMLS-111\nACC-121\nACC-221\nART-103\nART-106\nART-107\n*ARC 100 level courses.\nART-113\nART-114\nBIO-201\nCRJ-111\n*Any CAI course.\nHLT-103\nHLT-115\nMDA-106\nMAN-121\nMAN-221\n*Any MAT course the student is eligible for.\nBIO-107\nCHP-100\nCSC-100\nCSC-109\nCSS-100\nENG-112\nPSY-101");
                  }  
 
         }
         
         // If Listening Level is higher than Reading Level
         else if (rLevels[rLevel] < lLevels[lLevel])
         {
            // Test Outputs
            // System.out.println ("Listening Level Before: " + lLevels[lLevel]);
            adjustedListening = lLevels[lLevel] - rLevels[rLevel]; 
            lLevels[lLevel] = rLevels[rLevel];
            // System.out.println ("Listening Level After: " + lLevels[lLevel]); **/
            
            // Final Ouput
            System.out.println("\nFinal Placement (grammar level adjusted by -" + adjustedListening + "):");
            System.out.println("*Students may retest to get placed into the higher section."); 
            
            System.out.println("\nReading Course(s) Placed Into: ESL-04" + rLevels[rLevel]);             
            System.out.println("*Listening Course(s) Placed Into: ESL-06" + lLevels[lLevel]);   
         }
         
         System.out.println("\nReading Level = " + rLevels[rLevel] + "\nListening Level = " + lLevels[lLevel]);

                
         /* Test Output
         System.out.println("\n\n\n\n\n\nNGR IS: " + NGR);
         System.out.println("\n- If students place into a split level (e.g. Level 4 for Reading and Level 3 for Listening, the placement will default to the lower level).\n- If students place one levels apart (e.g. Level 1 for Reading and Level 3 for Listening, they may retest for those sections).\n- If a student is in Level 0 and part-time, start with Reading & Discussion.\n- ESL Enrichment (Exit Test Prep Sessions) available in June or January (Contact Tutorial Services).");
         **/ 
         System.out.printf("\nPress [1] to run again, press [0] to exit: ");
         runAgain = KB.nextInt();
      }
      
      KB.close(); // close input stream
   } 
}

/*


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
         System.out.println("\n- If students place into a split level (e.g. Level 4 for Reading and Level 3 for Listening, the placement will default to the lower level).\n- If students place one levels apart (e.g. Level 1 for Reading and Level 3 for Listening, they may retest for those sections).\n- If a student is in Level 0 and part-time, start with Reading & Discussion.\n- ESL Enrichment (Exit Test Prep Sessions) available in June or January (Contact Tutorial Services).");     
         System.out.printf("\nPress [1] to run again, press [0] to exit: ");
         runAgain = KB.nextInt();
      }
      
      KB.close(); // close input stream
   }    
}

**/



