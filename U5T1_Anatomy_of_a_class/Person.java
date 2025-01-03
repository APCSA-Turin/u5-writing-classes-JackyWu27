package U5T1_Anatomy_of_a_class;

public class Person {
    private String fname = "";
    private String lname = "";
    private int meetings = 0;

    public Person (String first, String last) {
        fname = first;
        lname = last;
    }

    public String getFirstName () {
        return fname;
    }

    public void meet (Person name) {
        System.out.println("Hello, my name is " + fname + ".\nHi, my name is " + name.getFirstName() + ".");
        meetings ++;
        name.meetings ++;
    }

    public int getMeetings () {
        return meetings;
    }
}