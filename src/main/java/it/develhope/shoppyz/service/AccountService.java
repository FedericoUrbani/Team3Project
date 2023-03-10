package it.develhope.shoppyz.service;

import it.develhope.shoppyz.entity.Account;

import java.util.List;

public interface AccountService {

   public void sellsActivation(int id);

    public void disableAccount(int id);

    public void enableAccount(int id);

    public void doubleAuthenticationEnable(int id);

   public List<Account> listedAccounts(List<Account> list);

    List<Account> listedAccounts();
}
