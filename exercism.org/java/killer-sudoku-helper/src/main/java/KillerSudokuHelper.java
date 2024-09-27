import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class KillerSudokuHelper {
    //    public static List<List<Integer>> generateCombinations(int start, int end, int size) {
    //        List<List<Integer>> result = new ArrayList<>();
    //
    //        if (size == 0) {
    //            result.add(new ArrayList<>());
    //            return result;
    //        }
    //
    //        for (int i = start; i <= end; i++) {
    //            List<List<Integer>> subCombinations = generateCombinations(i + 1, end, size - 1);
    //            for (List<Integer> subCombination : subCombinations) {
    //                List<Integer> combination = new ArrayList<>();
    //                combination.add(i);
    //                combination.addAll(subCombination);
    //
    //                result.add(combination);
    //            }
    //        }
    //
    //        return result;
    //    }

    public static List<List<Integer>> generateCombinations(int start, int end, int size) {
        List<List<Integer>> result = new ArrayList<>();

        if (size == 0) return List.of(new ArrayList<>());

        for (int i = start; i <= end; i++) {
            List<List<Integer>> subCombinations = generateCombinations(i + 1, end, size - 1);

            for (List<Integer> subCombination : subCombinations) {
                List<Integer> combination = new ArrayList<>(subCombination);
                combination.add(0, i);
                result.add(combination);
            }
        }
        return result;
    }

    //    List<List<Integer>> combinationsInCage(Integer cageSum, Integer cageSize, List<Integer> exclude) {
    //        List<List<Integer>> finalCombinations = new ArrayList<>();
    //
    //        for (List<Integer> l : combinationsInCage(cageSum, cageSize)) {
    //            boolean is = true;
    //
    //            for (int x : exclude)
    //                if (l.contains(x)) {
    //                    is = false;
    //                    break;
    //                }
    //
    //            if (is) finalCombinations.add(l);
    //        }
    //
    //        return finalCombinations;
    //    }

    public List<List<Integer>> combinationsInCage(int cageSum, int cageSize, List<Integer> exclude) {
        return combinationsInCage(cageSum, cageSize).stream()
                                                    .filter(combination -> exclude.stream()
                                                                                  .noneMatch(combination::contains))
                                                    .collect(Collectors.toList());
    }

    //    List<List<Integer>> combinationsInCage(Integer cageSum, Integer cageSize) {
    //        List<List<Integer>> correctCombinations = new ArrayList<>();
    //
    //        for (List<Integer> c : generateCombinations(1, 9, cageSize))
    //            if (c.stream().flatMapToInt(IntStream::of).sum() == cageSum) correctCombinations.add(c);
    //
    //        return correctCombinations;
    //    }

    public List<List<Integer>> combinationsInCage(int cageSum, int cageSize) {
        return generateCombinations(1, 9, cageSize).stream()
                                                   .filter(combination -> combination.stream()
                                                                                     .mapToInt(Integer::intValue)
                                                                                     .sum() == cageSum)
                                                   .collect(Collectors.toList());
    }
}
