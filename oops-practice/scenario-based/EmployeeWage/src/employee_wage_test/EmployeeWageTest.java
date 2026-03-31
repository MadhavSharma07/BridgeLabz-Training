package employee_wage_test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import employee_wage.EmpWageBuilder; 
class EmpWageBuilderTest {

    private EmpWageBuilder builder;

    @BeforeEach
    void setUp() {
        builder = new EmpWageBuilder();
        builder.addCompany("TCS", 20, 20, 100);
        builder.addCompany("Infosys", 25, 20, 100);
    }

    @Test
    void testComputeWage() {
        builder.computeWage();

        int tcsWage = builder.getTotalWage("TCS");
        int infosysWage = builder.getTotalWage("Infosys");

        assertTrue(tcsWage >= 0);
        assertTrue(infosysWage >= 0);
    }

    @Test
    void testTotalWageForExistingCompany() {
        builder.computeWage();

        int wage = builder.getTotalWage("TCS");

        assertNotEquals(0, wage);
    }

    @Test
    void testTotalWageForNonExistingCompany() {
        builder.computeWage();

        int wage = builder.getTotalWage("Wipro");

        assertEquals(0, wage);
    }
}
