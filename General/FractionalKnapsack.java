import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Item {
    int weight;
    int value;

    public Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }
}

public class FractionalKnapsack {
    public static double fractionalKnapsack(int[] weights, int[] values, int capacity) {
        int n = weights.length;
        List<Item> items = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            items.add(new Item(weights[i], values[i]));
        }

        // Sort items by value-to-weight ratio in descending order
        Collections.sort(items, new Comparator<Item>() {
            @Override
            public int compare(Item item1, Item item2) {
                double ratio1 = (double) item1.value / item1.weight;
                double ratio2 = (double) item2.value / item2.weight;
                return Double.compare(ratio2, ratio1);
            }
        });

        double maxValue = 0;
        int currentWeight = 0;

        for (Item item : items) {
            if (currentWeight + item.weight <= capacity) {
                maxValue += item.value;
                currentWeight += item.weight;
            } else {
                // Take a fraction of the item to fill the capacity
                double remainingCapacity = capacity - currentWeight;
                maxValue += (item.value / (double) item.weight) * remainingCapacity;
                break;
            }
        }

        return maxValue;
    }

    public static void main(String[] args) {
        int[] weights = { 10, 20, 30 };
        int[] values = { 60, 100, 120 };
        int capacity = 50;

        double maxValue = fractionalKnapsack(weights, values, capacity);
        System.out.println("Maximum value: " + maxValue);
    }
}
