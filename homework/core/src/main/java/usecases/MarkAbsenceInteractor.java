package usecases;

import datatransferobjects.MarkAbsenceDTO;
import datatransferobjects.response;
import entities.Absence;
import gateways.iRepository;
import java.util.ArrayList;
import java.util.UUID;

public class MarkAbsenceInteractor {
    private iRepository<Absence> repository;

    public MarkAbsenceInteractor(iRepository repository){
        this.repository = repository;
    }
    public response handle (MarkAbsenceDTO request){
        Absence absence = new Absence(UUID.randomUUID(), request.code, request.name, request.startDate, request.endDate,request.subject);
        repository.addEntity(absence);
        repository.searchBy(s -> s.getCode().equals(request.code));
        ArrayList<String> errors = new ArrayList<>();
        return new response(true, "Information added", errors);

    }
}
