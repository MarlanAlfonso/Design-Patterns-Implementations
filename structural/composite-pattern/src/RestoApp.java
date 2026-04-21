// Step D: Client Application
public class RestoApp {

    public static void main(String[] args) {

        // Step 1: Create individual leaf items
        MenuItem burger     = new MenuItem("Classic Burger", 250.00);
        MenuItem fries      = new MenuItem("Large Fries",    85.00);
        MenuItem rootBeer   = new MenuItem("Root Beer",      60.00);

        // Step 2: Create sub-composite and add leaves
        MenuCategory barkadaMeal = new MenuCategory("BARKADA SOLO MEAL");
        barkadaMeal.add(burger);
        barkadaMeal.add(fries);
        barkadaMeal.add(rootBeer);

        // Step 3: Create another leaf
        MenuItem sundae = new MenuItem("Vanilla Sundae", 45.00);

        // Step 4: Create top-level composite and add children
        MenuCategory mainMenu = new MenuCategory("MAIN MENU");
        mainMenu.add(barkadaMeal);
        mainMenu.add(sundae);

        // Step 5: Test — print and get total price
        System.out.println("--- MAIN MENU ---");
        mainMenu.print();
        System.out.println("\n==============================");
        System.out.printf("Total Menu Value: \u20b1%.2f%n", mainMenu.getPrice());
    }
}