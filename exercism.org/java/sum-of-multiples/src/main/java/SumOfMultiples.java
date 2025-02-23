import java.util.HashSet;


class SumOfMultiples {
    private final HashSet<Integer> list = new HashSet<>();

    SumOfMultiples(int level, int[] items) {
        if (level <= 0) return;

        for (int i : items)
            if (i != 0) //
                for (int j = i; j < level; j += i)
                     list.add(j);
    }

    int getSum() {
        return list.stream().mapToInt(Integer::intValue).sum();
    }
}
