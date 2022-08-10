package model;

import java.util.ArrayList;
import java.util.Date;

public class Patient extends User {

    private static int ID = 1; //Autoincrement
    private int id;
    private String birthday;
    private String blood;
    private String weight;
    private String height;
    private ArrayList<AppointmentDoctor> appointmentDoctors = new ArrayList<>();
    private ArrayList<AppointmentNurse> appointmentNurses = new ArrayList<>();

    public Patient(String name, String email) {
        super(name, email);
        this.id = ID;
        ID++;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    public String getBirthday() {
        return birthday;
    }
    public void setBlood(String blood) {
        this.blood = blood;
    }
    public String getBlood() {
        return blood;
    }
    public void setWeight(String weight) {
        this.weight = weight;
    }
    public String getWeight() {
        return weight + " Kg.";
    }
    public void setHeight(String height) {
        this.height = height;
    }
    public String getHeight() {
        return height + " Mts.";
    }
    public void addAppointmentDoctors(Doctor doctor, Date date, String time) {
        AppointmentDoctor appointmentDoctor = new AppointmentDoctor(this, doctor);
        appointmentDoctor.schedule(date, time);
        appointmentDoctors.add(appointmentDoctor);
    }
    public ArrayList<AppointmentDoctor> getAppointmentDoctors() {
        return appointmentDoctors;
    }
    public void setAppointmentNurses(ArrayList<AppointmentNurse> appointmentNurses) {
        this.appointmentNurses = appointmentNurses;
    }
    public ArrayList<AppointmentNurse> getAppointmentNurses() {
        return appointmentNurses;
    }
    @Override
    public String toString() {
        return "ID: " + id + super.toString() +
                "\nAge: " + birthday +
                "\nBlood: " + blood +
                "\nWeight: " + weight +
                "\nHeight: " + height;
    }
    @Override
    public void showDataUser() {
        System.out.println("Paciente");
        System.out.println("Historial completo.");
    }
}
