package entities;

import java.time.LocalDate;
import java.util.UUID;

public class Absence extends Entity {
    private String name;
    private LocalDate startDate;
    private LocalDate endDate;
    private String subject;
    private String code;

    public Absence(UUID id, String code, String name, LocalDate startDate, LocalDate endDate, String subject) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.id = id;
        this.subject = subject;
        this.code = code;
    }
    public void setCode(String code){
        this.code = code;
    }
    public String getCode(){
        return code;
    }
}