package se.lexicon.simon.data;

import se.lexicon.simon.model.Car;

import java.util.*;

public class CarDaoImpl implements CarDao {

    private List<Car> carStorage;

    public CarDaoImpl(List<Car> carStorage) {
        this.carStorage = carStorage;
    }

    @Override
    public Car add(Car toAdd) {
        boolean wasChanged = false;
        if (toAdd != null){
           wasChanged = carStorage.add(toAdd);
        }

        if (wasChanged){
            return toAdd;
        }

        return null;
    }

    @Override
    public Car findById(Integer idToFind) {

        for (Car c : carStorage) {
            if (c.getId() == idToFind) {
                return c;
            }
        }

        return null;
    }

    @Override
    public Collection<Car> findAll() {
        return Collections.unmodifiableCollection(carStorage);
    }

    @Override
    public Car update(Car toUpdate) {

        Car original = findById(toUpdate.getId());
        if (original != null){
            original.setRegNumber(toUpdate.getRegNumber());
            original.setBrandName(toUpdate.getBrandName());
            original.setRegDate(toUpdate.getRegDate());
            original.setServiceHistory(toUpdate.getServiceHistory());
        }
        return toUpdate;
    }

    @Override
    public boolean delete(Car toDelete) {
        return carStorage.remove(toDelete);
    }
}
