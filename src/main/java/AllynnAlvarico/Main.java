package AllynnAlvarico;

import AllynnAlvarico.enums.CountyIdentifier;
import AllynnAlvarico.model.Car;
import AllynnAlvarico.model.Driver;
import AllynnAlvarico.model.Policy;
import AllynnAlvarico.service.PolicyRegistrationService;
import AllynnAlvarico.utils.Input;

import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
    PolicyRegistrationService prs = new PolicyRegistrationService();
    Input input = new Input();
    public Main(){
//        Driver newDrive = driverDetails();
        Car newCar = carDetails();
//        System.out.println(newDrive.fullName() + " " + newDrive);
        System.out.println(newCar.getRegistrationNumber() + " " + newCar);
    }

    public Driver driverDetails(){
        String name;
        String surname;
        String license;
        String contact;
        byte points;
        System.out.println("Enter new Driver details:");
        name = input.driverName();
        surname = input.driverSurname();
        license = input.driverLicense();
        contact = input.driverContact();
        points = input.driverPoints();

        return prs.registerDriver(name, surname, license, contact, points);
    }
    public Car carDetails(){
        short sequenceNumber;
        String countyIdentifier;
        String year;
        float engineSize;
        boolean hasPass;
        System.out.println("Enter car details:");
        sequenceNumber = input.carSequence();
//        sequenceNumber = 1234;
        countyIdentifier = input.carCountyIdentity();
//        countyIdentifier = "Cork";
        year = input.carYearManufactured();
//        year = "2012";
        engineSize = input.carEngineSize();
//        engineSize = 2.0F;
        hasPass = input.carNCT();
        return prs.registerCar(sequenceNumber, countyIdentifier, year, engineSize, hasPass);
    }
//    public Policy policyDetail(){
//        return prs.newPolicy();
//    }
    public static void main(String[] args) {
        new Main();
    }
}