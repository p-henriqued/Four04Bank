package com.github.BankAccount.Four04.DomainModel.Holder.PhysicalPerson;

import com.github.BankAccount.Four04.DomainModel.Holder.DataHolder.Adress;
import com.github.BankAccount.Four04.DomainModel.Holder.DataHolder.Email;
import com.github.BankAccount.Four04.DomainModel.Holder.DataHolder.PhoneNumber;
import com.github.BankAccount.Four04.DomainModel.Holder.Holder;
import com.github.BankAccount.Four04.DomainModel.Holder.PhysicalPerson.Data.CPF;

public class PhysicalPerson extends Holder {
    private CPF cpf;
    public PhysicalPerson(String name, Email email, PhoneNumber phoneNumber, Adress adress) {
        super(name, email, phoneNumber, adress);
    }
}
