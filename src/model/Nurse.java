package model;

public class Nurse extends User{

    private static int ID = 1;  //Autoincrement
    private int id;
    private String speciality;

    public Nurse(String name, String email) {
        super(name, email);
        this.id = ID;
        ID++;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
    public String getSpeciality() {
        return speciality;
    }
    @Override
    public void showDataUser() {
        System.out.println("Hospital: ");
        System.out.println("Deartamento: ");
    }
}
