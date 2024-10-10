class Proverb {
    private final StringBuilder proverb = new StringBuilder();

    Proverb(String[] words) {
        for (int i = 0; i < words.length - 1; i++)
            proverb.append("For want of a ")
                   .append(words[i])
                   .append(" the ")
                   .append(words[i + 1])
                   .append(" was lost.\n");

        if (words.length != 0) proverb.append("And all for the want of a ").append(words[0]).append(".");
    }

    String recite() {
        return proverb.toString();
    }
}
