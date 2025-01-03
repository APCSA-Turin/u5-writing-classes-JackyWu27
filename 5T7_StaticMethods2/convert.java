public class convert {
    private convert () {}

    private static double toHundredth (double number) {
        return Math.round(number * 100.0) / 100.0;
    }
    public static double milesToKm (double miles) { //A
        return toHundredth(miles / 0.621);
    }

    public static double kmToMiles (double km) { //A
        return toHundredth(km * 0.621);
    }
}
