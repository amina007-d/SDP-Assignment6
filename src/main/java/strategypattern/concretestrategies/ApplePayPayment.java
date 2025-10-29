package strategypattern.concretestrategies;

import strategypattern.strategy.PaymentStrategy;

public class ApplePayPayment implements PaymentStrategy {
    private String appleId;

    public ApplePayPayment(String appleId) {
        setAppleId(appleId);
    }

    public void setAppleId(String appleId) {
        if (appleId == null || !appleId.contains("@"))
            throw new IllegalArgumentException("Invalid Apple ID (must contain '@')");
        this.appleId = appleId;
    }

    @Override
    public void pay(float amount) {
        System.out.println("Paid via Apple Pay: " + appleId);
    }
}
