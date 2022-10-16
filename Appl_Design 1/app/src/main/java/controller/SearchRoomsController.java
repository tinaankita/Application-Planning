package controller;


import datatransferobjects.SearchRoomDTO;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;


public class SearchRoomsController {

    public void run() {



        String userInput;
        do {
            System.out.println("Search for Available Rooms to Work");
            System.out.println("Here are the available rooms for now: AB, AC, AD, BA, BC");
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the room name or type 'quit' to exit:");
            userInput = sc.nextLine();
            if (userInput.equals("quit")) return;
            String Room = userInput;

            System.out.println("Enter the start date as yyyy-mm-dd or type 'quit' to exit:");
            userInput = sc.nextLine();
            if (userInput.equals("quit")) return;
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-mm-dd");
            LocalDate StartDate = LocalDate.now();
            try {
                StartDate = LocalDate.parse(userInput, formatter);
            } catch (DateTimeParseException ex) {
                ex.printStackTrace();
            }

            System.out.println("Enter the end date as yyyy-mm-dd or type 'quit' to exit:");
            userInput = sc.nextLine();
            if (userInput.equals("quit")) return;
            LocalDate EndDate = LocalDate.now();
            try {
                EndDate = LocalDate.parse(userInput, formatter);
            } catch (DateTimeParseException ex) {
                ex.printStackTrace();
            }



        }


        while (true);


    }

}










