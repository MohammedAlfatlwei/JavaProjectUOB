import java.util.Scanner;
/**
 * IT_UOB_PROJECT
 */
public class IT_UOB_PROJECT {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Product Name : ");
        String productName = scanner.nextLine();

        System.out.print("The Amount of " + productName + " : ");
        int productAmount = scanner.nextInt();

        System.out.print("The Cost of " + productName + " : ");
        double productCost = scanner.nextDouble();

        System.out.print("The Price of " + productName + " : ");
        double productPrice = scanner.nextDouble();


        // Temporary Output

        System.out.println("Product Name : " + productName + "\nAmount : " + productAmount + "\nCost : " + productCost + "\nPrice : " + productPrice);

    }
}
