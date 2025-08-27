package creationalPatterns.builder;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

// Product - Complex Payment object
public class PaymentRequest {
    private final String paymentId;
    private final String merchantId;
    private final BigDecimal amount;
    private final String currency;
    private final String paymentMethod;
    private final Map<String, String> metadata;
    private final String description;
    private final String callbackUrl;
    private final boolean isRecurring;
    private final LocalDateTime scheduledAt;
    private final PaymentSecurityLevel securityLevel;

    // Private constructor - only builder can create instances
    private PaymentRequest(Builder builder) {
        this.paymentId = builder.paymentId;
        this.merchantId = builder.merchantId;
        this.amount = builder.amount;
        this.currency = builder.currency;
        this.paymentMethod = builder.paymentMethod;
        this.metadata = builder.metadata != null ? new HashMap<>(builder.metadata) : new HashMap<>();
        this.description = builder.description;
        this.callbackUrl = builder.callbackUrl;
        this.isRecurring = builder.isRecurring;
        this.scheduledAt = builder.scheduledAt;
        this.securityLevel = builder.securityLevel;
    }

    // Getters
    public String getPaymentId() { return paymentId; }
    public String getMerchantId() { return merchantId; }
    public BigDecimal getAmount() { return amount; }
    public String getCurrency() { return currency; }
    public String getPaymentMethod() { return paymentMethod; }
    public Map<String, String> getMetadata() { return new HashMap<>(metadata); }
    public String getDescription() { return description; }
    public String getCallbackUrl() { return callbackUrl; }
    public boolean isRecurring() { return isRecurring; }
    public LocalDateTime getScheduledAt() { return scheduledAt; }
    public PaymentSecurityLevel getSecurityLevel() { return securityLevel; }

    @Override
    public String toString() {
        return String.format("PaymentRequest{id='%s', amount=%s %s, method='%s', merchant='%s'}",
                paymentId, amount, currency, paymentMethod, merchantId);
    }

    // Static method to get builder
    public static Builder builder() {
        return new Builder();
    }

    // Builder class
    public static class Builder {
        private String paymentId;
        private String merchantId;
        private BigDecimal amount;
        private String currency = "USD"; // Default
        private String paymentMethod;
        private Map<String, String> metadata;
        private String description;
        private String callbackUrl;
        private boolean isRecurring = false; // Default
        private LocalDateTime scheduledAt;
        private PaymentSecurityLevel securityLevel = PaymentSecurityLevel.STANDARD; // Default

        // Required fields
        public Builder paymentId(String paymentId) {
            this.paymentId = paymentId;
            return this;
        }

        public Builder merchantId(String merchantId) {
            this.merchantId = merchantId;
            return this;
        }

        public Builder amount(BigDecimal amount) {
            this.amount = amount;
            return this;
        }

        public Builder paymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }

        // Optional fields with fluent interface
        public Builder currency(String currency) {
            this.currency = currency;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder callbackUrl(String callbackUrl) {
            this.callbackUrl = callbackUrl;
            return this;
        }

        public Builder recurring(boolean isRecurring) {
            this.isRecurring = isRecurring;
            return this;
        }

        public Builder scheduledAt(LocalDateTime scheduledAt) {
            this.scheduledAt = scheduledAt;
            return this;
        }

        public Builder securityLevel(PaymentSecurityLevel securityLevel) {
            this.securityLevel = securityLevel;
            return this;
        }

        public Builder addMetadata(String key, String value) {
            if (this.metadata == null) {
                this.metadata = new HashMap<>();
            }
            this.metadata.put(key, value);
            return this;
        }

        public Builder metadata(Map<String, String> metadata) {
            this.metadata = metadata != null ? new HashMap<>(metadata) : null;
            return this;
        }

        // Build method with validation
        public PaymentRequest build() {
            // Validation
            if (paymentId == null || paymentId.trim().isEmpty()) {
                throw new IllegalArgumentException("Payment ID is required");
            }
            if (merchantId == null || merchantId.trim().isEmpty()) {
                throw new IllegalArgumentException("Merchant ID is required");
            }
            if (amount == null || amount.compareTo(BigDecimal.ZERO) <= 0) {
                throw new IllegalArgumentException("Amount must be positive");
            }
            if (paymentMethod == null || paymentMethod.trim().isEmpty()) {
                throw new IllegalArgumentException("Payment method is required");
            }
            if (currency == null || currency.length() != 3) {
                throw new IllegalArgumentException("Currency must be a 3-letter code");
            }

            return new PaymentRequest(this);
        }
    }
}
