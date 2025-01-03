package U5T1_Anatomy_of_a_class;
public class Spinner {
    private int sections = 0;
    private int count = 0;
    private int spinValue = 0;
    private int sum = 0;

    public Spinner (int s) {
        sections = s;
    }

    public int getSections (){
        return sections;
    }

    public int getRollValue() {
        return spinValue;
    }

    public int getRollCount() {
        return count;
    }

    public int getSpinSum() {
        return sum;
    }

    public double averageSpin() {
        return (double) sum / count;
    }

    public void roll () {
        spinValue = (int) (Math.random() * sections + 1);
        sum += spinValue;
        count ++;
    }
}
