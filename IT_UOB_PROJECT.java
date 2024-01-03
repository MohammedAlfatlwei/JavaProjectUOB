import java.util.Scanner;
/**
 * IT_UOB_PROJECT
 */
public class IT_UOB_PROJECT {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Product Name : ");
        String productName = scanner.nextLine();

        System.out.print("The Amount Available of " + productName + " : ");
        int productAmountAvailable = scanner.nextInt();

        System.out.print("The Cost of " + productName + " : ");
        double productCost = scanner.nextDouble();

        System.out.print("The Price of " + productName + " : ");
        double productPrice = scanner.nextDouble();

        System.out.print("The Amount Sold of " + productName + " : ");
        int productAmountSold = scanner.nextInt();

        double totalSales = productAmountSold * productPrice ; 
        /*
         * we are gonna discuss the rest of the program later such as 
         * the monthly income of all the product 
         * and the yearly income (combined the monthly income )
         * note that he needs not only info for one product but for the rest may be 3 or 4 
         * so i guess we need to make a loop so that user can write the rest of the product he have 
         * and then we calaculate all of them togather
         */


        // Temporary Output
        System.out.println("________________________________________________________________________________________");


        System.out.println(
                "Product Name : " + productName +
                        "\nAmount Available : " + productAmountAvailable +
                        "\nCost : " + productCost +
                        "\nPrice : " + productPrice +
                        "\nAmount Sold : " + productAmountSold +
                        "\ntotal sales : " + totalSales
                        );


        scanner.close();
        
    }
}
