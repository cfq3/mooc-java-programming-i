
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    // implement the required methods here
    // Part 1. Adds a meal to the menu. If the meal is already on the list, it is not added.
    public void addMeal(String meal) {
        if(!this.meals.contains(meal)) {
            this.meals.add(meal);
        }
    }

    // Part 1. Prints the meals
    public void printMeals() {
        for (String meal : this.meals) {
            System.out.println(meal);
        }
    }

    // Part 1. Clears the menu
    public void clearMenu() {
        this.meals.clear();
    }
}
