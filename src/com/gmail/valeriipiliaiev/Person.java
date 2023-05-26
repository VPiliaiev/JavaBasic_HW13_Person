package com.gmail.valeriipiliaiev;

class Person {
    private String firstName;
    private String lastName;
    private String city;
    private String phoneNumber;

    public Person(String firstName, String lastName, String city, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.phoneNumber = phoneNumber;
    }

    public String personInfo() {
        return "Зателефонувати громадянинові " + firstName + " " + lastName +
                " з міста " + city + " можна за номером " + phoneNumber + ".";
    }
}

class Main {
    public static void main(String[] args) {
        Person firstPerson = new Person("Will", "Smith", "New York", "2936729462846");
        Person secondPerson = new Person("Jackie", "Chan", "Shanghai", "12312412412");
        Person thirdPerson = new Person("Sherlock", "Holmes", "London", "37742123513");
        System.out.println(firstPerson.personInfo());
        System.out.println(secondPerson.personInfo());
        System.out.println(thirdPerson.personInfo());
    }
}
