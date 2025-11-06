// Xavier Nazario
// Student ID# 2512208

// Program for Meal class

package nazario10;

// Import ArrayList utility
import java.util.ArrayList;

class Meal {

	// Declare 1 instance
	// Use Fastfood name
	private ArrayList<Fastfood> meal;

	public Meal() {
		meal = new ArrayList<>();
	}

	// Adds Fastfood class to Meal class
	// Use boolean
	public boolean add(Fastfood fastfood) {
		return meal.add(fastfood);
	}

	// Returns Fastfood item specified position
	// Use get() method
	// Use integer
	public Fastfood get(int position) {
		return meal.get(position);
	}

	// Returns all instances of Fastfood in Meal class
	public ArrayList<Fastfood> list() {
		return new ArrayList<>(meal);
	}

	// Returns price of all instances of Fastfood
	// Use if Statement
	// Use floor and ceiling
	// Use double
	public ArrayList<Fastfood> listByPrice(double floor, double ceiling) {
		ArrayList<Fastfood> result = new ArrayList<>();
		for (Fastfood fastfood : meal) {
			if (fastfood.getPrice() >= floor && fastfood.getPrice() <= ceiling) {
				result.add(fastfood);
			}
		}
		return result;
	}

	// Sorts by quantity
	// Lowest to highest
	public ArrayList<Fastfood> sortByQuantity() {
		ArrayList<Fastfood> sorted = new ArrayList<>(meal);
		sorted.sort((f1, f2) -> Integer.compare(f1.getQuanity(), f2.getQuanity()));
		return sorted;
	}

	// Returns count of Fastfood in Meals
	// Use integer
	public int size() {
		return meal.size();
	}

	// Returns Fastfood instance
	// Use findResturant method
	// Use if Statement nested in for loop
	public Fastfood findRestuarant(String name) {
		for (Fastfood fastfood : meal) {
			if (fastfood.getRestuarantName().trim().equals(name.trim())) {
				return fastfood;
			}
		}
		return null;
	}
}
