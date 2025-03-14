package br.com.pattern.decorator;

import br.com.pattern.InterfaceStrategy.PaymentStrategy;

public class LogPaymentDecorator extends PaymentDecorator {
    public LogPaymentDecorator(PaymentStrategy paymentStrategy) {
        super(paymentStrategy);
    }

    @Override
    public void pay(double amount) {
        System.out.println("Iniciando pagamento de R$" + amount);
        super.pay(amount);
        System.out.println("Pagamento concluído");
    }
}