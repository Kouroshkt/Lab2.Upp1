package com.example;

import net.bytebuddy.implementation.bytecode.Throw;

public class DummyBankService implements BankService {
    @Override
    public void pay(String id, double amount) {
        if (amount>5000){
            throw new RuntimeException("Ett fel har inträffat i myMethod!");
        }

    }
}
