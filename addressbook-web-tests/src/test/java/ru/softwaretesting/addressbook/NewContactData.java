package ru.softwaretesting.addressbook;

public class NewContactData {
    private final String name;
    private final String patronimic;
    private final String surname;
    private final String AKA;
    private final String address;
    private final String mobile;
    private final String mail;
    private final String day;
    private final String month;
    private final String year;

    public NewContactData(String name, String patronimic, String surname, String AKA, String address, String mobile, String mail, String day, String month, String year) {
        this.name = name;
        this.patronimic = patronimic;
        this.surname = surname;
        this.AKA = AKA;
        this.address = address;
        this.mobile = mobile;
        this.mail = mail;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getPatronimic() {
        return patronimic;
    }

    public String getSurname() {
        return surname;
    }

    public String getAKA() {
        return AKA;
    }

    public String getAddress() {
        return address;
    }

    public String getMobile() {
        return mobile;
    }

    public String getMail() {
        return mail;
    }

    public String getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }

    public String getYear() {
        return year;
    }
}
