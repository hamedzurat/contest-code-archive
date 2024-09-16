public class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    private int x = 0, win = 0;

    public void drive() {
        x += 10;
    }

    public int getDistanceTravelled() {
        return x;
    }

    public int getNumberOfVictories() {
        return win;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        win = numberOfVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar productionRemoteControlCar) {
        return Integer.compare(productionRemoteControlCar.getNumberOfVictories(), this.win);
    }
}
