package AllynnAlvarico.utils;

import java.util.Scanner;

public class Input {
    Scanner scanner = new Scanner(System.in);
    public Input(){}

    public String driverName(){
        System.out.println("Name:");
        return scanner.nextLine();
    }
    public String driverSurname(){
        System.out.println("Surname:");
        return scanner.nextLine();
    }
    public String driverLicense(){
        System.out.println("license Number:");
        return scanner.nextLine();
    }
    public String driverContact(){
        System.out.println("Contact Number:");
        return scanner.nextLine();
    }
    public byte driverPoints(){
        System.out.println("License Points:");
        return Byte.parseByte(scanner.nextLine());
    }
    public short carSequence(){
        System.out.println("Sequence Number:");
        return Short.parseShort(scanner.nextLine());
    }
    public String carCountyIdentity(){
        System.out.println("County Identifier:");
        return scanner.nextLine();
    }
    public String carYearManufactured(){
        System.out.println("Car year manufactured:");
        return scanner.nextLine();
    }
    public float carEngineSize(){
        System.out.println("Engine Size:");
        return Float.parseFloat(scanner.nextLine());
    }
    public boolean carNCT(){
        String userResponse;
        do {
            System.out.println("\ntype 'yes' or 'y' for pass. Type 'no' or 'n' ");
            System.out.println("Pass NCT:");
            userResponse = scanner.nextLine();
        } while (responseProcess(userResponse) >= 3);
        return responseProcess(userResponse) == 1;
    }
    public boolean hasPassed(int userResponse){
        return userResponse == 1;
    }
    public int responseProcess(String userResponse){
        if (userResponse.trim().equalsIgnoreCase("yes") | userResponse.trim().equalsIgnoreCase("y")){
            return 1;
        } else if (userResponse.trim().equalsIgnoreCase("no") | userResponse.trim().equalsIgnoreCase("n")) {
            return 0;
        } else {
            return 3;
        }
    }

}
