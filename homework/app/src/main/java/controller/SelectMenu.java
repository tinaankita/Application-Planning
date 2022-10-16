package controller;
import java.util.Scanner;

public class SelectMenu {
    DisplaySchedule schedule;
    MarkAbsence absence;
    public SelectMenu(DisplaySchedule schedule, MarkAbsence absence){
        this.absence = absence;
        this.schedule = schedule;
    }
    public void run(){
        String userInput;
        do{
            System.out.println("Select one option (1,2,3) or quit: ");
            System.out.println("1. View Schedules ");
            System.out.println("2. Mark absences");
            Scanner sc = new Scanner(System.in);
            userInput = sc.nextLine();

            switch (userInput) {
                case "1":
                    schedule.run();
                    break;
                case "2":
                    absence.run();
                    break;
                case "quit":
                    break;
            }

        } while (!userInput.equals("quit"));

    }
}
