import java.util.*;

// This program will get a user's recipe, and the amount of people it needs to feed
// then it will give you a grocery list with amounts needed for that meal.
public class Main {
    public static void main(String[] args) {
        //create objects
        Recipe r = new Recipe();
        Scanner scan = new Scanner(System.in);

        //beginning of the program
        System.out.println("Welcome to the grocery list.");

        System.out.println("How many servings are in this recipe?");
        double servings = Double.parseDouble(scan.nextLine());

        System.out.println("Please input the ingredients.");
        var recipeMap = r.getRecipe();

        System.out.println("How many people do you need to feed?");
        int numPeople = Integer.parseInt(scan.nextLine());

        //this loop gets the values in the hashmap recipe and changes them according
        //to how many people need to be fed with the recipe, then stores them in a new hashmap
        HashMap<String, Double> updatedMap = new HashMap<>();

        for (Map.Entry<String, Double> entry : recipeMap.entrySet()) {
            String key = entry.getKey();
            double value = entry.getValue();
            double newValue = value * (numPeople / servings);

            updatedMap.put(key, newValue);


        }

        //printing the hashmap in a formatted way
        // this will also convert the oz to lb for amounts over 16 oz
        System.out.println("Your shopping list: ");
        int num = 1;

        for (Map.Entry<String, Double> entry : updatedMap.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();

            if (value >= 16) {
                value = value / 16;
                System.out.println(num + "." + " " + key + " " + value + " " + "lb");
                num += 1;
            }
            else if (value < 16) {
                System.out.println(num + "." + " " + key + " " + value + " " + "oz");
                num += 1;
            }

        }
        }
    }




