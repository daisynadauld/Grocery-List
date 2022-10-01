import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// This class contains a get recipe method which returns a Hashmap called recipe
// the user decides how many items to add using add another item? y/n
public class Recipe {

    public Map<String, Double> getRecipe(){
        Scanner scan = new Scanner(System.in);
        HashMap<String, Double> recipe = new HashMap<>();
        String response = "y";
        while (response.equals("y")) {
            System.out.println("Enter the item: ");
            String item = scan.nextLine();
            System.out.println("Enter the amount (oz): ");
            double amount = Math.round(Double.parseDouble(scan.nextLine()));
            recipe.put(item, amount);
            System.out.println("Add another item? y/n ");
            response = scan.nextLine();
        }
    return recipe;
    }
    }



