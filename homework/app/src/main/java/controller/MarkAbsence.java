package controller;
import datatransferobjects.MarkAbsenceDTO;
import gateways.iRepository;
import entities.Absence;
import usecases.MarkAbsenceInteractor;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class MarkAbsence {
    iRepository<Absence> absenceRepository;

    public MarkAbsence(iRepository<Absence> absenceRepository) {
        this.absenceRepository = absenceRepository;
    }

    public void run() {
        String userInput;
        do {
            System.out.println("Mark Student Absence");
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the student name or 'quit':");
            userInput = sc.nextLine();
            if (userInput.equals("quit")) return;
            String name = userInput;

            System.out.println("Enter the subject or 'quit':");
            userInput = sc.nextLine();
            if (userInput.equals("quit")) return;
            String subject = userInput;

            System.out.println("Student is absent from yyyy-MM-dd or 'quit':");
            userInput = sc.nextLine();
            if (userInput.equals("quit")) return;
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate startDate = LocalDate.now();
            try {
                startDate = LocalDate.parse(userInput, formatter);
            } catch (DateTimeParseException ex) {
                ex.printStackTrace();
            }

            System.out.println("Student is absent until yyyy-MM-dd or 'quit':");
            userInput = sc.nextLine();
            if (userInput.equals("quit")) return;
            LocalDate endDate = LocalDate.now();
            try {
                endDate = LocalDate.parse(userInput, formatter);
            } catch (DateTimeParseException ex) {
                ex.printStackTrace();
            }
            var useCaseRequestMessage = new MarkAbsenceDTO(subject, name, startDate, endDate);
            var MarkAbsenceUseCase = new MarkAbsenceInteractor(absenceRepository);
            var responseMessage = MarkAbsenceUseCase.handle(useCaseRequestMessage);
        }
        while(true);
    }
}
