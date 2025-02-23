import java.util.HashSet;


class Triangle {
    private final HashSet<Double> uniqueness = new HashSet<>();

    Triangle(double side1, double side2, double side3) throws TriangleException {
        if ((side1 > side2 + side3) || (side2 > side1 + side3) || (side3 > side2 + side1) || side1 == 0 || side2 == 0 || side3 == 0)
            throw new TriangleException();

        uniqueness.add(side1);
        uniqueness.add(side2);
        uniqueness.add(side3);
    }

    boolean isEquilateral() {
        return uniqueness.size() == 1;
    }

    boolean isIsosceles() {
        return uniqueness.size() <= 2;
    }

    boolean isScalene() {
        return uniqueness.size() == 3;
    }
}
