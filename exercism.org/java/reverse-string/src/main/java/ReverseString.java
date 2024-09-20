class ReverseString {
    String reverse(String inputString) {
        return new StringBuilder(inputString).reverse().toString();

//        StringBuilder output = new StringBuilder();
//        for (int i = inputString.length() - 1; i >= 0; i--) output.append(inputString.charAt(i));
//        return output.toString();
    }
}
