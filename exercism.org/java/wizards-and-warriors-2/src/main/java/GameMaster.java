public class GameMaster {
    public static String describe(Character ch) {
        return String.format("You're a level %d %s with %d hit points.", ch.getLevel(), ch.getCharacterClass(), ch.getHitPoints());
    }

    public static String describe(Destination d) {
        return String.format("You've arrived at %s, which has %d inhabitants.", d.getName(), d.getInhabitants());
    }

    public static String describe(TravelMethod t) {
        return "You're traveling to your destination " + switch (t) {
            case WALKING -> "by walking.";
            case HORSEBACK -> "on horseback.";
        };
    }

    public static String describe(Character ch, Destination d, TravelMethod t) {
        return String.format("%s %s %s", describe(ch), describe(t), describe(d));
    }

    public static String describe(Character ch, Destination d) {
        return describe(ch, d, TravelMethod.WALKING);
    }
}
