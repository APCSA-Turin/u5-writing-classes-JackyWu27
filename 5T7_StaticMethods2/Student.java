public class Student {
    private String name = "";
    private int points = 0;
    private static int TotalPoints = 0;
    private static int GreatestPoints = 0;

    public Student (String n) {
        name = n;
    }

    public String studentInfo() {
        return "Student: " + name + "\nStudent's Points: " + points;
    }

    public void addPoints(int p) {
        points += p;
        TotalPoints += p;
        if (points > GreatestPoints) {
            GreatestPoints = points;
        }
    }

    public static int getTotalPointsEarned() {
        return TotalPoints;
    }

    public static int getGreatestPoints() {
        return GreatestPoints;
    }

    public static String classInfo() {
        return "Total points earned by all students: " + TotalPoints + "\nMost points earned by any student: " + GreatestPoints;
    }
}
