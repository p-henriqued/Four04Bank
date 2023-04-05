package com.github.BankAccount.Four04.DomainModel.Holder;

import com.github.BankAccount.Four04.DomainModel.Holder.DataHolder.Adress;
import com.github.BankAccount.Four04.DomainModel.Holder.DataHolder.CEP;
import com.github.BankAccount.Four04.DomainModel.Holder.DataHolder.Email;
import com.github.BankAccount.Four04.DomainModel.Holder.DataHolder.PhoneNumber;

public class FactoryHolder {

    public FactoryHolder(String name, String email, String phoneNumber,
                         String cep, String street, Integer number, String city, String state){
        Holder holder = new Holder(name, new Email(email), new PhoneNumber(phoneNumber),
                new Adress(new CEP(cep), street, number, city, state) );
    }

}
