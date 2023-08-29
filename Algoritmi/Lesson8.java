package Algoritmi;


import java.util.Arrays;
import java.util.List;

public class Lesson8 {
    public static void main(String[] args) {
        // 1ая задача / выбор задач
        List<Integer> tasks = Arrays.asList(3, 2, 1, 4, 5, 3);
        int maxTime = 10;
        List<Integer> resolved = Lesson8Methods.taskSelection(tasks, maxTime);
        System.out.println(resolved);

        // 2ая задача / размер монет
        List<Integer> coins = Arrays.asList(1, 5, 10, 25);
        int amount = 63;
        //System.out.println(Lesson8Methods.coinChange(coins, amount));

        // 3ая задача - упаковка рюкзака
        List<Item> items = Arrays.asList(new Item("A", 7, 100), new Item("B", 5, 80),new Item("C", 5, 50) );
        int capacity = 10;
        List<Item> result = Lesson8Methods.fractionalKnapsack(items,capacity);
        System.out.println(result);

    }
}
