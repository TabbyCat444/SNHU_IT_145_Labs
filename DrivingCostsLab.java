// CALCULATE COST TO DRIVE MILES DISTANCE BASED ON VEHICLE MPG AND GAS PRICES //

import java.util.Scanner;

public class LabProgram {
   
   public static double drivingCost(double milesPerGallon, double dollarsPerGallon, double milesDriven) {
      double gasCost;
      gasCost = (dollarsPerGallon / milesPerGallon) * milesDriven;
      return gasCost;
      }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double userMpg;
      double userDollarsPerGallon;

      userMpg = scnr.nextDouble();
      userDollarsPerGallon = scnr.nextDouble();
      
      System.out.printf("%.2f", (drivingCost(userMpg, userDollarsPerGallon, 10.00)));
      System.out.print(" ");
      System.out.printf("%.2f", (drivingCost(userMpg, userDollarsPerGallon, 50.00)));
      System.out.print(" ");
      System.out.printf("%.2f", (drivingCost(userMpg, userDollarsPerGallon, 400.00)));
      System.out.println();
   }
}
