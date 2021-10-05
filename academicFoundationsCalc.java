/*
Jay Singh
**/

// Academic Foundations Placement Test Scores

import java.util.Scanner;

public class academicFoundationsCalc
{                                      
   public static void main(String[] args) 
   {                                     
      Scanner KB = new Scanner(System.in);
      
      // Initialize
      int NGR, // Next Gen Reading variable for input
          essayScore,
          runAgain = 1;
      
      while(runAgain == 1)
      {
	      System.out.printf("\nInput Essay Score: ");
	      essayScore = KB.nextInt();
	      while (essayScore < 0 || essayScore > 8) // input validation
	      {
	         System.out.printf("Sorry, the essay score must be between 0 and 8.\n");
	         System.out.printf("Input Essay Score: ");
	         essayScore = KB.nextInt();
	      }  
	      
	      System.out.printf("Input NGR Score: ");
	      NGR = KB.nextInt();
	      while (NGR < 0) // input validation
	      {
	         System.out.printf("Sorry, the Next Gen Reading score must be greater than 0.\n");
	         System.out.printf("Input NGR Score: ");
	         NGR = KB.nextInt();
	      }
	                                        
	      // Output
	                                 
	         // Essay Score = 1-2
	         if (essayScore <= 2)
	         {   
	            if (NGR >= 255) // ENG + RDG 071
	            {
	               System.out.println("\nCourse(s) Placed Into:\nENG-071 + RDG-071\n");
	               System.out.println("Up to two (2) college courses from the following list:");
	               System.out.println("ENG-112\nCSS-100\nART-101\nCAI-114\nCAI-118\nCAI-119\nMAT: Any eligible course.");
	            }
	            else if (NGR < 255) // ENG + RDG 071
	            {
	               System.out.println("\nCourse(s) Placed Into:\nENG-071 + RDG-071\n");
	               System.out.println("Up to two (2) college courses from the following list:");
	               System.out.println("ENG-112\nCSS-100\nART-101\nCAI-114\nCAI-118\nCAI-119\nMAT: Any eligible course.");
	            }
	         }
	
	            // Essay Score = 3
	            if (essayScore == 3)
	            {
	               if (NGR >= 247) // ENG + RDG 072
	               {
	                  System.out.println("\nCourse(s) Placed Into:\nENG-072 + RDG-072\n");
	                  System.out.println("Up to two (2) college courses from the following list:");
	                  System.out.println("ENG-112\nCSS-100\nART-101\nASL-101\nMLA-101\nMLF-101\nMLS-101\nMLS-111\nART-103\nART-106\nART-107\nARC-107\nARC-109\nCRJ-111\nCRJ-120\nCAI-All Course(s) except CAI-113\nMAT: Any eligible course.\nSCI-101\nCSC-100\nCSC-109\nECE-100");
	               }
	               else if (NGR <= 246) // ENG + RDG 071
	               {
	                  System.out.println("\nCourse(s) Placed Into:\nENG-071 + RDG-071\n");
	                  System.out.println("Up to two (2) college courses from the following list:");
	                  System.out.println("ENG-112\nCSS-100\nART-101\nCAI-114\nCAI-118\nCAI-119\nMAT: Any eligible course.");
	               }
	            }
	         
	               // Essay Score = 4
	               if (essayScore == 4) // ENG-073 + ENG-101 ALP
	               {
	                  if (NGR >= 247)
	                  {
	                     System.out.println("\nCourse(s) Placed Into:\nENG-073-ALP + ENG-101-ALP\n");
	                     System.out.println("Up to three (3) college courses from the following list:");
	                     System.out.println("ENG-112\nCSS-100\nART-101\nASL-101\nMLA-101\nMLF-101\nMLS-101\nMLS-111\nART-103\nART-106\nART-107\nARC-107\nARC-109\nART-113\nART-114\nCRJ-111\nCRJ-120\nCRJ-214\nCAI: All courses\nMAN-121\nMAT: Any eligible course.\nSCI-101\nCHP-100\nSOC-101\nCSC-100\nCSC-109\nECE-100\nECE-110\nECE-120\nPSY-101");
	                  }
	                  else if (NGR <= 246) // ENG + RDG 072
	                  {
	                     System.out.println("\nCourse(s) Placed Into:\nENG-072 + RDG-072\n");
	                     System.out.println("Up to two (2) college courses from the following list:");
	                     System.out.println("ENG-112\nCSS-100\nART-101\nASL-101\nMLA-101\nMLF-101\nMLS-101\nMLS-111\nART-103\nART-106\nART-107\nARC-107\nARC-109\nCRJ-111\nCRJ-120\nCAI-All Course(s) except CAI-113\nMAT: Any eligible course.\nSCI-101\nCSC-100\nCSC-109\nECE-100");
	                  }
	               }
	         
	                  // Essay Score = 5
	                  if (essayScore == 5)
	                  {
	                     if (NGR >= 255) // ENG 096 + ENG 101 or ENG 101-ALP
	                     {
	                        System.out.println("\nCourse(s) Placed Into:\nENG-096 + ENG-101 or ENG-101-AL\n");
	                     }
	                     else if (NGR <= 254)
	                     {
	                        System.out.println("\nCourse(s) Placed Into:\nENG-073-ALP + ENG-101-ALP\n");
	                        System.out.println("Up to three (3) college courses from the following list:");
	                        System.out.println("ENG-112\nCSS-100\nART-101\nASL-101\nMLA-101\nMLF-101\nMLS-101\nMLS-111\nART-103\nART-106\nART-107\nARC-107\nARC-109\nART-113\nART-114\nCRJ-111\nCRJ-120\nCRJ-214\nCAI: All courses\nMAN-121\nMAT: Any eligible course.\nSCI-101\nCHP-100\nSOC-101\nCSC-100\nCSC-109\nECE-100\nECE-110\nECE-120\nPSY-101");
	                     }
	                  }
	         
	                     // Essay Score = 6
	                     if (essayScore == 6)
	                     {
	                        if (NGR >= 255)
	                           System.out.println("\nCourse Placed Into:\nENG-101");
	                        if (NGR <= 254)
	                           System.out.println("\nCourse(s) Placed Into:\nENG-096 + ENG-101 or ENG-101-AL\n");
	                     }
	         
	                        // Essay Score = 7-8
	                        if (essayScore == 7 || essayScore == 8)
	                        {
	                           if (NGR >= 246)
	                              System.out.println("ENG-101 - Students who score a 7+ will be exempt from taking the Next Gen Reading.");
	                        } 
	                     
	      // Test Output
	      // System.out.println("\n\n\n\n\n\nNGR IS: " + NGR);
	    System.out.printf("\nPress [1] to run again, press [0] to exit: ");
	    runAgain = KB.nextInt();
       	    
      }
         
     KB.close(); // close input stream
   }    
}

