class NeedForSpeed {
    private final int speed, batteryDrain;
    private int x = 0, battery = 100;

    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }

    public boolean batteryDrained() {
        return (battery - batteryDrain) < 0;
    }

    public int distanceDriven() {
        return x;
    }

    public void drive() {
        if (battery > 0) {
            x += speed;
            battery -= batteryDrain;
        }
    }

    public int getSpeed() {
        return speed;
    }

    public int getBattery() {
        return battery;
    }

    public int getBatteryDrain() {
        return batteryDrain;
    }
}

class RaceTrack {
    int distance;

    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        return ((double) distance / car.getSpeed()) <= ((double) car.getBattery() / car.getBatteryDrain());
    }
}
