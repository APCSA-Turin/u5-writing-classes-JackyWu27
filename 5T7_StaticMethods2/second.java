public class second {
    private String scale = "";
    private double distance = 0;

    public second (double d,  String s) {
        distance = d;
        if (s.equals("miles") || s.equals("km")) {
            scale = s;  
        } else {
            scale = "miles";
        }
    }

    public void pointTopoint (double speed, String m) { //C
        if (m.equals(scale)){ // D
            System.out.println("It takes " + second.time(speed, distance) + " hours to go " + distance + " " + scale + " while moving at " + speed + " " + scale + " per hour");
        } else {
            if (m.equals("km")) {
                changeToKm();
            } else if (m.equals("miles")) {
                changeToMiles();
            }
            System.out.println("It takes " + second.time(speed, distance) + " hours to go " + distance + " " + scale + " while moving at " + speed + " " + scale + " per hour");
        }
        
    }
    public void changeToMiles () { //B
        if (scale.equals("km")) { //E
        scale = "miles";
        distance = convert.kmToMiles(distance);
        }
    }


    public void changeToKm () { //B
        if (scale.equals("miles")) { //E
        scale = "km";
        distance = convert.milesToKm(distance);
        }
    }

    public static double time (double ph, double d) {
        return (d / ph);
    }


    private static double toHundredth (double number) {
        return Math.round(number * 100.0) / 100.0;
    }

}
