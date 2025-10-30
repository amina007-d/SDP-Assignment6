package strategypattern.concretestrategies;

import strategypattern.strategy.IPaymentStrategy;

public class CreditCardPayment implements IPaymentStrategy {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        setCardNumber(cardNumber);
    }

    public void setCardNumber(String cardNumber) {
        if (cardNumber == null || cardNumber.length() != 16)
            throw new IllegalArgumentException("Card number must be 16 digits!");
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(float amount) {
        System.out.println("Paid using Credit Card (****"
                + cardNumber.substring(12) + ")");
    }
}
