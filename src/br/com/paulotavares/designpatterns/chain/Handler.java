package br.com.paulotavares.designpatterns.chain;

public abstract class Handler {

    private Handler next;

    public Handler setNext(Handler next) {
        this.next = next;
        return next;
    }

    public abstract void handle(Order order);

    protected void handleNext(Order order) {
        if (next != null) {
            next.handle(order);
        }
    }
}