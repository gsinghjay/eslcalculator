/*
Jay Singh
**/

// Reading - ESL ACCUPLAC Reading Skills

import java.util.Scanner;

public class readingCalc
{                                      
   public static void main(String[] args) 
   {                                     
      Scanner KB = new Scanner(System.in);
      
      // Initialize
      int rScore, // Reading Score 
          runAgain = 1;
      
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
                                
         // Output 
                                  
         // Reading Score = 20-40
            if (rScore >= 20 && rScore <= 40)
            {
               System.out.println("Course(s) Placed Into: ESL-040 + ESL-060");
            }
               // Reading Score = 41-60
               if (rScore >= 41 && rScore <= 60)
               {
                  System.out.println("Course(s) Placed Into: ESL-041 + ESL-061");
               }
   
               // Reading Score = 61-80
                  if (rScore >= 61 && rScore <= 80)
                  {
                     System.out.println("\nCourse(s) Placed Into: ESL-042 + ESL-062\n");
                     System.out.println("Up to one (1) college course(s) from the following list:");
                     System.out.println("ART-101\n*Any MAT course the student is eligible for.\nCSC-100\nCDP-100");     
                  }
                     
                  // Reading Score = 81-95
                     if (rScore >= 81 && rScore <= 95)
                     {
                        System.out.println("\nCourse(s) Placed Into: ESL-043 + ESL-063\n");
                        System.out.println("Up to two (2) college courses from the following list:");
                        System.out.println("*See courses that require a learning community.\nART-101\nASL-101\nART-103\nART-106\nART-107\n*Any MAT course the student is eligible for.\nCSC-100\nCSC-109\nCSS-100\nENG-112\nPSY-101");
                     }
                        
                     // Reading Score = 96-120
                        if (rScore >= 96 && rScore <= 120)
                        {
                           System.out.println("\nCourse(s) Placed Into: ESL-044\n");
                           System.out.println("Up to two (2) college courses from the following list:");
                           System.out.println("*See courses that require a learning community.\nART-101\nASL-101\nMLF-101\nMLS-101\nMLS-111\nACC-121\nACC-221\nART-103\nART-106\nART-107\n*ARC 100 level courses.\nART-113\nART-114\nBIO-201\nCRJ-111\n*Any CAI course.\nHLT-103\nHLT-115\nMDA-106\nMAN-121\nMAN-221\n*Any MAT course the student is eligible for.\nBIO-107\nCHP-100\nCSC-100\nCSC-109\nCSS-100\nENG-112\nPSY-101");
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

