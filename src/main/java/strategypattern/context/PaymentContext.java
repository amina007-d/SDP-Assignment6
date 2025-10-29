package strategypattern.context;

import strategypattern.strategy.PaymentStrategy;

public class PaymentContext {
    private PaymentStrategy strategy;

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void executePayment(float amount) {
        if (strategy == null) {
            System.out.println("Payment strategy is not selected!");
            return;
        }
        strategy.pay(amount);
    }
}

