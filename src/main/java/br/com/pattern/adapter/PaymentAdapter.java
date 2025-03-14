package br.com.pattern.adapter;

import br.com.pattern.businessStrategy.CreditCardPayment;
import br.com.pattern.InterfaceStrategy.PaymentStrategy;

public class PaymentAdapter implements PaymentStrategy {
    private final CreditCardPayment creditCardPayment;

    public PaymentAdapter(CreditCardPayment creditCardPayment) {
        this.creditCardPayment = creditCardPayment;
    }

    @Override
    public void pay(double amount) {
        creditCardPayment.pay(amount);
    }
}