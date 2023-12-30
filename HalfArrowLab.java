// DRAW A HALF ARROW FACING DOWNWARD WITH USER PROVIDED SPECS FOR WIDTH AND HEIGHT USING A LOOP //

import java.util.Scanner; 

public class DrawHalfArrow {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int arrowBaseHeight;
      int arrowBaseWidth;
      int arrowHeadWidth;
      
      System.out.println("Enter arrow base height:");
      arrowBaseHeight = scnr.nextInt();
      
      System.out.println("Enter arrow base width:");
      arrowBaseWidth = scnr.nextInt();
      
      System.out.println("Enter arrow head width:");
      arrowHeadWidth = scnr.nextInt();
      while (arrowHeadWidth <= arrowBaseWidth) {
         System.out.println("Enter arrow head width:");
         arrowHeadWidth = scnr.nextInt();
      }
      System.out.println();
      
      // Draw arrow base
      for (int h = 0; h < arrowBaseHeight; h++) {    // h for height
         for (int w = 0; w < arrowBaseWidth; w++) {  // w for width
            System.out.print("*");
         }
         System.out.println();
      }
      
      // Draw arrow head
      for (int ah = arrowHeadWidth; ah > 0; ah--) {   // ah for arrow head
         for (int hw = 0; hw < ah; hw++) {            // hw for head width
            System.out.print("*");
         }
         System.out.println();
      }
   }
}
