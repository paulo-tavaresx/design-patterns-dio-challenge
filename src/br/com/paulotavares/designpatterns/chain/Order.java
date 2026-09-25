package br.com.paulotavares.designpatterns.chain;

public class Order {

    private final double value;
    private final boolean stockAvailable;
    private final boolean paymentApproved;

    public Order(double value, boolean stockAvailable, boolean paymentApproved) {
        this.value = value;
        this.stockAvailable = stockAvailable;
        this.paymentApproved = paymentApproved;
    }

    public double getValue() {
        return value;
    }

    public boolean isStockAvailable() {
        return stockAvailable;
    }

    public boolean isPaymentApproved() {
        return paymentApproved;
    }
}