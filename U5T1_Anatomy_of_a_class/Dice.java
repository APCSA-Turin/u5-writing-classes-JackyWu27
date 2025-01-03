package U5T1_Anatomy_of_a_class;
public class Dice {
    private int sides = 0;
    private int count = 0;
    private int roll = 0;

    public Dice (int s) {
        sides = s;
    }

    public int getSides (){
        return sides;
    }

    public int getRollValue() {
        return roll;
    }

    public int getRollCount() {
        return count;
    }

    public void setSides (int newsides) {
        sides = newsides;
    }

    public void roll () {
        roll = (int) (Math.random() * sides + 1);
        count ++;
    }
}
