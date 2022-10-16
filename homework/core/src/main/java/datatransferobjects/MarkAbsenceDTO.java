package datatransferobjects;

import java.time.LocalDate;

public final class MarkAbsenceDTO {
    public String subject;
    public String name;
    public String code;
    public LocalDate startDate;
    public LocalDate endDate;
    public MarkAbsenceDTO(String subject, String name, LocalDate startDate, LocalDate endDate) {
        this.subject = subject;
        this.name = name;
        this.code = code;
        this.startDate = startDate;
        this.endDate = endDate;
    }



}
