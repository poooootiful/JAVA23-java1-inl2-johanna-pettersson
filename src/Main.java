import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String Knife = "Knife";
        double KnifeCost = 45.00;
        int KnifeStock = 56;

        String FakeBlood = "Fake Blood";
        double FakeBloodCost = 152.60;
        int FakeBloodStock = 9;

        String Mask = "Mask";
        double MaskCost = 145;
        int MaskStock = 80;

        int BasketItems = 0;

        double PriceTotal = 0;

        int pick;

        new Customer(BasketItems,PriceTotal);
        new Products(Knife, KnifeCost, KnifeStock);
        new Products(FakeBlood, FakeBloodCost,FakeBloodStock);
        new Discounted(Mask, MaskCost,MaskStock,0.1);

        MaskCost = Discounted.getDiscount(MaskCost,0.1);

            do {
                System.out.println("1."+Knife+" "+KnifeStock+" Left " + KnifeCost+" Sek");
                System.out.println("2."+FakeBlood+" "+FakeBloodStock+" Left " + FakeBloodStock+" Sek");
                System.out.println("3."+Mask+" "+MaskStock+" Left " + MaskCost+" Sek");
                System.out.println("4. Quit");

                Scanner input = new Scanner(System.in);

                 pick = input.nextInt();

                if (pick == 1) {
                    KnifeStock = Products.setStock(KnifeStock);
                    BasketItems = Customer.setBasketStock(BasketItems);
                    PriceTotal = Customer.setTotalCost(KnifeCost, PriceTotal);
                }
                else if (pick == 2) {
                    FakeBloodStock = Products.setStock(FakeBloodStock);
                    BasketItems = Customer.setBasketStock(BasketItems);
                    PriceTotal = Customer.setTotalCost(FakeBloodCost, PriceTotal);
                }
                else if (pick == 3) {
                    MaskStock = Products.setStock(MaskStock);
                    BasketItems = Customer.setBasketStock(BasketItems);
                    PriceTotal = Customer.setTotalCost(MaskCost, PriceTotal);
                }
                else if (pick == 4) {
                    System.out.println("Shutting Down");
                    System.out.println("You got "+BasketItems+" Items, For a price off "+PriceTotal+" Sek");
                }
            } while (pick < 4);


    }
}