package Models;

import java.util.ArrayList;

public class User {
private String Name;
private String LastName;
private String personID;
private String BirthDate;
private Integer Number;
private String Password;
private Wallet  myWallet;

    public User() {
    }


    public User(String name, String lastName, String personID, String birthDate, Integer number, String password, Wallet myWallet) {
        Name = name;
        LastName = lastName;
        this.personID = personID;
        BirthDate = birthDate;
        Number = number;
        Password = password;
        this.myWallet = myWallet;
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getPersonID() {
        return personID;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }

    public String getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(String birthDate) {
        BirthDate = birthDate;
    }

    public Integer getNumber() {
        return Number;
    }

    public void setNumber(Integer number) {
        Number = number;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public Wallet getMyWallet() {
        return myWallet;
    }

    public void setMyWallet(Wallet myWallet) {
        this.myWallet = myWallet;
    }


}
