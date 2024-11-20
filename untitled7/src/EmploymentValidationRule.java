public class EmploymentValidationRule extends ValidationRule {
    public EmploymentValidationRule(boolean employed) {
        super(employed ? 1 : 0, "Необходимо иметь постоянное место работы для подачи заявки");
    }

    @Override
    public boolean isValid() {
        return value == 1;
    }
}