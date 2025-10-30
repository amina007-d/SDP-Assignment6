package strategypattern.concretestrategies;

import strategypattern.strategy.IPaymentStrategy;

public class KaspiPayPayment implements IPaymentStrategy {
    private String phoneNumber;

    public KaspiPayPayment(String phoneNumber) {
        setPhoneNumber(phoneNumber);
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber == null || !phoneNumber.startsWith("+7"))
            throw new IllegalArgumentException("Kaspi number must start with +7");
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void pay(float amount) {
        System.out.println("Paid via Kaspi Pay (" + phoneNumber + ")");
    }
}
