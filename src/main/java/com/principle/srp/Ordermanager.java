package com.principle.srp;

import java.util.ArrayList;
import java.util.List;

public class Ordermanager {
    private List<Order> orders;

    public Ordermanager() {
        this.orders = new ArrayList<>();
    }

    public void createOrder(Order order) {
        this.orders.add(order);
    }
    public void removeOrder(Order order) {
        this.orders.remove(order);
    }

    public Order getOrder(int id){
        return orders.stream().filter(o -> o.getOrderId() == id).findFirst().orElseThrow();
    }

    public List<Order> getOrders() {
        return orders;
    }
}
