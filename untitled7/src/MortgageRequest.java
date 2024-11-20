public class MortgageRequest {
    private final String name;
    private final byte age;
    private final int amount;
    private final boolean employed;

    public MortgageRequest(String name, byte age, int amount, boolean employed) {
        this.name = name;
        this.age = age;
        this.amount = amount;
        this.employed = employed;
    }

    public void validate() {
        System.out.println("Проверка заявки ...");

        boolean result = true;

        // Creating a list of validation rules
        ValidationRule[] validationRules = new ValidationRule[] {
                new AgeValidationRule((long) age),
                new EmploymentValidationRule(employed),
                new MortgageAmountValidationRule((long) amount)
        };

        // Loop through validation rules and execute them
        for (ValidationRule rule : validationRules) {
            if (!rule.isValid()) {
                result = false;
                System.out.println(rule.getErrorMessage());
            }
        }

        if (result) {
            System.out.println(name + ", вам одобрена заявка на ипотеку!");
        } else {
            System.out.println(name + ", ваша заявка отклонена");
        }
    }
}