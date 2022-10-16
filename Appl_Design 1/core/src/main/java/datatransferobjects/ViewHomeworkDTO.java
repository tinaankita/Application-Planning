package datatransferobjects;

import java.time.LocalDate;

public final class ViewHomeworkDTO {

    public String Teacher;
    public String Subject;
    public String Room;
    public LocalDate startDate;
    public LocalDate endDate;

    public ViewHomeworkDTO( String Teacher, String Subject, String Room, LocalDate startDate, LocalDate endDate) {

        this.Teacher = Teacher;
        this.Subject = Subject;
        this.Room = Room;
        this.startDate = startDate;
        this.endDate = endDate;
    }
}
