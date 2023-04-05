package com.github.BankAccount.Four04.DomainModel.Holder.DataHolder;

import com.github.BankAccount.Four04.DomainModel.Holder.HolderException.HolderException;

public class Email {
    private String emailAdress;

    public Email(String emailAdress) {
        if(emailAdress == null || !emailAdress.matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")){
            throw new HolderException("Invalid e-mail.");
        }
        this.emailAdress = emailAdress;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        if(emailAdress == null || !emailAdress.matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")){
            throw new HolderException("Invalid e-mail.");
        }
        if(emailAdress.equalsIgnoreCase(this.getEmailAdress())){
            throw new HolderException("The email cannot be the same as the previous one!.");
        }
        this.emailAdress = emailAdress;
    }
}
