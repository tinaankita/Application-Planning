package usecases;

import datatransferobjects.ScheduleDTO;
import datatransferobjects.response;
import entities.Schedule;
import gateways.iRepository;

public class ScheduleInteractor {
    private iRepository<Schedule> repository;

    public ScheduleInteractor(iRepository repository){
        this.repository = repository;
    }
}
