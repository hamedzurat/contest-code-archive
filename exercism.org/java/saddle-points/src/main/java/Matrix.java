import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;


class Matrix {
    private final Set<MatrixCoordinate> saddlePointsSet = new HashSet<>();

    Matrix(List<List<Integer>> values) {
        if (values.isEmpty()) return;

        int row = values.size();
        int col = values.get(0).size();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                final int currentRow   = i;
                final int currentCol   = j;
                final int currentValue = values.get(currentRow).get(currentCol);

                boolean isRowMax = IntStream.range(0, col).allMatch(x -> values.get(currentRow).get(x) <= currentValue);
                boolean isColMin = IntStream.range(0, row).allMatch(x -> values.get(x).get(currentCol) >= currentValue);

                if (isRowMax && isColMin) saddlePointsSet.add(new MatrixCoordinate(i + 1, j + 1));
            }
        }
    }

    Set<MatrixCoordinate> getSaddlePoints() {
        return saddlePointsSet;
    }

    // [9, 8, 7]
    // [5*, 3, 2]
    // [6, 6, 7]

    // [1, 2, 3]
    // [3, 1, 2]
    // [2, 3, 1]

    // [4, 5*, 4]
    // [3, 5*, 5]
    // [1, 5*, 4]

    // [6, 7, 8]
    // [5*, 5*, 5*]
    // [7, 5, 6]
}
