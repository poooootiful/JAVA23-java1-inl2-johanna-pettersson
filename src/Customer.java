public class Customer {
    Customer (int Items, double TotalCost) {

    }


    public static int setBasketStock (int Stock) {
        Stock = Stock + 1;
        return Stock;
    }

    public static double setTotalCost (double Current, double addToTotal) {

        Current = Current+addToTotal;

        return Current;
    }

}