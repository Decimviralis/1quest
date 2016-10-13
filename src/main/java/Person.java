/**
 * Created by Максим on 13.10.2016.
 */
public class Person {
    public String getPerson_Name() {
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

    public Person getNewPerson() {
        return newPerson;
    }

    public void setNewPerson(Person newPerson) {
        this.newPerson = newPerson;
    }

    public java.lang.String person_Name;
    public java.lang.String person_Surname;
    public java.lang.String person_City;

    Person newPerson = new Person();

}
