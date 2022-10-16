package gateways;
import entities.Entity;

import java.util.UUID;
import java.util.function.Predicate;


public interface iRepository<A> {
    void addEntity(A entity);
    A getById(UUID id);
    A searchBy (Predicate<? super A> p);
}
