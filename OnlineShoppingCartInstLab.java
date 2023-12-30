// CREATE ITEMS TO PURCHASE AND PROVIDE TOTAL OF SELECTED ITEMS. ORIGINALLY BROKEN INTO TWO FILES. //

// ITEM TO PURCHASE FILE //
public class ItemToPurchase {
   //Private fields - itemName, itemPrice, and itemQuanity
   private String itemName;
   private int itemPrice;
   private int itemQuantity;

   // Default Constructor
   public ItemToPurchase() {
      itemName = "none";
      itemPrice = 0;
      itemQuantity = 0;
   }
    
   //public member methods (mutators & accessors)
   
   //setName() & getName()
   public void setName(String name) {
      itemName = name;
   }
   
   public String getName() {
      return itemName;
   }
   
   //setPrice() & getPrice()
   public void setPrice(int price) {
      itemPrice = price;
   }
   
   public int getPrice() {
      return itemPrice;
   }
   
   //setQuantity() & getQuantity()
   public void setQuantity(int quantity) {
      itemQuantity = quantity;
   }
   
   public int getQuantity() {
      return itemQuantity;
   }
   
   //print item to purchase
   
   public void printItemPurchase() {
      System.out.println(itemQuantity + " " + itemName + " $" + itemPrice +  
                         " = $" + (itemPrice * itemQuantity));
   }
}


// SHOPPING CART PRINTER FILE //
import java.util.Scanner;

public class ShoppingCartPrinter {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int i = 0;
      String productName;
      int productPrice = 0;
      int productQuantity = 0;
      int cartTotal = 0;
  
      ItemToPurchase item1 = new ItemToPurchase();
      ItemToPurchase item2 = new ItemToPurchase();

      // Get item 1 details from user, create itemToPurchase object
      System.out.println("Item 1");
      System.out.println("Enter the item name: ");
      item1.setName(scnr.nextLine());
      System.out.println("Enter the item price: ");
      item1.setPrice(scnr.nextInt());
      System.out.println("Enter the item quantity: ");
      item1.setQuantity(scnr.nextInt());
      
      System.out.println();
      
      // Get item 2 details from user, create itemToPurchase object
      System.out.println("Item 2");
      System.out.println("Enter the item name: ");
      scnr.nextLine();
      item2.setName(scnr.nextLine());
      System.out.println("Enter the item price: ");
      item2.setPrice(scnr.nextInt());
      System.out.println("Enter the item quantity: ");
      item2.setQuantity(scnr.nextInt());
      
      System.out.println();

      
      // Add costs of two items and print total
      // cartTotal = item one price + item two price
      cartTotal = (item1.getPrice() * item1.getQuantity()) + (item2.getPrice() * item2.getQuantity());
      // Total Cost
      System.out.println("TOTAL COST");
      // item one information
      System.out.println(item1.getName() + " " + item1.getQuantity() + " @ $" + item1.getPrice()  + " = $" + (item1.getPrice() * item1.getQuantity()));
      // item two information
      System.out.println(item2.getName() + " " + item2.getQuantity() + " @ $" + item2.getPrice()  + " = $" + (item2.getPrice() * item2.getQuantity()));
      System.out.println();
      // Total output
      System.out.println("Total: $" + cartTotal);
      
      return;
   }
}
