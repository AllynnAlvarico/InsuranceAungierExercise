package AllynnAlvarico.model;

import AllynnAlvarico.enums.CountyIdentifier;

public class Car {

    private Long id;
    private short sequenceNumber;
    private CountyIdentifier countyIdentifier;
    private String year;
    private float engineSize;
    private boolean passedNCT;

    public Car() {
    }

    public Car(Long id, short sequenceNumber, CountyIdentifier countyIdentifier, String year, float engineSize, boolean passedNCT) {
        this.id = id;
        this.sequenceNumber = sequenceNumber;
        this.countyIdentifier = countyIdentifier;
        this.year = year;
        this.engineSize = engineSize;
        this.passedNCT = passedNCT;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public void setSequenceNumber(short sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }
    public void setCountyIdentifier(CountyIdentifier countyIdentifier) {
        this.countyIdentifier = countyIdentifier;
    }
    public void setYear(String year) {
        this.year = year;
    }
    public void setEngineSize(float engineSize) {
        this.engineSize = engineSize;
    }
    public void setPassedNCT(boolean passedNCT) {
        this.passedNCT = passedNCT;
    }

    public Long getId() {
        return id;
    }
    public short getSequenceNumber() {
        return sequenceNumber;
    }
    public CountyIdentifier getCountyIdentifier() {
        return countyIdentifier;
    }
    public String getYear() {
        return year;
    }
    public float getEngineSize() {
        return engineSize;
    }
    public boolean isPassedNCT() {
        return passedNCT;
    }
    public String getRegistrationNumber(){
        return this.year + "-" + this.countyIdentifier.getIdentifier() + "-" + this.sequenceNumber;
    }
    public String toString(){
        return "Engine Size: " + this.engineSize + "\nNCT=" + this.passedNCT;
    }
}
