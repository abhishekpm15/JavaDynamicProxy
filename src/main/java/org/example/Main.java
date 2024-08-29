package org.example;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {

        Bank tataBank = new TataBank();
        BankProxy bankHandler = new BankProxy(tataBank,0 ,0);
        Bank proxyInstance = (Bank) Proxy.newProxyInstance(Bank.class.getClassLoader(), new Class[] {Bank.class} , bankHandler);
        proxyInstance.deposit(1,1000);
        proxyInstance.withdraw(1,3000);
    }
}