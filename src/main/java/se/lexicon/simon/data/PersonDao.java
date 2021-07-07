package se.lexicon.simon.data;

import se.lexicon.simon.model.Person;

import java.util.Collection;

public interface PersonDao extends BasicDaoCrud<Person, Integer>{

    Collection<Person> findByName(String name);



}
