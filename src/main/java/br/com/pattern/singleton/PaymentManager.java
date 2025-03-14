package br.com.pattern.singleton;

public class PaymentManager {
    private static PaymentManager instancia;

    private PaymentManager() {}

    public static PaymentManager getInstance() {
        if (instancia == null) {
            instancia = new PaymentManager();
        }
        return instancia;
    }

    public void processPayment(String type, double amount) {
        System.out.println("Gerenciando pagamento do tipo: " + type + " no valor de: R$" + amount);
    }
}