package com.patterns.decorator2.example1.clientclass;

import com.patterns.decorator2.example1.component.PaymentGateway2;
import com.patterns.decorator2.example1.component.PaytmPaymentChannel;
import com.patterns.decorator2.example1.decoratorclass.BaseDecorator;
import com.patterns.decorator2.example1.decoratorimpls.LoginDecorator;
import com.patterns.decorator2.example1.decoratorimpls.MatrixDecorator;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class ClientExample {
    public static void main(String[] args) throws InterruptedException {
        PaymentGateway2 paymentGateway2 = new PaytmPaymentChannel();

        BaseDecorator decorator = new LoginDecorator(new MatrixDecorator(paymentGateway2));
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        IntStream.rangeClosed(1, 1000).forEach( c -> {
            executorService.submit( () -> decorator.processPayment(c));
                }
        );


    }
}
