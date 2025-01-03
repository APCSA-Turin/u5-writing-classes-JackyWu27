public class Person {
    private String person = "";
    public boolean status = false;

    public Person (String p) {
        person = p;
    }

    public String getName() {
        return person;
    }

    public boolean isVaccinated() {
        return status;
    } 


}
