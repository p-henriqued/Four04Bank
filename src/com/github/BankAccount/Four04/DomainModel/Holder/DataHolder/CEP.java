package com.github.BankAccount.Four04.DomainModel.Holder.DataHolder;

import com.github.BankAccount.Four04.DomainModel.Holder.HolderException.HolderException;

public class CEP {
    private String cep;

    public CEP(String cep) {
        if(validationCep(cep)){
            throw new HolderException("Invalid CEP.");
        }
        this.cep = cep;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        if(validationCep(cep)){
            throw new HolderException("Invalid CEP.");
        }
        this.cep = cep;
    }
    private Boolean validationCep(String cep){
        if(cep.length() == 8){
            return false;
        }
        return true;
    }
}
