package com.patterns.templatemethod.interfaces;

public record PaymentRecord(String orderId, int amount, int fee, boolean success, String note) {
}
