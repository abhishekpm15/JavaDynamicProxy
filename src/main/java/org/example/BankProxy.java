package org.example;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class BankProxy implements InvocationHandler {

    private Bank bank;
    private int countOfDeposit;
    private int countOfWithdraw;

    public BankProxy(Bank bank, int countOfDeposit, int countOfWithdraw) {
        this.bank = bank;
        this.countOfDeposit = countOfDeposit;
        this.countOfWithdraw = countOfWithdraw;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//        System.out.println("Before invoking");
        System.out.println("\nLog details");
        if(method.getName().equals("deposit")){
            ++countOfDeposit;
        }
        if(method.getName().equals("withdraw")){
            ++countOfWithdraw;
        }
        Object result = method.invoke(bank,args);
//        System.out.println("After Invoking");
        System.out.println("Count of Deposit " + countOfDeposit);
        System.out.println("Count of Withdraw " + countOfWithdraw);
        return result;
    }
}
