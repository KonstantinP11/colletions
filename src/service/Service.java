package service;

import java.util.*;

public class Service {

    public static void printOddNumber(List<Integer> nums) {
        List<Integer> oddNums = new ArrayList<>(List.of());
        for (Integer num : nums) {
            if (num % 2 == 1) {
                oddNums.add(num);
            }
        }
        System.out.print(oddNums);
    }

    public static void printEvenNumber(List<Integer> nums) {
        Set<Integer> evenNamber = new HashSet<>();
        for (Integer num : nums) {
            if (num % 2 == 0) {
                evenNamber.add(num);
            }
        }
        System.out.println(evenNamber);
    }

    public static void printWords(List<String> words) {
        Set<String> singleWord = new HashSet<>(words);
        System.out.println(singleWord);
    }

    public static void printCountingDuplicates(List<String> strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String string : strings) {
            if (!map.containsKey(string)) {
                map.put(string, 1);
            } else {
                int key = map.get(string) + 1;
                map.put(string, key);
            }
        }
        System.out.println(map.values());
    }
}