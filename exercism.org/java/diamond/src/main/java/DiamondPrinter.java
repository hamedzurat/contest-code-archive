import java.util.Arrays;
import java.util.List;

class DiamondPrinter {
    List<String> printToList(char a) {
        int diff = a - 'A';
        int size = ((diff * 2) + 1);
        String[] L = new String[size];
        String blank = " ".repeat(size);

        for (int i = 0; i < diff + 1; i++) {
            StringBuilder tmp = new StringBuilder(blank);

            tmp.setCharAt(diff - i, (char) ('A' + i));
            tmp.setCharAt(diff + i, (char) ('A' + i));

            L[i] = String.valueOf(tmp);
            L[size - i - 1] = String.valueOf(tmp);
        }

//        for (String s : L) System.out.println(s.replace(" ", "."));

        return Arrays.asList(L);
    }
}
