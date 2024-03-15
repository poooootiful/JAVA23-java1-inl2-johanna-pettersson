public class Products {


    Products (String name, double cost, int stock){

    }

    public static int setStock (int stock) {

        if (stock == 0) {
            System.out.println("Out of stock");
            return stock;
        }
        else {
            stock = stock-1;
        }
        return stock;
    }

}