import java.util.Scanner;
/**
 * IT_UOB_PROJECT
 */
public class IT_UOB_PROJECT {
    public static void main(String[] args) {
        /* 
        System.out.print("how many product you sold: ");
        Scanner productnum = new Scanner(System.in); 
        int sales_num = productnum.nextInt();
        */ 

        /*i dont understand why the compiler rejecting me when i use (while loop) and (Do-while loop) */

        /*
        what im trying to do is to take a number form the user of how many product they sold 
         * and then using that ualue (the number) in while loop condtion to rpeat over and over the process of calcualting 
         */
            
        
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

        double total_product_slaes = productAmountSold * productPrice ;
        
        
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
        System.out.println("________________________________________________________________________________________");


        System.out.println(
                "Product Name : " + productName +
                        "\nAmount Available : " + productAmountAvailable +
                        "\nCost : " + productCost +
                        "\nPrice : " + productPrice +
                        "\nAmount Sold : " + productAmountSold +
                        "\ntotal sales : " + total_product_slaes + "$"
                        );


        scanner.close();
        
    }
}
