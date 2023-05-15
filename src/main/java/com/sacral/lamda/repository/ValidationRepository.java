@Repository
public interface ValidationRepository {

    // Method to check minimum and maximum sum assured
    public boolean checkSumAssured(double amount);

    // Method to check minimum and maximum age limits 
    public boolean checkAgeLimit(int age);

    // Method to check annual income of the member
    public boolean checkAnnualIncome(int income);

    // Method to display sum assured ranges
    public List<Double> getAllowedSumAssured();

    // Method to display policy tenure ranges
    public List<Integer> getAllowedPolicyTenure();

    // Method to check OTP authentication
    public boolean checkOTPAuthentication();

    // Method to check eligibility of the spouse
    public boolean checkSpouseEligibility();

}