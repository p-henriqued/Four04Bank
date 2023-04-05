package com.github.BankAccount.Four04.DomainModel.Holder.DataHolder;

public class Adress {
    private CEP cep;
    private String street;
    private Integer number;
    private String city;
    private String state;

    public Adress(CEP cep, String street, Integer number, String city, String state) {
        this.cep = cep;
        this.street = street;
        this.number = number;
        this.city = city;
        this.state = state;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStreet() {
        return street;
    }

    public Integer getNumber() {
        return number;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }
}
