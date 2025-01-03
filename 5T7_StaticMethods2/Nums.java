public class Nums {

    private int int1 = 0;
    private int int2 = 0;
    private int one = 0;
    private static int all = 0;

    public Nums (int o, int t) {
        int1 = o;
        int2 = t;
    }

    public int randBetween() {
        one ++;
        all ++;
        return (int) (Math.random() * (int2 - int1 + 1)) + int1;
    }

    public int getRandomNumsGenerated() {
        return one;
    }

    public static int getTotalRandomNumsGenerated() {
        return all;
    }
}