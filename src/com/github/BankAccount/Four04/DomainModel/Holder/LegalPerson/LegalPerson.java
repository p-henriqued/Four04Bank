package com.github.BankAccount.Four04.DomainModel.Holder.LegalPerson;

import com.github.BankAccount.Four04.DomainModel.Holder.DataHolder.Adress;
import com.github.BankAccount.Four04.DomainModel.Holder.DataHolder.Email;
import com.github.BankAccount.Four04.DomainModel.Holder.DataHolder.PhoneNumber;
import com.github.BankAccount.Four04.DomainModel.Holder.Holder;

public class LegalPerson extends Holder {

    public LegalPerson(String name, Email email, PhoneNumber phoneNumber, Adress adress) {
        super(name, email, phoneNumber, adress);
    }

}
