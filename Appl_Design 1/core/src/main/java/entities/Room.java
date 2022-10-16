package entities;


import java.time.LocalDate;
import java.util.UUID;

 public class Room extends Entity {
    private String Room;
    private LocalDate startDate;
    private LocalDate endDate;

    public Room(UUID id, String room, LocalDate startDate, LocalDate endDate) {
        this.Room = room;
        this.startDate = startDate;
        this.endDate = endDate;

    }

    public String getRoom(String room) {
       // this.room = room;
        return Room;
    }

}


