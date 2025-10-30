package strategypattern.context;

import strategypattern.strategy.IPaymentStrategy;

public class PaymentContext {
    private IPaymentStrategy strategy;

    public void setPaymentStrategy(IPaymentStrategy strategy) {
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

