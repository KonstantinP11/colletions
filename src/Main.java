import service.Service;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(8, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Service.printOddNumber(nums);
        System.out.println();
        Service.printEvenNumber(nums);

        List<String> words = new ArrayList<>(List.of("kod", "word", "kod", "list", "test", "test"));
        Service.printWords(words);

        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три", "два", "три"));
        Service.printCountingDuplicates(strings);
    }
}