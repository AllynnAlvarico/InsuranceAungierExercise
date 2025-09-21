package AllynnAlvarico.model;

public class Policy{

    private Long policyId;
    private Driver driver;
    private Car car;
    private float premium;
    private int numberOfClaim;
    public Policy(Long id, Driver driver, Car car, float premium, int numberOfClaim){
        this.policyId = id;
        this.driver = driver;
        this.car = car;
        this.premium = premium;
        this.numberOfClaim = numberOfClaim;
    }
    public void setPolicyId(Long id) {
        this.policyId = id;
    }
    public void setDriver(Driver driver) {
        this.driver = driver;
    }
    public void setCar(Car car) {
        this.car = car;
    }
    public void setPremium(float premium) {
        this.premium = premium;
    }
    public void setNumberOfClaim(int numberOfClaim) {
        this.numberOfClaim = numberOfClaim;
    }

    public Long getPolicyId() {
        return policyId;
    }
    public Driver getDriver() {
        return driver;
    }
    public Car getCar() {
        return car;
    }
    public float getPremium() {
        return premium;
    }
    public int getNumberOfClaim() {
        return numberOfClaim;
    }
}
