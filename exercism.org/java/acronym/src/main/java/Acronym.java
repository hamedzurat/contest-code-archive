class Acronym {
    private final String acronym;

    Acronym(String phrase) {
        StringBuilder str     = new StringBuilder();
        boolean       addNext = true;

        for (Character c : phrase.toCharArray()) {
            if (addNext && Character.isLetter(c)) {
                str.append(c);
                addNext = false;
            }
            if (c == ' ' || c == '-') addNext = true;
        }

        acronym = str.toString().toUpperCase();

        //        acronym = Arrays.stream(phrase.replaceAll("[^a-zA-Z\\s-]", "").split("[\\s-]+"))
        //                        .map(word -> word.toUpperCase().charAt(0))
        //                        .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
        //                        .toString();
    }

    String get() {return acronym;}
}
