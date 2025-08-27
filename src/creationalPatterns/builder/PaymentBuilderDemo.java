package creationalPatterns.builder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class PaymentBuilderDemo {
    public static void main(String[] args) {
        // Direct builder usage
        PaymentRequest simplePayment = PaymentRequest.builder()
                .paymentId("PAY-001")
                .merchantId("MERCHANT-123")
                .amount(new BigDecimal("99.99"))
                .paymentMethod("CREDIT_CARD")
                .currency("USD")
                .description("Product purchase")
                .build();

        // Complex payment with all options
        PaymentRequest complexPayment = PaymentRequest.builder()
                .paymentId("PAY-002")
                .merchantId("MERCHANT-456")
                .amount(new BigDecimal("1500.00"))
                .currency("EUR")
                .paymentMethod("BANK_TRANSFER")
                .description("Premium service subscription")
                .callbackUrl("https://api.example.com/webhooks/payment")
                .recurring(true)
                .securityLevel(PaymentSecurityLevel.PREMIUM)
                .addMetadata("customer_id", "CUST-789")
                .addMetadata("plan", "premium")
                .addMetadata("billing_cycle", "monthly")
                .scheduledAt(LocalDateTime.now().plusDays(1))
                .build();

        // Using Director for common patterns
        PaymentRequestDirector director = new PaymentRequestDirector();

        PaymentRequest quickPayment = director.createQuickPayment(
                "PAY-003", "MERCHANT-789", new BigDecimal("25.50"), "PAYPAL"
        );

        PaymentRequest recurringPayment = director.createRecurringPayment(
                "PAY-004", "MERCHANT-101", new BigDecimal("9.99"), "CREDIT_CARD",
                "https://api.example.com/webhooks/recurring"
        );

        PaymentRequest scheduledPayment = director.createScheduledHighValuePayment(
                "PAY-005", "MERCHANT-202", new BigDecimal("50000.00"), "WIRE_TRANSFER",
                LocalDateTime.now().plusWeeks(1)
        );

        // Print results
        System.out.println("Simple Payment: " + simplePayment);
        System.out.println("Complex Payment: " + complexPayment);
        System.out.println("Quick Payment: " + quickPayment);
        System.out.println("Recurring Payment: " + recurringPayment);
        System.out.println("Scheduled Payment: " + scheduledPayment);
    }
}
