import java.util.stream.Collectors;


class RnaTranscription {
    String transcribe(String dnaStrand) {
        return dnaStrand.chars()
                        .mapToObj(c -> (char) c)
                        .map(c -> (c == 'G') ? 'C' : (c == 'C') ? 'G' : (c == 'T') ? 'A' : (c == 'A') ? 'U' : c)
                        .map(String::valueOf)
                        .collect(Collectors.joining());

        //        StringBuilder rnaStrand = new StringBuilder();
        //        for (char c : dnaStrand.toCharArray())
        //            rnaStrand.append(c == 'G' ? 'C' : c == 'C' ? 'G' : c == 'T' ? 'A' : c == 'A' ? 'U' : c);
        //        return rnaStrand.toString();

        //        return dnaStrand.replace('A', 'U').replace('T', 'A').replace('C', '?').replace('G', 'C').replace('?', 'G');
    }
}
