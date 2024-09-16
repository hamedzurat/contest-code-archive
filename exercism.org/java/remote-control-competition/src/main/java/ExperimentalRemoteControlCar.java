public class ExperimentalRemoteControlCar implements RemoteControlCar {
    private int x = 0;

    public void drive() {
        x += 20;
    }

    public int getDistanceTravelled() {
        return x;
    }
}
