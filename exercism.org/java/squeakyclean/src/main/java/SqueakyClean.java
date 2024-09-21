class SqueakyClean {
    static String clean(String identifier) {
        //        identifier = identifier.replaceAll("\\s", "_").replace(' ', '_');

        int index = identifier.indexOf('-');
        if (index > -1) identifier = identifier.substring(0, index)
                                     + Character.toUpperCase(identifier.charAt(index + 1))
                                     + identifier.substring(index + 2);

        identifier = identifier.replace('4', 'a')
                               .replace('3', 'e')
                               .replace('0', 'o')
                               .replace('1', 'l')
                               .replace('7', 't');

        identifier = identifier.replaceAll("[^A-Za-z_]", "");

        return identifier;
    }
}
