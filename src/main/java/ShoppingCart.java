import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class ShoppingCart {


public static void main(String[] args) {
    System.out.println("Select language ");
    System.out.println("1.Finnish");
    System.out.println("2.Swedish");
    System.out.println("3.Japanese");
    Locale locale;
    ResourceBundle messages = null;
   Scanner sc = new Scanner(System.in);
   String input = sc.nextLine();
   int choice;
    try {
        choice = Integer.parseInt(input);
    } catch (NumberFormatException e) {
        choice = 0;
    }
    switch(choice) {
        case 1:
            locale = new Locale("fi", "FI");
            messages = ResourceBundle.getBundle("message", locale);
            break;

        case 2:
            locale = new Locale("sv", "SE");
            messages = ResourceBundle.getBundle("message", locale);
            break;


        case 3:
            locale = new Locale("ja", "JP");
            messages = ResourceBundle.getBundle("message", locale);
            break;

        default:
            locale = new Locale("en", "US");
            messages = ResourceBundle.getBundle("message", locale);
    }
    System.out.println(messages.getString("items"));
    int numberOfItems = Integer.parseInt(sc.nextLine());

    double totalCartCost = 0.0;

    for (int i = 1; i <= numberOfItems; i++) {
        System.out.println(messages.getString("price") + " " + i + ":");
        double price = Double.parseDouble(sc.nextLine());

        System.out.println(messages.getString("quantity") + " " + i + ":");
        int quantity = Integer.parseInt(sc.nextLine());

        double itemCost = price * quantity;
        totalCartCost += itemCost;
    }

    System.out.println(messages.getString("cost") + totalCartCost);

    sc.close();
}
}

