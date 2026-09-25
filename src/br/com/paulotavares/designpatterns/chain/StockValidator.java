package br.com.paulotavares.designpatterns.chain;

public class StockValidator extends Handler {

    @Override
    public void handle(Order order) {

        if (!order.isStockAvailable()) {
            System.out.println("Pedido inválido: produto sem estoque.");
            return;
        }

        System.out.println("Estoque disponível.");

        handleNext(order);
    }
}
