package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {

    private static int ID = 1;  //Autoincrement
    private int id;
    private String speciality;
    private ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

    public Doctor(String name, String email){
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
    public void showName() {
        System.out.println(super.getName());
    }
    public void showId() {
        System.out.println("ID model.Doctor: " + id);
    }
    public void addAvailableAppointment(String date, String time) {
        availableAppointments.add(new AvailableAppointment(date, time));
    }
    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return  availableAppointments;
    }
    @Override
    public String toString() {
        return "ID: " + id + super.toString() +
                "\nSpeciality: " + speciality +
                "\nAvailable: " + availableAppointments.toString();
    }
    @Override
    public void showDataUser() {
        System.out.println("Hospital: ");
        System.out.println("Deartamento: ");
    }

    public static class AvailableAppointment {

        private int id;
        private Date date;
        private String time;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        public AvailableAppointment(String date, String time) {
            try {
                this.date = format.parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            this.time = time;
        }

        public void setId(int id) {
            this.id = id;
        }
        public int getId() {
            return id;
        }
        public void setDate(Date date) {
            this.date = date;
        }
        public Date getDate() {
            return date;
        }
        public String getDate(String date) {
            return format.format(date);
        }
        public void setTime(String time) {
            this.time = time;
        }
        public String getTime() {
            return time;
        }
        @Override
        public String toString() {
            return "\nAvailable Appointment\nDate: " + date + "\nTime: " + time;
        }
    }
}
