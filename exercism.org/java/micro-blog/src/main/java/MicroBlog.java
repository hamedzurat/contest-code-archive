class MicroBlog {
    public String truncate(String input) {
        //        return input.substring(0, Math.min(input.length(), 5));
        return input.codePoints()
                    .limit(5)
                    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                    .toString();
    }
}
