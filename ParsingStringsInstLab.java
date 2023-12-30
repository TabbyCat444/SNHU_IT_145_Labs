// COLLECT PAIRS OF CSVS FROM USER AND PARSE INTO INDIVIDUAL WORDS UNTIL USER QUITS //

import java.util.Scanner;

public class ParseStrings {
   public static void main(String[] args) {
      //initialize scanner and variables
      Scanner scanner = new Scanner(System.in);
      String userInput;
      String firstWord;
      String secondWord;
      String noSpace;
      
      //Prompt user for string and receive input
         System.out.println("Enter input string: ");
         userInput = scanner.nextLine();
      
      //main loop
      while (userInput != "q") {
         
         //input validation for comma
         while (userInput.indexOf(",") == -1) {
            System.out.println("Error: No comma in string");
            System.out.println("Enter input string: ");
            userInput = scanner.nextLine();  //I don't understand the exception thrown here?
         }
      
         //split and print individual words
         while (userInput.indexOf(",") != -1) {
            //remove spaces
            noSpace = userInput.replace(" ","");
            //split string into words at commas, add to list
            String[] words = noSpace.split(",");
            //assign appropriate list indexes to variables
            firstWord = words[0];
            secondWord = words[1];
            //output
            System.out.println("First word: " + firstWord);
            System.out.println("Second word: " + secondWord);
            System.out.print("\n\n");
            //prompt for next input
            System.out.println("Enter input string: ");
            userInput = scanner.nextLine();
         }
         //stops "q" from being ran through the comma verification
         //I originally assumed it would break automatically, but it didn't?
         break;
      }
      
      return;
   }
}
