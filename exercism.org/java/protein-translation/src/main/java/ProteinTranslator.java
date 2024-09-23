import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;
import java.util.stream.Collectors;


class ProteinTranslator {
    private final Map<String, String> codon = new HashMap<>();

    {
        codon.put("AUG", "Methionine");
        codon.put("UUU", "Phenylalanine");
        codon.put("UUC", "Phenylalanine");
        codon.put("UUA", "Leucine");
        codon.put("UUG", "Leucine");
        codon.put("UCU", "Serine");
        codon.put("UCC", "Serine");
        codon.put("UCA", "Serine");
        codon.put("UCG", "Serine");
        codon.put("UAU", "Tyrosine");
        codon.put("UAC", "Tyrosine");
        codon.put("UGU", "Cysteine");
        codon.put("UGC", "Cysteine");
        codon.put("UGG", "Tryptophan");
        codon.put("UAA", "STOP");
        codon.put("UAG", "STOP");
        codon.put("UGA", "STOP");
    }

    List<String> translate(String rnaSequence) {
        return Pattern.compile(".{1,3}")
                      .matcher(rnaSequence)
                      .results()
                      .map(MatchResult::group)
                      .map(codon::get)
                      .map(protein -> {
                          if (protein == null) throw new IllegalArgumentException("Invalid codon");
                          else return protein;
                      })
                      .takeWhile(protein -> !protein.equals("STOP"))
                      .collect(Collectors.toList());
    }
}
