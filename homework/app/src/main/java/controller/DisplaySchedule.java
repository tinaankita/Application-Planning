package controller;
import datatransferobjects.ScheduleDTO;
import entities.Absence;
import gateways.iRepository;
import entities.Schedule;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class DisplaySchedule {
    iRepository<Schedule> scheduleRepository;

    public DisplaySchedule(iRepository<Schedule> scheduleRepository){
        this.scheduleRepository = scheduleRepository;
    }
    public void run(){
        String userInput;
        do {
            System.out.println("Schedule planning");
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the day or 'quit':");
            userInput = sc.nextLine();
            if (userInput.equals("quit")) return;
            String name = userInput;

            switch(name) {
                case "monday":
                    System.out.println("10h00 - 11h00: Class 43/Salle 101");
                    System.out.println("12h00 - 14h00: Class 44/Salle 123");
                    System.out.println("14h45 - 16h45: Class 13/Salle 109");
                    break;
                case "tuesday":
                    System.out.println("08h00 - 09h00: Class 34/Salle 001");
                    System.out.println("10h00 - 11h00: Class 43/Salle 101");
                    System.out.println("11h00 - 12h00: Class 23/Salle 101");
                    System.out.println("14h00 - 15h00: Class 44/Salle 113");
                    System.out.println("17h00 - 18h00: Class 15/Salle 123");
                    break;
                case "wednesday":
                    System.out.println("16h00 - 17h00: Class 15/Salle 111");
                    System.out.println("18h00 - 19h00: Class 13/Salle 111");
                    break;
                case "thursday":
                    System.out.println("10h00 - 11h00: Class 43/Salle 101");
                    System.out.println("16h00 - 17h00: Studies meeting/Conference hall n°5");
                    break;
                case "friday":
                    System.out.println("10h00 - 11h00: Class 43/Salle 101");
                    System.out.println("15h00 - 17h00: Administrative meeting/Conference hall n°1");
                    System.out.println("17h00 - 19h00: Class 23/Salle 101");
                    break;
                case "saturday":
                    System.out.println("Day 1 off");
                    break;
                case "sunday":
                    System.out.println("Day 2 off");
                    break;

            }


        }
        while(true);
    }
}
