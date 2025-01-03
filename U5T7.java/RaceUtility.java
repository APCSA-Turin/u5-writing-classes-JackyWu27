public class RaceUtility   {
    
        public RaceUtility () {
        }

        public static double milesToKm (double miles) {
            return miles / 0.621;
        }

        public static double kmToMiles (double km) {
            return km * 0.621 ;
        }

        public static String makeProper (String Upper) {
            String lower = Upper.substring(0, 1).toUpperCase();
                for (int count = 1; count < Upper.length(); count++) {
                    if (Upper.substring(count - 1, count).equals(" ")) {
                        lower += Upper.substring(count, count + 1).toUpperCase();
                    } else {
                        lower += Upper.substring(count, count + 1).toLowerCase();
                    }
                }
            return lower;
        }
}
