package se.lexicon.simon.data;

import se.lexicon.simon.model.Car;

import java.util.Collection;

public interface CarDao extends BasicDaoCrud<Car,Integer> {

    Collection<Car> findAllCarsByBrand(String brand);




}
