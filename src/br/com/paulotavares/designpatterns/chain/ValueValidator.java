package br.com.paulotavares.designpatterns.chain;

public class ValueValidator extends Handler {

    @Override
    public void handle(Order order) {

        if (order.getValue() <= 0) {
            System.out.println("Pedido inválido: valor do pedido deve ser maior que zero.");
            return;
        }

        System.out.println("Valor válido.");
        handleNext(order);
    }
}
