package com.patterns.templatemethod.interfaces.impl;

import com.patterns.templatemethod.interfaces.PaymentRecord;
import com.patterns.templatemethod.interfaces.Repository;

import java.util.ArrayList;
import java.util.List;

public final class InmemoryRepo implements Repository {

    public final List<PaymentRecord> store = new ArrayList();
    @Override
    public void save(PaymentRecord record) {
        store.add(record);
        System.out.println("[REPO] "+record);
    }
}
