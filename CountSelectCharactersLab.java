// COUNT TEXT CHARACTERS FROM USER INPUT NOT INCLUDING SPACES, PERIODS, EXCLMATION POINTS, OR COMMAS //

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String userText;
      int count = 0;
   
      userText = scnr.nextLine();  // Gets entire line, including spaces. 

      for (int i = 0; i < userText.length(); i++) {
         if (Character.isLetter(userText.charAt(i)))
         count++;
      }
    
      for (int i = 0; i < userText.length(); i++) {
         if (userText.charAt(i) == '?')
         count++;
        }
      
      System.out.println(count);
   }
}
