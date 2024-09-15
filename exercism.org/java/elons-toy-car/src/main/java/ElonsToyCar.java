public class ElonsToyCar {
    private int x = 0;
    private int battery = 100;

    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + x + " meters";
    }

    public String batteryDisplay() {
        if (battery > 0)
            return "Battery at " + battery + "%";
        else
            return "Battery empty";
    }

    public void drive() {
        if (battery > 0) {
            x = x + 20;
            battery--;
        }
    }
}
