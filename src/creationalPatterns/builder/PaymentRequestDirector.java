package creationalPatterns.builder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class PaymentRequestDirector {

    public PaymentRequest createQuickPayment(String paymentId, String merchantId,
                                             BigDecimal amount, String paymentMethod) {
        return PaymentRequest.builder()
                .paymentId(paymentId)
                .merchantId(merchantId)
                .amount(amount)
                .paymentMethod(paymentMethod)
                .description("Quick payment")
                .build();
    }

    public PaymentRequest createRecurringPayment(String paymentId, String merchantId,
                                                 BigDecimal amount, String paymentMethod,
                                                 String callbackUrl) {
        return PaymentRequest.builder()
                .paymentId(paymentId)
                .merchantId(merchantId)
                .amount(amount)
                .paymentMethod(paymentMethod)
                .recurring(true)
                .callbackUrl(callbackUrl)
                .securityLevel(PaymentSecurityLevel.ENHANCED)
                .description("Recurring subscription payment")
                .addMetadata("subscription", "true")
                .build();
    }

    public PaymentRequest createScheduledHighValuePayment(String paymentId, String merchantId,
                                                          BigDecimal amount, String paymentMethod,
                                                          LocalDateTime scheduledTime) {
        return PaymentRequest.builder()
                .paymentId(paymentId)
                .merchantId(merchantId)
                .amount(amount)
                .paymentMethod(paymentMethod)
                .scheduledAt(scheduledTime)
                .securityLevel(PaymentSecurityLevel.PREMIUM)
                .description("High-value scheduled payment")
                .addMetadata("risk_level", "high")
                .addMetadata("requires_approval", "true")
                .build();
    }
}
