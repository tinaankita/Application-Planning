package controller;

import java.util.Scanner;

public class ControllerFacade {
    ViewHomeworkController homeworkController;
    SearchRoomsController searchRoomsController;

    public ControllerFacade(ViewHomeworkController homeworkController, SearchRoomsController searchRoomsController) {
        this.homeworkController = homeworkController;
        this.searchRoomsController = searchRoomsController;
    }

    public void run()  {

        String userInput;
        do
        {
            System.out.println("Choose an option: A or B or 'quit':");
            System.out.println("A: View Homework");
            System.out.println("B: Search available rooms");
            System.out.println("Type 'quit' to exit");

            Scanner sc = new Scanner(System.in);
            userInput = sc.nextLine();

            switch (userInput) {
                case "A":
                    homeworkController.run();
                    break;
                case "B":
                    searchRoomsController.run();
                    break;
                case "quit":
                    break;
            }

        } while (!userInput.equals("quit"));
    }
}

