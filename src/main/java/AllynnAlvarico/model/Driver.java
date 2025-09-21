package AllynnAlvarico.model;

public record Driver(Long id, String licenseNumber, String name, String surname, byte points, String contactNumber) {
    public static class Builder {
        private Long id;
        private String licenseNumber;
        private String name;
        private String surname;
        private byte points;
        private String contactNumber;

        public static Builder builder() {
            return new Builder();
        }

        public Builder id(Long id) {this.id = id; return this;}
        public Builder licenseNumber(String licenseNumber) {this.licenseNumber = licenseNumber; return this;}
        public Builder name(String name) {this.name = name; return this;}
        public Builder surname(String surname) {this.surname = surname; return this;}
        public Builder points(byte points) {this.points = points; return this;}
        public Builder contactNumber(String contactNumber) {this.contactNumber = contactNumber; return this;}
        public Driver build(){
            return new Driver(this.id, this.licenseNumber, this.name, this.surname, this.points, this.contactNumber);
        }
    }

    public String fullName(){
        return name + " " + surname;
    }
    @Override
    public Long id() {
        return id;
    }
    @Override
    public String licenseNumber() {
        return licenseNumber;
    }
    @Override
    public String name() {
        return name;
    }
    @Override
    public String surname() {
        return surname;
    }
    @Override
    public byte points() {
        return points;
    }
    @Override
    public String contactNumber() {
        return contactNumber;
    }
    @Override
    public String toString() {
        return "Driver{" +
                "id=" + id +
                ", licenseNumber=" + licenseNumber +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", points=" + points +
                ", contactNumber='" + contactNumber + '\'' +
                '}';
    }
}
