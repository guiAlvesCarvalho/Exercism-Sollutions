public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double production = speed * 221;
        switch(speed) {
            case 0: return 0;
            case 1:
            case 2:
            case 3:
            case 4:
                return production;
            case 5:
            case 6:
            case 7:
            case 8:
                return production * 0.9;
            case 9:
                return production * 0.8;
            case 10:
                return production * 0.77;
            default: 
                System.out.println ("Invalid speed");
        }
        return production;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed) / 60;
    }
}
