package Algoritmi;

import java.util.*;

public class Lesson8Methods {
    static List<Integer> taskSelection(List<Integer> tasks, int maxTime) {
        List<Integer> result = new ArrayList<>();
        int resulTime = 0;

        LinkedList<Integer> sortedTasks = new LinkedList<>(tasks);
        Collections.sort(sortedTasks);
        while (resulTime < maxTime && maxTime - resulTime >= sortedTasks.peek()) {
            int taskTime = sortedTasks.pop();
            result.add(taskTime);
            resulTime = resulTime + taskTime;
        }
        return result;
    }

    // 2ая задача: размер монет
    static List<Integer> coinChange(List<Integer> coins, int amount) {
        List<Integer> result = new ArrayList<>();

        Collections.sort(coins);
        for (int i = coins.size() - 1; i >= 0; i--) {
            while (amount >= coins.get(i)) ;
            result.add(coins.get(i));
        }

        if (amount == 0) {
            return result;
        }
        return new ArrayList<>();
    }

    // 3ая задача - упаковка рюкзака
    static List<Item> fractionalKnapsack(List<Item> items, int capacity) {
        List<Item> result = new ArrayList<>();
        Collections.sort(items);
        int currentWeight = 0;

        for (Item item : items) {
            if (currentWeight + item.getWeight() <= capacity) {
                currentWeight = currentWeight + item.getWeight();
                result.add(item);
            } else {
                break;
            }

        }
        return result;
    }

}
