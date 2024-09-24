public class Question6 {
    public static void main(String[] args) {
        int pizzaPrice = 200;
        int puffsPrice = 40;
        int pepsPrice = 120;

        int numPizzas = 5;
        int numPuffs = 6;
        int numPepsi = 2;

        int totalPizzas = numPizzas * pizzaPrice;
        int totalPuffs = numPuffs * puffsPrice;
        int totalPepsi = numPepsi * pepsPrice;

        int grandTotal = totalPizzas + totalPuffs + totalPepsi;

        System.out.println("Bill Details:");
        System.out.println("Total Cost of Pizza RS : " + totalPizzas);
        System.out.println("Total Cost of Puff Rs : " + totalPuffs);
        System.out.println("Total Cost of Pepsi Rs : " + totalPepsi);
        System.out.println("Grand Total : " + grandTotal);

    }
}
