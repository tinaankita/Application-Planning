package datatransferobjects;
import java.time.LocalDate;


public final class PlanningCreationDTO {

    public String Email;
    public String Password;
    public String Teacher;
    public String Subject;
    public String Room;
    public LocalDate startDate;
    public LocalDate endDate;

    public PlanningCreationDTO(String Email, String Password, String Teacher, String Subject, String Room, LocalDate startDate, LocalDate endDate) {
        this.Email = Email;
        this.Password = Password;
        this.Teacher = Teacher;
        this.Subject = Subject;
        this.Room = Room;
        this.startDate = startDate;
        this.endDate = endDate;
    }
}
