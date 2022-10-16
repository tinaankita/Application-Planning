package datatransferobjects;
import java.time.LocalDate;


public final class SearchRoomDTO {


    public String Room;
    public LocalDate startDate;
    public LocalDate endDate;

    public SearchRoomDTO( String Room, LocalDate startDate, LocalDate endDate) {
        this.Room = Room;
        this.startDate = startDate;
        this.endDate = endDate;
    }
}

