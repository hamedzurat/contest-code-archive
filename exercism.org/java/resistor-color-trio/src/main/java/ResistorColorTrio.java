class ResistorColorTrio {
    private static final long GIGA = 1_000_000_000;
    private static final long MEGA = 1_000_000;
    private static final long KILO = 1_000;

    String label(String[] colors) {
        long ohms = (std.valueOf(colors[0]).ordinal() * 10L) + std.valueOf(colors[1]).ordinal();
        ohms *= (long) Math.pow(10, std.valueOf(colors[2]).ordinal());

        if (ohms == 0) return "0 ohms";
        else if (ohms % GIGA == 0) return (ohms / GIGA) + " gigaohms";
        else if (ohms % MEGA == 0) return (ohms / MEGA) + " megaohms";
        else if (ohms % KILO == 0) return (ohms / KILO) + " kiloohms";
        else return ohms + " ohms";
    }

    private enum std {
        black, brown, red, orange, yellow, green, blue, violet, grey, white,
    }
}
