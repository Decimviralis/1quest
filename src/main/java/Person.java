/**
 * Created by Максим on 13.10.2016.
 */
public class Person {
    private String person_Name;
    private String person_Surname;
    private String person_City;
    private String person_favouriteBand;
    private String getPerson_Name() {
        return person_Name;
    }

    public void setPerson_Name(String person_Name) {
        this.person_Name = person_Name;
    }

    public String getPerson_Surname() {
        return person_Surname;
    }

    public void setPerson_Surname(String person_Surname) {
        this.person_Surname = person_Surname;
    }

    public String getPerson_City() {
        return person_City;
    }

    public void setPerson_City(String person_City) {
        this.person_City = person_City;
    }

    public String getPerson_favouriteBand() {
        return person_favouriteBand;
    }

    public void setPerson_favouriteBand(String person_favouriteBand) {
        this.person_favouriteBand = person_favouriteBand;
    }
}
