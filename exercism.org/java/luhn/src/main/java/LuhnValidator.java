import java.util.ArrayList;
import java.util.stream.Collectors;


class LuhnValidator {
    boolean isValid(String candidate) {
        if (!candidate.chars().allMatch(c -> Character.isDigit(c) || Character.isSpaceChar(c))) return false;

        ArrayList<Integer> nums = candidate.chars()
                                           .filter(Character::isDigit)
                                           .map(i -> i - '0')
                                           .boxed()
                                           .collect(Collectors.toCollection(ArrayList::new));

        if (nums.size() < 2) return false;

        int     sum      = 0;
        boolean doDouble = false;

        boolean shouldDouble = false;
        for (int i = nums.size() - 1; i >= 0; i--) {
            int j = nums.get(i);
            if (shouldDouble) {
                j *= 2;
                if (j > 9) {
                    j -= 9;
                }
            }
            sum += j;
            shouldDouble = !shouldDouble;
        }

        return sum % 10 == 0;
    }
}
