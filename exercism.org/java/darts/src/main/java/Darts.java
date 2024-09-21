class Darts {
    int score(double xOfDart, double yOfDart) {
        // Math.sqrt(Math.pow(xOfDart, 2) + Math.pow(yOfDart, 2));
        double x = Math.hypot(xOfDart, yOfDart);

        if (x <= 1) return 10;
        else if (x <= 5) return 5;
        else if (x <= 10) return 1;
        else return 0;
    }
}
