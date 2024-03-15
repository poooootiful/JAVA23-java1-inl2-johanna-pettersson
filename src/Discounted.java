public class Discounted extends Products{
    Discounted (String name, double cost, int stock, double discount) {
        super(name, cost, stock);
    }

    public static double getDiscount (double CurrentPrice, double Discount) {
        double discount = CurrentPrice * Discount;

        double Newcost = CurrentPrice - discount;

        return Newcost;
    }

}
