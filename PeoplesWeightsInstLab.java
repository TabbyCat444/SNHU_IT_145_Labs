// COLLECT WEIGHT OF FIVE PEOPLE AND PROVIDE THE TOTAL, AVERAGE, AND GREATEST WEIGHT PROVIDED //

import java.util.Scanner;

public class PeopleWeights {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double[] userWeight = new double[5];
      double totalWeight = 0.0;
      double avgWeight = 0.0;
      double maxWeight = 0.0;
      int i;
      
      System.out.println("Enter weight 1: ");
      userWeight[0] = scnr.nextDouble();
      
      System.out.println("Enter weight 2: ");
      userWeight[1] = scnr.nextDouble();
      
      System.out.println("Enter weight 3: ");
      userWeight[2] = scnr.nextDouble();
      
      System.out.println("Enter weight 4: ");
      userWeight[3] = scnr.nextDouble();
      
      System.out.println("Enter weight 5: ");
      userWeight[4] = scnr.nextDouble();
      System.out.println();
      
      System.out.print("You entered: ");
      for (i = 0; i < userWeight.length; ++i) {
         totalWeight = userWeight[i] + totalWeight;
         System.out.print(userWeight[i] + " ");
         if (userWeight[i] > maxWeight) {
            maxWeight = userWeight[i];
         }
      }
      System.out.println();
      
      System.out.println("Total weight: " + totalWeight);
      
      System.out.println("Average weight: " + (totalWeight / 5));
      
      System.out.println("Max weight: " + maxWeight);
      
      return;
   }
}
