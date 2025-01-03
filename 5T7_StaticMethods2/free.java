public class free {
    private static double tDistance = 0;
    private double distance = 0;
    
    public free (double d) {
            distance = d;
            tDistance += d;
        }
    
    
    
    public void changeToKm (double nD) { /
        tDistance -= nD;
        distance = nD;
        tDistance += nD;
    }
    
    
    public double getDistance () {
        return distance;
    }

    public static double getTotalDistance () {
        return tDistance;
    }
    
}
    

