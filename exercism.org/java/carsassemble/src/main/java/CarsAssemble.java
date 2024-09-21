public class CarsAssemble {
    public double productionRatePerHour(int speed) {
        if (speed >= 1 && speed <= 4)
            return speed * 221;
        else if (speed >= 5 && speed <= 8)
            return speed * 221 * .9;
        else if (speed == 9)
            return speed * 221 * .8;
        else if (speed == 10)
            return speed * 221 * .77;
        return 0;
    }

    public int workingItemsPerMinute(int speed) {
        //        if (speed >= 1 && speed <= 4)
        //            return (int) (speed * 221 / 60);
        //        else if (speed >= 5 && speed <= 8)
        //            return (int) (speed * 221 * .9 / 60);
        //        else if (speed == 9)
        //            return (int) (speed * 221 * .8 / 60);
        //        else if (speed == 10)
        //            return (int) (speed * 221 * .77 / 60);
        //        return 0;

        return (int) productionRatePerHour(speed) / 60;
    }
}
