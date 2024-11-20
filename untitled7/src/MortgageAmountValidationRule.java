public class MortgageAmountValidationRule extends ValidationRule {
    public MortgageAmountValidationRule(Long value) {
        super(value, "Минимальный размер ипотеки - 1.000.000, а максимальный - 10.000.000");
    }

    @Override
    public boolean isValid() {
        return value >= 1000000 && value <= 10000000;
    }
}