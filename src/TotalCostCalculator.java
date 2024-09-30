
public class TotalCostCalculator {

    public static void main(String[] args) {
        String paragraph = "A core i 7 laptop price is 85000 tk and a gaming mouse price is 2500 tk.";

        String[] prices = paragraph.replaceAll("[^0-9 ]", "").trim().split("\\s+");

        int laptopPrice = Integer.parseInt(prices[0]);
        int mousePrice = Integer.parseInt(prices[1]);

        int totalCost = laptopPrice + mousePrice;

        double discount = totalCost * 0.15;
        double totalCostAfterDiscount = totalCost - discount;

        System.out.printf("Total cost after 15%% discount: %.2f tk\n", totalCostAfterDiscount);
    }
}

