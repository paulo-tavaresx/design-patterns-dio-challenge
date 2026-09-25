package br.com.paulotavares.designpatterns.chain;

public class PaymentValidator  extends Handler{

    @Override
    public void handle(Order order) {
        if (!order.isPaymentApproved()) {
            System.out.println("Pedido inválido: pagamento não aprovado.");
            return;
        }

        System.out.println("Pagamento aprovado.");
        handleNext(order);
    }
}
