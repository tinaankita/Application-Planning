package entities;

import java.time.LocalDate;
import java.util.UUID;

public class Homework extends Entity {
   private String Teacher;
    private String Subject;
    private String Room;
    private LocalDate startDate;
    private LocalDate endDate;

    public Homework(UUID id, String Teacher, String Subject, String Room, LocalDate startDate, LocalDate endDate) {
        this.Teacher = Teacher;
        this.Subject = Subject;
        this.Room = Room;
        this.startDate = startDate;
        this.endDate = endDate;

    }

    public String getRoom(String room) {
        this.Room = room;
        return Room;
    }

}

