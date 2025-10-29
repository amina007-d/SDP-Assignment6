package strategypattern;

import strategypattern.context.PaymentContext;
import strategypattern.concretestrategies.*;

public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setPaymentStrategy(new CreditCardPayment("1294785653217745"));
        context.executePayment(10000.0f);

        context.setPaymentStrategy(new ApplePayPayment("dosanamina@gmail.com"));
        context.executePayment(1000.0f);

        context.setPaymentStrategy(new KaspiPayPayment("+77082963374"));
        context.executePayment(1200.0f);
        
    }
}
