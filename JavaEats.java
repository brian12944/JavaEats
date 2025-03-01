import java.io.*; // need this for File, IOException, PrintWriter
import java.util.*; // need this for Scanner, Random

public class JavaEats {
	public static void main(String[] args) throws IOException {
        /* SETUP RELEVANT OBJECTS */
		File file = new File("data/" + args[0] + ".txt"); // args[0] is the first argument provided at the command line
        Scanner fileInput = new Scanner(file);
        Scanner userInput = new Scanner(System.in);
        Random rnd = new Random();
        /**************************************************************************************************************/

        /* INITIALIZE (SOME) RELEVANT VARIABLES */
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

		// TODO: Load menu from file (150 lines)
        try {
            File RestMen = new File("/Users/Zeneg/OneDrive/Desktop/Code/GithubProjects/csc2290-s25-project1-brian12944/data/Chick-fil-A.txt");

            // Debugging: Check if file exists
            if (!RestMen.exists()) {
                System.out.println("Error: File does not exist at " + RestMen.getAbsolutePath());
                return;
            }

            Scanner menuInput = new Scanner(RestMen);

            // Read and print the first line of the file
			String menuLevel1 = "";
			String menuLevel2 = "";
			String menuLevel3 = "";
			String menuLevel4 = "";
			String menuLevel5 = "";
			String menuLevel6 = "";
			String menuLevel7 = "";
			String menuLevel8 = "";
			String menuLevel9 = "";
			String menuLevel10 = "";
			String menuLevel11 = "";
			String menuLevel12 = "";
			String menuLevel13 = "";
			String menuLevel14 = "";
			String menuLevel15 = "";
			String menuLevel16 = "";
			String menuLevel17 = "";
			String menuLevel18 = "";
			String menuLevel19 = "";
			String menuLevel20 = "";
			String menuLevel21 = "";
			String menuLevel22 = "";
			String menuLevel23 = "";
			String menuLevel24 = "";
			String menuLevel25 = "";
			String menuLevel26 = "";
			String menuLevel27 = "";
			String menuLevel28 = "";
			String menuLevel29 = "";
			String menuLevel30 = "";
			String menuLevel31 = "";
			String menuLevel32 = "";
			String menuLevel33 = "";
			String menuLevel34 = "";
			String menuLevel35 = "";
			String menuLevel36 = "";
			String menuLevel37 = "";

            if (menuInput.hasNextLine()) {
                while(menuInput.hasNextLine()){
                    String eyeLevel = menuInput.nextLine();
					int readCount = 1;
					switch(readCount){
						case 1:
							menuLevel1 = menuInput.nextLine();
							break;
						case 2:
							menuLevel2 = menuInput.nextLine();
							break;
						case 3:
							menuLevel3 = menuInput.nextLine();
							break;
						case 4:
							menuLevel4 = menuInput.nextLine();
							break;
						case 5:
							menuLevel5 = menuInput.nextLine();
							break;
						case 6:
							menuLevel6 = menuInput.nextLine();
							break;
						case 7:
							menuLevel7 = menuInput.nextLine();
							break;
						case 8:
							menuLevel8 = menuInput.nextLine();
							break;
						case 9:
							menuLevel9 = menuInput.nextLine();
							break;
						case 10:
							menuLevel10 = menuInput.nextLine();
							break;
						case 11:
							menuLevel11 = menuInput.nextLine();
							break;
						case 12:
							menuLevel12 = menuInput.nextLine();
							break;
						case 13:
							menuLevel13 = menuInput.nextLine();
							break;
						case 14:
							menuLevel14 = menuInput.nextLine();
							break;
						case 15:
							menuLevel15 = menuInput.nextLine();
							break;
						case 16:
							menuLevel16 = menuInput.nextLine();
							break;
						case 17:
							menuLevel17 = menuInput.nextLine();
							break;
						case 18:
							menuLevel18 = menuInput.nextLine();
							break;
						case 19:
							menuLevel19 = menuInput.nextLine();
							break;
						case 20:
							menuLevel20 = menuInput.nextLine();
							break;
						case 21:
							menuLevel21 = menuInput.nextLine();
							break;
						case 22:
							menuLevel22 = menuInput.nextLine();
							break;
						case 23:
							menuLevel23 = menuInput.nextLine();
							break;
						case 24:
							menuLevel24 = menuInput.nextLine();
							break;
						case 25:
							menuLevel25 = menuInput.nextLine();
							break;
						case 26:
							menuLevel26 = menuInput.nextLine();
							break;
						case 27:
							menuLevel27 = menuInput.nextLine();
							break;
						case 28:
							menuLevel28 = menuInput.nextLine();
							break;
						case 29:
							menuLevel29 = menuInput.nextLine();
							break;
						case 30:
							menuLevel30 = menuInput.nextLine();
							break;
						case 31:
							menuLevel31 = menuInput.nextLine();
							break;
						case 32:
							menuLevel32 = menuInput.nextLine();
							break;
						case 33:
							menuLevel33 = menuInput.nextLine();
							break;
						case 34:
							menuLevel34 = menuInput.nextLine();
							break;
						case 35:
							menuLevel35 = menuInput.nextLine();
							break;
						case 36:
							menuLevel36 = menuInput.nextLine();
							break;
						case 37:
							menuLevel37 = menuInput.nextLine();
							break;
					}
					readCount ++;
                }
                
            } else {
                System.out.println("Error: File is empty.");
            }

            menuInput.close(); // Close scanner to prevent resource leaks
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }
        

        // TODO: Start receipt using PrintWriter object (10 lines)
        Random random = new Random();
		int orderNumber = random.nextInt(99999) + 1;
        PrintWriter writer = new PrintWriter("data/receipt" + orderNumber + ".txt");
        writer.println("=".repeat(receiptWidth));
        writer.printf("|%s|%n", centerAlignText("Sample restaurant name", receiptWidth - 2));
        writer.printf("|%s|%n", "*".repeat(receiptWidth - 2));
        writer.printf("|    %-64s|%n", "Order #" + orderNumber);
        writer.printf("|    %s    |%n", "-".repeat(receiptWidth - 10));
        writer.printf("|    %2d. %-48s $%6.2f    |%n", itemNumber, itemName, itemPrice);

		//More variables for reciept
		String orderItem1;
		String orderItem2;
		String orderItem3;
		String orderItem4;
		String orderItem5;
		String orderItem6;
		String orderItem7;
		String orderItem8;
		String orderItem9;
		String orderItem10;
		double orderPrice1;
		double orderPrice2;
		double orderPrice3;
		double orderPrice4;
		double orderPrice5;
		double orderPrice6;
		double orderPrice7;
		double orderPrice8;
		double orderPrice9;
		double orderPrice10;

        // TODO: Get order from user, adding each item to the receipt as you go (135 lines)
        while (true);
        	// Ask user if they want to order something
			String chosenItem = "";
			double chosenPrice = 0;
			System.out.println("Would you like to order something? yes/no");
			if(userInput.next() == "no" || userInput.next() == "No"){
				break;
			} else if(userInput.next() == "yes" || userInput.next() == "Yes"){
				System.out.println("Would you like a 1 entree, 2 side, or 3 beverage?");
				int DinnerChoiceType = userInput.nextInt();
				switch (DinnerChoiceType){
					case 1:
						System.out.printf("%s ($%d)\n", entree1name, entree1price);
						System.out.printf("%s ($%d)\n", entree2name, entree2price);
						System.out.printf("%s ($%d)\n", entree3name, entree3price);
						System.out.printf("%s ($%d)\n", entree4name, entree4price);
						System.out.printf("%s ($%d)\n", entree5name, entree5price);
						System.out.printf("%s ($%d)\n", entree6name, entree6price);
						System.out.printf("%s ($%d)\n", entree7name, entree7price);
						System.out.printf("%s ($%d)\n", entree8name, entree8price);
						System.out.printf("%s ($%d)\n", entree9name, entree9price);
						System.out.println("Make an order 1-9");
						int entreeChoice = userInput.nextInt();
						int numberOfOrders = 0;
						switch(entreeChoice){
							default:
								System.out.println("Stop being a failure");
								break;
							case 1:
								subtotal = subtotal + entree1price;
								numberOfOrders ++;
								chosenItem = entree1name;
								chosenPrice = entree1price;
								break;
							case 2:
								subtotal = subtotal + entree2price;
								numberOfOrders ++;
								chosenItem = entree2name;
								chosenPrice = entree2price;
								break;
							case 3:
								subtotal = subtotal + entree3price;
								numberOfOrders ++;
								chosenItem = entree3name;
								chosenPrice = entree3price;
								break;
							case 4:
								subtotal = subtotal + entree4price;
								numberOfOrders ++;
								chosenItem = entree4name;
								chosenPrice = entree4price;
								break;
							case 5:
								subtotal = subtotal + entree5price;
								numberOfOrders ++;
								chosenItem = entree5name;
								chosenPrice = entree5price;
								break;
							case 6:
								subtotal = subtotal + entree6price;
								numberOfOrders ++;
								chosenItem = entree6name;
								chosenPrice = entree6price;
								break;
							case 7:
								subtotal = subtotal + entree7price;
								numberOfOrders ++;
								chosenItem = entree7name;
								chosenPrice = entree7price;
								break;
							case 8:
								subtotal = subtotal + entree8price;
								numberOfOrders ++;
								chosenItem = entree8name;
								chosenPrice = entree8price;
								break;
							case 9:
								subtotal = subtotal + entree9price;
								numberOfOrders ++;
								chosenItem = entree9name;
								chosenPrice = entree9price;
								break;
						}

					case 2:
						System.out.printf("%s ($%d)\n", side1name, side1price);
						System.out.printf("%s ($%d)\n", side2name, side2price);
						System.out.printf("%s ($%d)\n", side3name, side3price);
						System.out.printf("%s ($%d)\n", side4name, side4price);
						System.out.printf("%s ($%d)\n", side5name, side5price);
						System.out.printf("%s ($%d)\n", side6name, side6price);
						System.out.printf("%s ($%d)\n", side7name, side7price);
						System.out.printf("%s ($%d)\n", side8name, side8price);
						System.out.printf("%s ($%d)\n", side9name, side9price);
						System.out.println("Make an order 1-9");
						int sideChoice = userInput.nextInt();
						switch(sideChoice){
							default:
								System.out.println("Stop being a failure");
								break;
							case 1:
								subtotal = subtotal + side1price;
								numberOfOrders ++;
								chosenItem = side1name;
								chosenPrice = side1price;
								break;
							case 2:
								subtotal = subtotal + side2price;
								numberOfOrders ++;
								chosenItem = side2name;
								chosenPrice = side2price;
								break;
							case 3:
								subtotal = subtotal + side3price;
								numberOfOrders ++;
								chosenItem = side3name;
								chosenPrice = side3price;
								break;
							case 4:
								subtotal = subtotal + side4price;
								numberOfOrders ++;
								chosenItem = side4name;
								chosenPrice = side4price;
								break;
							case 5:
								subtotal = subtotal + side5price;
								numberOfOrders ++;
								chosenItem = side5name;
								chosenPrice = side5price;
								break;
							case 6:
								subtotal = subtotal + side6price;
								numberOfOrders ++;
								chosenItem = side6name;
								chosenPrice = side6price;
								break;
							case 7:
								subtotal = subtotal + side7price;
								numberOfOrders ++;
								chosenItem = side7name;
								chosenPrice = side7price;
								break;
							case 8:
								subtotal = subtotal + side8price;
								numberOfOrders ++;
								chosenItem = side8name;
								chosenPrice = side8price;
								break;
							case 9:
								subtotal = subtotal + side9price;
								numberOfOrders ++;
								chosenItem = side9name;
								chosenPrice = side9price;
								break;
						}

					case 3:
						System.out.printf("%s ($%d)\n", side1name, side1price);
						System.out.printf("%s ($%d)\n", side2name, side2price);
						System.out.printf("%s ($%d)\n", side3name, side3price);
						System.out.printf("%s ($%d)\n", side4name, side4price);
						System.out.printf("%s ($%d)\n", side5name, side5price);
						System.out.printf("%s ($%d)\n", side6name, side6price);
						System.out.printf("%s ($%d)\n", side7name, side7price);
						System.out.printf("%s ($%d)\n", side8name, side8price);
						System.out.printf("%s ($%d)\n", side9name, side9price);
						System.out.println("Make an order 1-9");
						int beverageChoice = userInput.nextInt();
						switch(beverageChoice){
							default:
								System.out.println("Stop being a failure");
								break;
							case 1:
								subtotal = subtotal + beverage1price;
								numberOfOrders ++;
								chosenItem = beverage1name;
								chosenPrice = beverage1price;
								break;
							case 2:
								subtotal = subtotal + beverage2price;
								numberOfOrders ++;
								chosenItem = beverage2name;
								chosenPrice = beverage2price;
								break;
							case 3:
								subtotal = subtotal + beverage3price;
								numberOfOrders ++;
								chosenItem = beverage3name;
								chosenPrice = beverage3price;
								break;
							case 4:
								subtotal = subtotal + beverage4price;
								numberOfOrders ++;
								chosenItem = beverage4name;
								chosenPrice = beverage4price;
								break;
							case 5:
								subtotal = subtotal + beverage5price;
								numberOfOrders ++;
								chosenItem = beverage5name;
								chosenPrice = beverage5price;
								break;
							case 6:
								subtotal = subtotal + beverage6price;
								numberOfOrders ++;
								chosenItem = beverage6name;
								chosenPrice = beverage6price;
								break;
							case 7:
								subtotal = subtotal + beverage7price;
								numberOfOrders ++;
								chosenItem = beverage7name;
								chosenPrice = beverage7price;
								break;
							case 8:
								subtotal = subtotal + beverage8price;
								numberOfOrders ++;
								chosenItem = beverage8name;
								chosenPrice = beverage8price;
								break;
							case 9:
								subtotal = subtotal + beverage9price;
								numberOfOrders ++;
								chosenItem = beverage9name;
								chosenPrice = beverage9price;
								break;
						}
						switch (numberOfOrders){
							case 1:
								orderItem1 = chosenItem;
								orderPrice1 = chosenPrice;
								break;
							case 2:
								orderItem2 = chosenItem;
								orderPrice2 = chosenPrice;
								break;
							case 3:
								orderItem3 = chosenItem;
								orderPrice3 = chosenPrice;
								break;
							case 4:
								orderItem4 = chosenItem;
								orderPrice4 = chosenPrice;
								break;
							case 5:
								orderItem5 = chosenItem;
								orderPrice5 = chosenPrice;
								break;
							case 6:
								orderItem6 = chosenItem;
								orderPrice6 = chosenPrice;
								break;
							case 7:
								orderItem7 = chosenItem;
								orderPrice7 = chosenPrice;
								break;
							case 8:
								orderItem8 = chosenItem;
								orderPrice8 = chosenPrice;
								break;
							case 9:
								orderItem9 = chosenItem;
								orderPrice9 = chosenPrice;
								break;
							case 10:
								orderItem10 = chosenItem;
								orderPrice10 = chosenPrice;
								break;
						}
				}
			} else {
				System.out.println("No you are wrong");
				continue;
			}

		    // Ask user which menu category they want to order from
		    
		    // Show corresponding menu and ask which item they want to choose
		    
		    // If they make a valid choice, add the item price to the subtotal and print on receipt
		
		// TODO: Ask user if they are a student to apply discount if needed (10 lines)
		System.out.println("Is thou a student? yes/no");
		if(userInput.next() == "Yes" || userInput.next() == "yes"){
			boolean Hasdiscount = true;
		} 

		// TODO: Finish receipt by computing and displaying subtotal, discount, tax, and total (20 lines)
		String restaurantName = menuLevel1.substring(0, menuLevel1.indexOf("  "));
		address1 = menuLevel2.substring(0, menuLevel2.indexOf("  "));
		address2 = menuLevel3.substring(0, menuLevel3.indexOf("  "));
		int spacings;
		for (int i = 0; i < 70; i++){
			System.out.print("=");
		}
		System.out.println("");
		System.out.print("|");
		spacings = (68 - restaurantName.lenth())/2;
		for (int i = 0; i < spacings; i++){
			System.out.print(" ");
		}
		System.out.print(restaurantName);
		for (int i = 0; i < spacings; i++){
			System.out.print(" ");
		}
		System.out.println("|");
		System.out.print("|")
		spacings = (68 - address1.lenth())/2;
		for (int i = 0; i < spacings; i++){
			System.out.print(" ");
		}
		System.out.print(address1);
		for (int i = 0; i < spacings; i++){
			System.out.print(" ");
		}
		System.out.println("|");
		System.out.print("|");
		spacings = (68 - address2.lenth())/2;
		for (int i = 0; i < spacings; i++){
			System.out.print(" ");
		}
		System.out.print(address1);
		for (int i = 0; i < spacings; i++){
			System.out.print(" ");
		}
		System.out.println("|");
		System.out.print("|");
		for (int i = 0; i < 68; i++){
			System.out.print("*");
		}
		System.out.println("|");
		System.out.print("|");
		System.out.printf("    Order #%d", rnd);
		spacings = 54 - rnd.length();
		for (int i = 0; i < spacings; i++){
			System.out.print(" ");
		}
		System.out.println("|");
		System.out.print("|    ");
		for(int i = 0; i < 60; i++){
			System.out.print("-");
		}
		System.out.println("    |");
		for (int i = 1; i <= numberOfOrders; i++){
			System.out.print("|     ");
			switch(i){
				case 1:
					System.out.printf("1. %s", orderItem1);
					spacings = 52 - orderItem1.lenth();
					for (int i = 0; i < spacings; i++){
						System.out.print(" ");
					}
					System.out.printf("$ %d    |\n", orderPrice1);
				case 2:
					System.out.printf("1. %s", orderItem2);
					spacings = 52 - orderItem2.lenth();
					for (int i = 0; i < spacings; i++){
						System.out.print(" ");
					}
					System.out.printf("$ %d    |\n", orderPrice2);
				case 3:
				System.out.printf("1. %s", orderItem3);
					spacings = 52 - orderItem3.lenth();
					for (int i = 0; i < spacings; i++){
						System.out.print(" ");
					}
					System.out.printf("$ %d    |\n", orderPrice3);
				case 4:
				System.out.printf("1. %s", orderItem4);
					spacings = 52 - orderItem4.lenth();
					for (int i = 0; i < spacings; i++){
						System.out.print(" ");
					}
					System.out.printf("$ %d    |\n", orderPrice4);
				case 5:
				System.out.printf("1. %s", orderItem5);
					spacings = 52 - orderItem5.lenth();
					for (int i = 0; i < spacings; i++){
						System.out.print(" ");
					}
					System.out.printf("$ %d    |\n", orderPrice5);
				case 6:
				System.out.printf("1. %s", orderItem6);
					spacings = 52 - orderItem6.lenth();
					for (int i = 0; i < spacings; i++){
						System.out.print(" ");
					}
					System.out.printf("$ %d    |\n", orderPrice6);
				case 7:
				System.out.printf("1. %s", orderItem7);
					spacings = 52 - orderItem7.lenth();
					for (int i = 0; i < spacings; i++){
						System.out.print(" ");
					}
					System.out.printf("$ %d    |\n", orderPrice7);
				case 8:
				System.out.printf("1. %s", orderItem8);
					spacings = 52 - orderItem8.lenth();
					for (int i = 0; i < spacings; i++){
						System.out.print(" ");
					}
					System.out.printf("$ %d    |\n", orderPrice8);
				case 9:
				System.out.printf("1. %s", orderItem9);
					spacings = 52 - orderItem9.lenth();
					for (int i = 0; i < spacings; i++){
						System.out.print(" ");
					}
					System.out.printf("$ %d    |\n", orderPrice9);
				case 10:
				System.out.printf("1. %s", orderItem10);
					spacings = 52 - orderItem10.lenth();
					for (int i = 0; i < spacings; i++){
						System.out.print(" ");
					}
					System.out.printf("$ %d    |\n", orderPrice10);
			}
		}
		System.out.println("");
		System.out.print("|    ");
		for(int i = 0; i < 60; i++){
			System.out.print("-");
		}
		System.out.println("    |");
		System.out.print("|    Subtotal:");
		spacings = 48 - subtotal.lenth();
		for (int i = 0; i < spacings; i++){
			System.out.print(" ");
		}
		System.out.printf("$  %d    |\n", subtotal);
		if(Hasdiscount == true){
			System.out.print("|    Discount (20%):");
			discount = subtotal * 0.2;
			spacings = 42 - discount.lenth();
			for (int i = 0; i < spacings; i++){
			System.out.print(" ");
			}
			System.out.printf("$  %d    |\n", discount);
			subtotal = subtotal - discount;
		}
		System.out.print("|    Tax:");
		tax = subtotal * 0.6;
		spacings = 53 - tax.lenth();
		for (int i = 0; i < spacings; i++){
			System.out.print(" ");
		}
		System.out.printf("$  %d    |\n", tax);
		System.out.print("|    ");
		for(int i = 0; i < 60; i++){
			System.out.print("-");
		}
		System.out.println("    |");
		System.out.print("|    Total:");
		total = (tax + subtotal) + subtotal;
		spacings = 51 - total.lenth();
		for (int i = 0; i < spacings; i++){
			System.out.print(" ");
		}
		System.out.printf("$  %d    |\n", total);
		System.out.print("|    ");
		for(int i = 0; i < 60; i++){
			System.out.print("-");
		}
		System.out.println("    |");
		System.out.print("|");
		for(int i = 0; i < 68; i++){
			System.out.print(" ");
		}
		System.out.println("|");
		int totalOrderTime;
		int orderTime;
		for(int i = 0; i < numberOfOrders; i++){
			orderTime = random.nextInt(1)+1;
			totalOrderTime = totalOrderTime + orderTime;
		}
		spacings = (38 - totalOrderTime.length())/2;
		for (int i = 0; i < spacings; i++){
			System.out.print(" ");
		}
		System.out.printf("Your order will be ready in %d minutes.", totalOrderTime);
		for (int i = 0; i < spacings; i++){
			System.out.print(" ");
		}
		System.out.println("|");
		System.out.prtint("|");
		for (int i = 0; i < 20; i++){
			System.out.print(" ");
		}
		System.out.print("Thank you, please come again!");
		for (int i = 0; i < 20; i++){
			System.out.print(" ");
		}
		System.out.println("|");
		for (int i = 0; i < 70; i++){
			System.out.print("=");
		}
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
        	padding = 0; // avoid negative padding
        }
        int leftPadding = padding, rightPadding = padding;
        if (length % 2 == 1) {
        	rightPadding++;
        }
        return " ".repeat(leftPadding) + text + " ".repeat(rightPadding);
    }
}