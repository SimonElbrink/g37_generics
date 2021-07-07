package se.lexicon.simon.data;

import java.util.Collection;

public interface BasicDaoCrud<T, ID> {
    //Create, read, update, delete

    T add(T toAdd);
    T findById(ID idToFind);
    Collection<T> findAll();
    T update(T toUpdate);
    boolean delete(T toDelete);

}
