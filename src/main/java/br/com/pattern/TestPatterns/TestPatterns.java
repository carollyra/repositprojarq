package br.com.pattern.TestPatterns;

import br.com.pattern.adapter.PaymentAdapter;
import br.com.pattern.businessStrategy.CreditCardPayment;
import br.com.pattern.decorator.LogPaymentDecorator;
import br.com.pattern.InterfaceStrategy.PaymentStrategy;
import br.com.pattern.singleton.PaymentManager;

public class TestPatterns {
    public static void main(String[] args) {
        System.out.println("Testando o Adapter:");
        CreditCardPayment creditCard = new CreditCardPayment("1234-5678-9876-5432", "Carol");
        PaymentStrategy adapter = new PaymentAdapter(creditCard);
        adapter.pay(500.0);

        System.out.println("\nTestando o Decorator:");
        PaymentStrategy paymentWithLog = new LogPaymentDecorator(adapter);
        paymentWithLog.pay(250.0);

        System.out.println("\nTestando o Singleton:");
        PaymentManager manager = PaymentManager.getInstance();
        manager.processPayment("creditcard", 750.0);
    }
}