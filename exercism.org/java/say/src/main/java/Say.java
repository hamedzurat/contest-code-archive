import java.util.HashMap;
import java.util.Map;


public class Say {
    private final Map<Integer, String> scale = new HashMap<>();
    private final Map<Integer, String> b4_20 = new HashMap<>();
    private final Map<Integer, String> tens  = new HashMap<>();

    {
        b4_20.put(0, "zero");
        b4_20.put(1, "one");
        b4_20.put(2, "two");
        b4_20.put(3, "three");
        b4_20.put(4, "four");
        b4_20.put(5, "five");
        b4_20.put(6, "six");
        b4_20.put(7, "seven");
        b4_20.put(8, "eight");
        b4_20.put(9, "nine");
        b4_20.put(10, "ten");
        b4_20.put(11, "eleven");
        b4_20.put(12, "twelve");
        b4_20.put(13, "thirteen");
        b4_20.put(14, "fourteen");
        b4_20.put(15, "fifteen");
        b4_20.put(16, "sixteen");
        b4_20.put(17, "seventeen");
        b4_20.put(18, "eighteen");
        b4_20.put(19, "nineteen");

        tens.put(2, "twenty");
        tens.put(3, "thirty");
        tens.put(4, "forty");
        tens.put(5, "fifty");
        tens.put(6, "sixty");
        tens.put(7, "seventy");
        tens.put(8, "eighty");
        tens.put(9, "ninety");

        scale.put(1, "");
        scale.put(2, "thousand");
        scale.put(3, "million");
        scale.put(4, "billion");
        scale.put(5, "trillion");
    }

    public String say(long number) {
        if (number < 0 || number > 999_999_999_999L) throw new IllegalArgumentException();
        if (number == 0) return "zero";

        StringBuilder result   = new StringBuilder();
        int           index = 1;

        while (number > 0) {
            int chunk = (int) (number % 1000);

            if (chunk > 0) {
                StringBuilder w = new StringBuilder();

                if (chunk >= 100) {
                    w.append(b4_20.get(chunk / 100)).append(" hundred ");
                    chunk %= 100;
                }

                if (chunk >= 20) {
                    w.append(tens.get(chunk / 10));

                    if (chunk % 10 != 0) w.append("-").append(b4_20.get(chunk % 10));
                } else if (chunk > 0) w.append(b4_20.get(chunk));

                result.insert(0, w.toString().trim() + " " + scale.get(index) + " ");
            }

            number /= 1000;
            index++;
        }

        return result.toString().trim();
    }
}
