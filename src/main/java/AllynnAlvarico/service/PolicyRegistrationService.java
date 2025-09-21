package AllynnAlvarico.service;

import AllynnAlvarico.enums.CountyIdentifier;
import AllynnAlvarico.model.Car;
import AllynnAlvarico.model.Driver;
import AllynnAlvarico.model.Policy;

import java.util.ArrayList;

public class PolicyRegistrationService {

    private final byte maxPoints = 12;
    private final float perAnnum = 0.05F;
    private ArrayList<Policy> policies = new ArrayList<>();
    private ArrayList<Driver> drivers = new ArrayList<>();
    private ArrayList<Car> cars = new ArrayList<>();
    public Policy newPolicy(Long id, Driver newDriver, Car car, float premium, int numberOfClaim) {
        return new Policy(id, newDriver, car, premium, numberOfClaim);
    }
    public void addPolicy(Policy policy){
        policies.add(policy);
    }
    public Driver registerDriver(String inputName, String inputSurname, String licenseNumber, String inputContacts, byte points){
        Driver driver;
        long id = 1L;
        id += drivers.size();
        driver = Driver.Builder.builder()
                .id(id)
                .licenseNumber(licenseNumber)
                .name(inputName)
                .surname(inputSurname)
                .contactNumber(inputContacts)
                .points(points)
                .build();
        drivers.add(driver);
        return driver;
    }
    public void deletePolicy(Policy policy) { /* ... */ }

    public void registerDriver(Driver driver){
        // unused at the moment
    }
    public Car registerCar(short sequenceNumber, String cc, String year, float engineSize, boolean pass) {
        long id = 0L;
        id += cars.size();
        String processedYear;
        if(year.length() >= 2){
            processedYear = year;
        } else {
            processedYear = year.substring(2);
        }
        return new Car(id, sequenceNumber, CountyIdentifier.getCountyIdentifier(cc), processedYear, engineSize, pass);
    }
    public int showTotalNumberOfClaims(){
        int totalNumber = 0;
        for (Policy policy : policies) {
            totalNumber += policy.getNumberOfClaim();
        }
        return totalNumber;
//        return policies.stream().filter(e -> e.getNumberOfClaim() > 0).mapToInt(Policy::getNumberOfClaim).sum();
    }
}
