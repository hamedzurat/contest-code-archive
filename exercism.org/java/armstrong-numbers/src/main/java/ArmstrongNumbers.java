class ArmstrongNumbers {
    boolean isArmstrongNumber(int n) {
        return n == String.valueOf(n)
                          .chars().parallel()
                          .map(d -> (int) Math.pow(d - '0', String.valueOf(n).length()))
                          .sum();

        //        int n = numberToCheck, sum = 0, m = String.valueOf(n).length();
        //
        //        while (n != 0) {
        //            int i = n % 10;
        //            sum += (int) Math.pow(i, m);
        //            n /= 10;
        //        }
        //
        //        return numberToCheck == sum;
    }
}
