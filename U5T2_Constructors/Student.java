public class Student {
    private String name;
    private int gradeLevel;
    private String school;
  
    /* Write the two constructors here, as described above */
  
    public Student(String n, int g) {
        name = n;
        gradeLevel = g;
        if (g >= 1 && g <= 5) {
            school = "elementary school";
        } else if (g >= 6 && g <= 8) {
            school = "middle school";
        } else if (g >= 9 && g <= 12) {
            school = "high school";
        } else {
            school = "unknown";
        }
    }

    public Student(String n, int g, String s) {
        name = n;
        gradeLevel = g;
        school = s;
    }
    public String studentInfo () {
      return name + " is in grade " + gradeLevel + " and goes to " + school;
    }
  }
  