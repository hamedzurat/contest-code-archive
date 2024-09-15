class SqueakyClean {
    static String clean(String identifier) {
//        identifier = identifier.replaceAll("\\s", "_");
        identifier = identifier.replace(' ', '_');

        int index = identifier.indexOf('-');
        if (index > -1)
            identifier = identifier.substring(0, index) + Character.toUpperCase(identifier.charAt(index + 1)) + identifier.substring(index + 2);

        identifier = identifier.replace('4', 'a');
        identifier = identifier.replace('3', 'e');
        identifier = identifier.replace('0', 'o');
        identifier = identifier.replace('1', 'l');
        identifier = identifier.replace('7', 't');

        identifier = identifier.replaceAll("[^A-Za-z_]", "");

        return identifier;
    }
}
