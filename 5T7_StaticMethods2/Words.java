public class Words {
    private Words () {

    }

    public static boolean doesContain(String find, String word) {
        if (word.indexOf(find) != -1) {
            return true;
        } else {
            return false;
        }
    }
    public static void printReverse(String reverse) {
        for (int count = reverse.length(); count > 0; count--) {
            System.out.print(reverse.substring(count - 1, count) + " ");
        }
        System.err.println();
    }
}
