package snackBarApp;

public class Snack {

    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingId;

    public Snack(String name, int quanity, double cost, int vendingId) {

        maxId++;
        id = maxId;
        this.name = name;
        this.quantity = quanity;
        this.cost = cost;
        this.vendingId = vendingId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getQuantity() {
        return quantity;
    }

    public void addQuantity(int addBars) {
        this.quantity = this.quantity + addBars;
    }

    public void buyBars(int bars) {
        this.quantity = this.quantity - bars;
    }

    public int getVendeingID() {
        return vendingId;
    }

    public void setVendingId(int vendingId) {
        this.vendingId = vendingId;
    }

    public double getTotoalCost(int totalBars) {
        return this.cost * totalBars;
    }

}