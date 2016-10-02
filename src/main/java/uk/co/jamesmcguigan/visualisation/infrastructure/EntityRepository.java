package uk.co.jamesmcguigan.visualisation.infrastructure;

public interface EntityRepository<T> {

    T find(Long id);
    T find(String name);
    T createOrUpdate(Entity entity);
}
