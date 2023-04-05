package com.github.BankAccount.Four04.DomainModel.Holder.DataHolder;

import com.github.BankAccount.Four04.DomainModel.Holder.HolderException.HolderException;

public class PhoneNumber {
    private String number;

    public PhoneNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        if(number.equalsIgnoreCase(this.number)){
            throw new HolderException("The Phone number cannot be the same as the previous one!.");
        }
        this.number = number;
    }
}
