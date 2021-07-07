package se.lexicon.simon.model;

import java.time.LocalDate;
import java.util.Objects;

public class Car implements Comparable<Car>{

    private int id;
    private String regNumber;
    private LocalDate regDate;
    private String brandName;

    private ServiceHistory serviceHistory;

    public int getId() {
        return id;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public LocalDate getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDate regDate) {
        this.regDate = regDate;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public ServiceHistory getServiceHistory() {
        return serviceHistory;
    }

    public void setServiceHistory(ServiceHistory serviceHistory) {
        this.serviceHistory = serviceHistory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id && regNumber.equals(car.regNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, regNumber);
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", regNumber='" + regNumber + '\'' +
                ", regDate=" + regDate +
                ", brandName='" + brandName + '\'' +
                ", serviceHistory=" + serviceHistory +
                '}';
    }

    /**
     * Actually not doing that much.
     * @param o
     * @return
     */
    @Override
    public int compareTo(Car o) {
        return 0;
    }
}
