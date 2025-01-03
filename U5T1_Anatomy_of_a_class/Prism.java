package U5T1_Anatomy_of_a_class;
public class Prism {
    private int length = 0;
    private int width = 0;
    private int height = 0;

    public Prism (int l, int w, int h) {
        length = l;
        width = w;
        height = h;
    }

    public Prism (int same) {
        length = same;
        width = same;
        height = same;
    }

    public Prism () {
        length = (int) (Math.random() * 91 + 10);
        width = (int) (Math.random() * 91 + 10);
        height = (int) (Math.random() * 91 + 10);
    }

    public void setLength (int newLength){
        length = newLength;
    }

    public void setWidth(int newWidth) {
        width = newWidth;
    }

    public void setHeight(int newHeight) {
        height = newHeight;
    }


    public int surfaceArea () {
        return (2 * width * length) + (2 * width * height) + (2 * height * length);
    }

    public int volume () {
        return (height * width * length);
    }

    public String dimensions () {
        return ("Length = " + length + "\n" + "Width = " + width + "\n" + "Height = " + height);
    }
}
