package ui;

import model.Doctor;
import java.util.ArrayList;
import java.util.Scanner;

public class UIDoctorMenu {

    public static ArrayList<Doctor> doctorsAvailableAppointments = new ArrayList<>();

    public static void showDoctorMenu() {
         int response = 0;
         do {
             System.out.println("\n\n");
             System.out.println("Doctor");
             System.out.println("Welcome " + UIMenu.doctorLogged.getName());
             System.out.println("1. Add Available Appointment");
             System.out.println("2. My Scheduled Appointment");
             System.out.println("0. Logout");

             Scanner sc = new Scanner(System.in);
             response = sc.nextInt();

             switch (response) {
                 case 1:
                     showAddAvailableAppointmentMenu();
                     break;
                 case 2:
                     //Falta el codigo



                     // o un metodo con un menu




                     break;
                 case 0:
                     UIMenu.showMenu();
                     break;
             }
         } while (response != 0);
    }
    private static void showAddAvailableAppointmentMenu() {
        int response = 0;
        do {
            System.out.println();
            System.out.println("::Add Available Appointment");
            System.out.println(":: Select a Month");

            for(int i = 0; i < 3; i++) {
                int j = i + 1;
                System.out.println(j + ". " + UIMenu.MONTHS[i]);
            }
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = sc.nextInt();

            if(response > 0 && response < 4) {
                int mouthSelected = 0;
                mouthSelected = response;
                System.out.println(mouthSelected + ". " + UIMenu.MONTHS[mouthSelected - 1]);

                int responseDate = 0;
                String date = "";
                do {
                    System.out.println("Insert the date available: [dd/mm/yyyy]");
                    Scanner scr = new Scanner(System.in);
                    date = scr.nextLine();
                    System.out.println("Your date is: " + date + "\n1. Correct\n2. Change Date");
                    responseDate = sc.nextInt();
                } while (responseDate == 2);

                int responseTime = 0;
                String time = "";
                do {
                    System.out.println("Insert the time available for date: " + date + " [16:00]");
                    Scanner scr = new Scanner(System.in);
                    time = scr.nextLine();
                    System.out.println("Your time is: " + time + "\n1. Correct\n2. Change Time");
                    responseTime = sc.nextInt();
                } while (responseTime == 2);

                UIMenu.doctorLogged.addAvailableAppointment(date,time);
                checkDoctorAvailableAppointments(UIMenu.doctorLogged);
            } else  if (response == 0) {
                showDoctorMenu();
            }
        } while (response != 0);
    }
    private static void checkDoctorAvailableAppointments(Doctor doctor) {
        if (doctor.getAvailableAppointments().size() > 0 &&
            !doctorsAvailableAppointments.contains(doctor)) {
            doctorsAvailableAppointments.add(doctor);
        }
    }
}
