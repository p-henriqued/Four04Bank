package com.github.BankAccount.Four04.DomainModel.Account.UIAccountRules;

public interface IAccountRules {
    public void setKey(String key);
    public void verifyPassword(String key, String keyAccount);


}
