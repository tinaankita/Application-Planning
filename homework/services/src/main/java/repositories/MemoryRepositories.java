package repositories;

import entities.Entity;
import gateways.iRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;


public class MemoryRepositories<A extends Entity> implements iRepository<A> {
    private List<A> entities = new ArrayList<>();
    public void chooseEntity(A entity){
        entities.contains(entity);
    }

    @Override
    public void addEntity(A entity) {
        entities.add(entity);
    }

    public A getById(UUID id){
        for (A e :entities){
            if (e.getId().equals(id)) return e;
        }
        return null;
    }

    @Override
    public A searchBy(Predicate<? super A> p) {
        return null;
    }

    public A searchByFilter(Predicate <? super A> p) {
        return entities.stream().filter(p).findAny().orElse(null);
    }
}
