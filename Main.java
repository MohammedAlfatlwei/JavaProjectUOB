import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        final byte MONTHS_IN_A_YEAR = 12;
        final byte DAYS_IN_A_MONTH = 30;

        String name, nameOfUnsoldProducts;
        int amountInStock, productPrice, productSellingPrice,
            productSales,productDailySales, grossIncome,
            profitPerProduct,monthlyProfit, yearlyProfit,
            amountUnsold, spendings, totalProfitAfterSpendings,
            totalProfit ;


        Scanner scanner = new Scanner(System.in);

        System.out.print("how many products do you have? ");
        int amountOfProducts = scanner.nextInt();

        int i = 0;

        while (i < amountOfProducts) {

            Scanner scanner1 = new Scanner(System.in);
            System.out.print("\n What is the name of the product? ");
            name = scanner1.nextLine();

            /*i notcied that when i change the function .nextline to .nextint the console read it with no prob 
             * then i thought it could be possible that one scanner read one type of variables only so i just 
             * add another scanner (scanner1)so that it read only (lines)
             */


            System.out.print("\n How much of the product is available in stock? ");
            amountInStock = scanner.nextInt();


            System.out.print("\n What is the price of the product? ");
            productPrice = scanner.nextInt();

            System.out.print("\n What is the selling price of the product? ");
            productSellingPrice = scanner.nextInt();

            System.out.print("\n How much of the product did you sell? ");
            productSales = scanner.nextInt();

            System.out.print("\n how much of the product do you sell per day? ");
            productDailySales = scanner.nextInt();


            System.out.print("\n how much do you pay on bills (water, electricity, rent, and all the workers there)? ");
            spendings = scanner.nextInt();

            amountUnsold = amountInStock - productSales;

            grossIncome = productSales * productSellingPrice;

            profitPerProduct = productSellingPrice - productPrice;

            monthlyProfit = (productDailySales * DAYS_IN_A_MONTH) * profitPerProduct;

            yearlyProfit = monthlyProfit * MONTHS_IN_A_YEAR;

            totalProfit = profitPerProduct * productSales;

            totalProfitAfterSpendings = totalProfit - spendings;

            System.out.println("_________________________________________________________________________");
            System.out.println("the gross income is : " + grossIncome
            + "\nthe monthly profit is : " + monthlyProfit
            + "\nthe total profit for the whole year : " + yearlyProfit
            + "\nthe name of the product and how much got sold : " + name + productSales
            + "\nthe amount unsold : " + amountUnsold
            + "\nthe total profit after all the spendings : " + totalProfitAfterSpendings);

            if (totalProfitAfterSpendings > 0)
                System.out.print("this product has good income!");
            else
                System.out.println("this product has bad income!");

            i = i++;

            }
        }
    }
