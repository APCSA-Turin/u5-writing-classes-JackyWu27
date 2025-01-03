public class Employee {
    private String First = "";
    private String Last = "";
    private int ID = 0;
    private static int mostRecentEmployeeID = 99;
    private static int totalEmployeesCreated = 0;

    public Employee (String f, String l) {
        mostRecentEmployeeID ++;
        First = f;
        Last = l;
        ID = mostRecentEmployeeID;
        totalEmployeesCreated ++;
    }

    public String getFullName() {
        return (First + " " + Last);
    }
    public int GetID() {
        return ID;
    }
    public static int getMostRecentEmployeeID() {
        return mostRecentEmployeeID;
    }
    public static int getTotalEmployeesCreated() {
        return totalEmployeesCreated;
    }
    public String employeeInfo() {
return ("--------------------------\nEmployee full name: " + getFullName() + 
"\nEmployee ID: " + GetID() + 
"\nMost recent ID assigned: " + getMostRecentEmployeeID() + 
"\nTotal employees hired: " + getTotalEmployeesCreated() + 
"\n--------------------------");
}


}