package br.com.pattern;

import br.com.pattern.ContextStrategy.PaymentContext;
import br.com.pattern.InterfaceStrategy.PaymentStrategy;
import br.com.pattern.bsinessFactory.PaymentFactory;

public class Main {
    public static void main(String[] args) {

        System.out.println("Iniciando contexto de pagamento");

        // Usando o Factory Pattern para criar estratégias de pagamento
        PaymentStrategy creditCardPayment = PaymentFactory.createPayment("creditcard", "1234-5678-9012-3456", "João Silva");
        PaymentStrategy payPalPayment = PaymentFactory.createPayment("paypal", "joao.silva@example.com", null);

        // Usando o Strategy Pattern para processar pagamentos
        PaymentContext context1 = new PaymentContext(creditCardPayment);
        context1.executePayment(100.50);

        PaymentContext context2 = new PaymentContext(payPalPayment);
        context2.executePayment(200.75);
    }
}