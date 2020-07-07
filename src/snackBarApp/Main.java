package snackBarApp;

import java.text.DecimalFormat;

public class Main {
  private static DecimalFormat df2 = new DecimalFormat("#.00");

  public static void main(String[] args) {

    // Customer(String name, double cash)
    Customer customer1 = new Customer("Jane", 45.25);
    Customer customer2 = new Customer("Bob", 33.14);

    // VendingMachine(String name)

    VendingMachine machine1 = new VendingMachine("Food");
    VendingMachine machine2 = new VendingMachine("Drink");
    VendingMachine machine3 = new VendingMachine("Office");

    // Snack(String name, int quanity, double cost, int vendingId)
    Snack chips = new Snack("Chips", 36, 1.75, machine1.getId());
    Snack chocolateBar = new Snack("Chocolate Bar", 36, 1.00, machine1.getId());
    Snack pretzel = new Snack("Pretzel", 30, 2.00, machine1.getId());

    Snack soda = new Snack("Soda", 24, 2.50, machine2.getId());
    Snack water = new Snack("Water", 20, 2.75, machine2.getId());

    // Customer 1 (Jane) buys 3 of snack 4 (Soda).
    // Print Customer 1 (Jane) Cash on hand.
    // Print quantity of snack 4 (Soda).

    customer1.buySnacks(3 * soda.getCost());
    soda.buyBars(3);
    System.out.println("Customer  " + customer1.getId() + " cash on hand $" + customer1.getCash());
    System.out.println("Quantity of Snack " + soda.getId() + " is " + soda.getQuantity());

    // Customer 1 (Jane) buys 1 of snack 3 (Pretzel).
    // Print Customer 1 (Jane) Cash on hand.
    // Print quantity of snack 3 (Pretzel).

    customer1.buySnacks(1 * pretzel.getCost());
    pretzel.buyBars(1);
    System.out.println("Customer " + customer1.getId() + " cash on hand $" + customer1.getCash());
    System.out.println("Quantity of Snack " + pretzel.getId() + " is " + pretzel.getQuantity());

    // Customer 2 (Bob) buys 2 of snack 4 (Soda).
    // Print Customer 2 (Bob) Cash on Hand.
    // Print quantity of snack 4 (Soda).
    customer2.buySnacks(2 * soda.getCost());
    soda.buyBars(2);
    System.out.println("Customer  " + customer2.getId() + " cash on hand $" + customer2.getCash());
    System.out.println("Quantity of Snack " + soda.getId() + " is " + soda.getQuantity());

    // Customer 1 (Jane) finds $10.
    // Print Customer 1 (Jane) Cash on Hand.

    customer1.addCash(10);
    System.out.println("Customer " + customer1.getId() + " cash on hand $" + customer1.getCash());

    // Customer 1 (Jane) buys 1 of snack 2 (Chocolate Bar).
    // Print Customer 1 (Jane) Cash on Hand.
    // Print quantity of snack 2 (Chocolate Bar).

    customer1.buySnacks(1 * chocolateBar.getCost());
    chocolateBar.buyBars(1);
    System.out.println("Customer " + customer1.getId() + " cash on hand $" + customer1.getCash());
    System.out.println("Quantity of Snack " + chocolateBar.getId() + " is " + chocolateBar.getQuantity());

    // Add 12 more items to snack 3 (Pretzel).
    // Print quantity of snack 3 (Pretzel).
    pretzel.addQuantity(12);
    System.out.println("Quantity of Snack " + pretzel.getId() + " is " + pretzel.getQuantity());

    // Customer 2 (Bob) buys 3 of snack 3 (Pretzel).
    // Print Customer 2 (Bob) Cash on hand.
    // Print quantity of snack 3 (Pretzel).
    customer2.buySnacks(3 * pretzel.getCost());
    pretzel.buyBars(3);
    System.out.println("Customer  " + customer2.getId() + " cash on hand $" + customer2.getCash());
    System.out.println("Quantity of Snack " + pretzel.getId() + " is " + pretzel.getQuantity());

    // Display each snack with
    // Name
    // Vending Machine Name
    // Quantity on hand
    // Total cost of all of the quantities of this snack on hand
    // Format all dollar amount like $1,234.56
    // Starts with a dollar sign
    // comma separating group of 3 numbers
    // rounded to the nearest cents, hundredths place
    System.out.println("Snake: " + chips.getName());
    System.out.println("Vending Machine: " + machine1.getName());
    System.out.println("Quantity: " + chips.getQuantity());
    System.out.println("Total Cost:" + "$" + df2.format(chips.getQuantity() * chips.getCost()));

    System.out.println("Snake: " + chocolateBar.getName());
    System.out.println("Vending Machine: " + machine1.getName());
    System.out.println("Quantity: " + chocolateBar.getQuantity());
    System.out.println("Total Cost:" + "$" + df2.format(chocolateBar.getQuantity() * chocolateBar.getCost()));

    System.out.println("Snake: " + pretzel.getName());
    System.out.println("Vending Machine: " + machine1.getName());
    System.out.println("Quantity: " + pretzel.getQuantity());
    System.out.println("Total Cost:" + "$" + df2.format(pretzel.getQuantity() * pretzel.getCost()));

    System.out.println("Snake: " + soda.getName());
    System.out.println("Vending Machine: " + machine2.getName());
    System.out.println("Quantity: " + soda.getQuantity());
    System.out.println("Total Cost:" + "$" + df2.format(soda.getQuantity() * soda.getCost()));

    System.out.println("Snake: " + water.getName());
    System.out.println("Vending Machine: " + machine2.getName());
    System.out.println("Quantity: " + water.getQuantity());
    System.out.println("Total Cost:" + "$" + df2.format(water.getQuantity() * water.getCost()));
  }
}