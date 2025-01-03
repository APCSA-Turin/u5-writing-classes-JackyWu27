public class Clinic {
    private static int tClinics = 0;
    private static int tVaccines = 0;
    private Person mRecent;
    private int Vaccines = 0;

    public Clinic () {
        tClinics ++;
    }

    public static int getTotalClinics() {
        return tClinics;
    }

    public static int getTotalVaccineCount() {
        return tVaccines;
    }

    public int getClinicVaccineCount() {
        return Vaccines;
    }

    public boolean vaccinate(Person p) {
        if (p.isVaccinated()) {
            return false;
        } else {
            p.status = true;
            mRecent = p;
            Vaccines ++;
            tVaccines ++;
            return true;
        }
    }

    public Person mostRecentlyVaccinated() {
        return mRecent;
    }
}
