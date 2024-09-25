class RaindropConverter {
    String convert(int n) {
        String out = (n % 3 == 0 ? "Pling" : "") + (n % 5 == 0 ? "Plang" : "") + (n % 7 == 0 ? "Plong" : "");
        return out.isEmpty() ? Integer.toString(n) : out;
    }
}
