public class fsd {
    public static void main(String[] args) {
        HiddenWord p = new HiddenWord("HARPS");
        System.out.println(p.getHint("HELLO"));
        System.out.println(p.getHint("HEART"));
        System.out.println(p.getHint("HARMS"));    
    }
}