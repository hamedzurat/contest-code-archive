import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;


class HandshakeCalculator {
    List<Signal> calculateHandshake(int number) {
        List<Signal> out  = new ArrayList<>();
        int[]        bits = IntStream.range(0, 5).map(i -> (number >> i) & 1).toArray();

        for (int i = 0; i < 4; i++) if (bits[i] == 1) out.add(Signal.values()[i]);
        if (bits[4] == 1) Collections.reverse(out);

        return out;
    }
}
