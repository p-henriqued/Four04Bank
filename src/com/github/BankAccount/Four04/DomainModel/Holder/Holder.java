package com.github.BankAccount.Four04.DomainModel.Holder;

import com.github.BankAccount.Four04.DomainModel.Holder.DataHolder.Adress;
import com.github.BankAccount.Four04.DomainModel.Holder.DataHolder.Email;
import com.github.BankAccount.Four04.DomainModel.Holder.DataHolder.PhoneNumber;

public class Holder {
    private String name;
    private Email email;
    private PhoneNumber phoneNumber;
    private Adress adress;

    public Holder(String name, Email email, PhoneNumber phoneNumber, Adress adress) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public Email getEmail() {
        return email;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public Adress getAdress() {
        return adress;
    }
}
