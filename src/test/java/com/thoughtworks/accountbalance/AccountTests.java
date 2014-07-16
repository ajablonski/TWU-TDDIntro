package com.thoughtworks.accountbalance;

import org.junit.Test;
import static org.junit.Assert.*;

public class AccountTests {
    @Test
    public void shouldIncreaseMyBalanceWhenIDepositMoney(){
        Account a = new Account(100);

        a.deposit(50);

        assertEquals(150, a.getBalance(), 0.001);
    }

    @Test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney(){
        Account a = new Account(100);

        a.withdraw(50);

        assertEquals(50, a.getBalance(), 0.001);
    }

    @Test
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){
        Account a = new Account(50);

        a.withdraw(100);

        assertEquals(50, a.getBalance(), 0.001);
    }
}
