package employee_wage;

public interface BuilderInterface {
	void addCompany(String name, int wagePerHour, int maxDays, int maxHours);
    void computeWage();
    int getTotalWage(String name);
}
