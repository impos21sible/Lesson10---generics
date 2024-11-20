// Validation Rule classes remain the same as in your code
public abstract class ValidationRule {
    protected final Long value;
    private final String errorMessage;

    public ValidationRule(long value, String errorMessage) {
        this.value = value;
        this.errorMessage = errorMessage;
    }

    public abstract boolean isValid();

    public String getErrorMessage() {
        return errorMessage;
    }
}