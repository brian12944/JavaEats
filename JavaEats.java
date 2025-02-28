import java.io.*; // need this for File, IOException, PrintWriter
import java.util.*; // need this for Scanner, Random
public class JavaEats {
    public static void main(String[] args) throws IOException {

        /* SETUP RELEVANT OBJECTS */
        File file = new File("C:\\Users\\Zeneg\\OneDrive\\Desktop\\Code\\GithubProjects\\csc2290-s25-project1-brian12944\\data\\Chick-fil-A.txt"); // args[0] is the first argument provided at the command line
        Scanner fileInput = new Scanner(file);
        Scanner userInput = new Scanner(System.in);
        Random rnd = new Random();
        /**************************************************************************************************************/

        // Does variable stuff
        // Restaurant info
        String name = "", address1 = "", address2 = "";

        // Entrees
        String entree1name = "", entree2name = "", entree3name = "", entree4name = "", entree5name = "", entree6name = "", entree7name = "", entree8name = "", entree9name = "";
        double entree1price = 0.0, entree2price = 0.0, entree3price = 0.0, entree4price = 0.0, entree5price = 0.0, entree6price = 0.0, entree7price = 0.0, entree8price = 0.0, entree9price = 0.0;

        // Sides
        String side1name = "", side2name = "", side3name = "", side4name = "", side5name = "", side6name = "", side7name = "", side8name = "", side9name = "";
        double side1price = 0.0, side2price = 0.0, side3price = 0.0, side4price = 0.0, side5price = 0.0, side6price = 0.0, side7price = 0.0, side8price = 0.0, side9price = 0.0;

        // Beverages
        String beverage1name = "", beverage2name = "", beverage3name = "", beverage4name = "", beverage5name = "", beverage6name = "", beverage7name = "", beverage8name = "", beverage9name = "";
        double beverage1price = 0.0, beverage2price = 0.0, beverage3price = 0.0, beverage4price = 0.0, beverage5price = 0.0, beverage6price = 0.0, beverage7price = 0.0, beverage8price = 0.0, beverage9price = 0.0;

        // Receipt-related variables
        int receiptWidth = 70;
        int itemNumber = 0;
        String itemName = "Sample item name";
        double itemPrice = 0.0;
        double subtotal = 0.0, tax = 0.0, discount = 0.0, total = 0.0;
        /**************************************************************************************************************/

        while (fileInput.hasNextLine()) {
            String menuLine = fileInput.nextLine();
            String[] parts = menuLine.split(",");
            itemName = parts[0].trim();
            itemPrice = Double.parseDouble(parts[1].trim());
            entree1name = itemName;
            entree1price = itemPrice;
        }

        int orderNumber = rnd.nextInt(99999) + 1;
        PrintWriter writer = new PrintWriter("data/receipt" + orderNumber + ".txt");
        writer.println("=".repeat(receiptWidth));
        writer.printf("|%s|%n", centerAlignText("Sample restaurant name", receiptWidth - 2));
        writer.printf("|%s|%n", "*".repeat(receiptWidth - 2));
        writer.printf("|    %-64s|%n", "Order #" + orderNumber);
        writer.printf("|    %s    |%n", "-".repeat(receiptWidth - 10));
        writer.printf("|    %2d. %-48s $%6.2f    |%n", itemNumber, itemName, itemPrice);

        while (true) {
            System.out.print("Would you like to order anything?");
            String orderResponse = userInput.nextLine();
            if (orderResponse.equals("no")) {
                break;
            } else if (orderResponse.equals("yes")) {
                System.out.print("Your mother's a hamster and your father reeks of elder berries!");
                continue;
            }
            System.out.print(" What category would you like to order from: Entrees 1, Sides 2, or Beverages 3?");
            int categoryChoice = userInput.nextInt();
            userInput.nextLine();
            String[] menuItems = new String[9];
            double[] menuPrices = new double[9];

            switch (categoryChoice) {
                case 1:
                    System.out.println("Entrees Menu: ");
                    menuItems = new String[]{entree1name, entree2name, entree3name, entree4name, entree5name, entree6name, entree7name, entree8name, entree9name};
                    menuPrices = new double[]{entree1price, entree2price, entree3price, entree4price, entree5price, entree6price, entree7price, entree8price, entree9price};
                    break;
                case 2:
                    System.out.println("Sides: ");
                    menuItems = new String[]{side1name, side2name, side3name, side4name, side5name, side6name, side7name, side8name, side9name};
                    menuPrices = new double[]{side1price, side2price, side3price, side4price, side5price, side6price, side7price, side8price, side9price};
                    break;
                case 3:
                    System.out.println("Beverages: ");
                    menuItems = new String[]{beverage1name, beverage2name, beverage3name, beverage4name, beverage5name, beverage6name, beverage7name, beverage8name, beverage9name};
                    menuPrices = new double[]{beverage1price, beverage2price, beverage3price, beverage4price, beverage5price, beverage6price, beverage7price, beverage8price, beverage9price};
                    break;
                default:
                    System.out.print("You're sharp as a marble");
                    continue;
            }

            System.out.println("Please select a menu item 1-9");
            for (int i = 0; i < 9; i++) {
                if (!menuItems[i].isEmpty()) {
                    System.out.printf("%d. %-40s $%.2f\n", i + 1, menuItems[i], menuPrices[i]);
                }
            }

            System.out.println("Choose an item number 1-9");
            int itemChoice = userInput.nextInt();
            userInput.nextLine();

            if (itemChoice >= 1 && itemChoice <= 9 && !menuItems[itemChoice - 1].isEmpty()) {
                itemName = menuItems[itemChoice - 1];
                itemPrice = menuPrices[itemChoice - 1];
                subtotal += itemPrice;
                writer.printf("|    %-48s $%6.2f    |%n", itemName, itemPrice);
                itemNumber++;
            } else {
                System.out.println("Merf");
                continue;
            }
        }

        System.out.println("Is thou a student?");
        String isStudent = userInput.next();
        if (isStudent.equals("yes")) {
            discount = 0.20 * subtotal;
        } else {
            discount = 0.0;
        }

        tax = 0.06 * subtotal;
        total = subtotal - discount + tax;
        writer.printf("|    Subtotal: $%6.2f    |%n", subtotal);
        writer.printf("|    Discount: $%6.2f    |%n", discount);
        writer.printf("|    Tax (6%%): $%6.2f    |%n", tax);
        writer.printf("|    Total: $%6.2f    |%n", total);

        int readyTime = (itemNumber) + rnd.nextInt(2) + 1;
        writer.printf("|    Estimated ready time: %d minutes    |%n", readyTime);

        // Close relevant objects
        fileInput.close();
        userInput.close();
        writer.close();
    }

    /**
     * Centers text in a specified width.
     *
     * @param text The String you want to center.
     * @param width The desired width of the output String.
     * @return A new String of the specified width with the text centered.
     */
    public static String centerAlignText(String text, int width) {
        int length = text.length();
        int padding = (width - length) / 2;
        if (padding < 0) {
            return text;
        }
        StringBuilder centeredText = new StringBuilder();
        for (int i = 0; i < padding; i++) {
            centeredText.append(" ");
        }
        centeredText.append(text);
        for (int i = 0; i < (width - length - padding); i++) {
            centeredText.append(" ");
        }
        return centeredText.toString();
    }
}
